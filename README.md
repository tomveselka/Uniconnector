## Uniconnector

### What is it?
REST APIs enabling user to check person in any of three government systems:

- [Stolen Documents database](https://aplikace.mvcr.cz/neplatne-doklady/)
- [Insolvency Register ("ISIR")](https://isir.justice.cz/isir/common/index.do)
- [Register of economic subjects ("ARES")](https://wwwinfo.mfcr.cz/ares/ares_es.html.cz)

All records of checks are stored in database using MySQL and can be retrieved via relevant endpoints with info on results of those checks.

This was just private project to increase my knowledge of REST, SOAP, Swagger, Postman and more

### What does it do
Complete documentation of endpoints can be found in .yaml file [here](/uniconnector.yaml)

Connector contains REST endpoints which can be called with parameters (ID type and number in case of Stolen Documents and IČO/RČ for ISIR and ARES depending on if it is FO or PO being checked.

Endpoints differ in scope of response

Simplest one is returning just string representing if person was found or not. This is often enough if fact that person has active executing disqualifies automaticaly

```json
N
```

Alternatively return can be json containing all the crucial info obtained from register.

```json
{
    "rc": null,
    "ico": "73475581",
    "found": "S",
    "active": "N",
    "state": "VYRIZENA",
    "link": "https://isir.justice.cz/isir/ueu/evidence_upadcu_detail.do?id=5780cd68-0904-4c62-90f5-56500a5e0291",
    "dateTimeOfVerification": "2021-10-26T23:03:11.018687300"
}
```
 &nbsp;

 &nbsp;

Most endpoints are GET, since there is always just one param passed, however, sometimes there can be multiple clients, each declaring multiple incomes and we want to check all clients in ISIR and all of their employers. 

For that, POST offers option of one API call covering all of this, like in following example:

**Request**

```json
{
  "clients": [
    {
      "employers": [
        {
          "ico": "28283953"
        },{
          "ico": "60701635"
        }
      ],
      "rc": "870712/1522"
    }
  ]
}
```

**Response**

```json
{
    "clients": [
        {
            "rc": "870712/1522",
            "found": "S",
            "active": "S",
            "state": "ODDLUŽENÍ",
            "link": "https://isir.justice.cz/isir/ueu/evidence_upadcu_detail.do?id=90329B0EC890304BE05333F21FACF9B9",
            "dateTimeOfVerification": "2021-10-26T23:13:29.310044600",
            "employers": [
                {
                    "ico": "28283953",
                    "found": "S",
                    "active": "N",
                    "state": "PRAVOMOCNA",
                    "link": "https://isir.justice.cz/isir/ueu/evidence_upadcu_detail.do?id=e6e8cc24-b712-4de6-a2aa-36f57ab65a96",
                    "dateTimeOfVerification": "2021-10-26T23:13:29.377051100"
                },
                {
                    "ico": "60701635",
                    "found": "N",
                    "active": null,
                    "state": null,
                    "link": null,
                    "dateTimeOfVerification": "2021-10-26T23:13:29.437016800"
                }
            ]
        }
    ]
}
```

In this example, one client had two employers. Result of verification was, that second employer is not in ISIR, however, both client and his first employer have some trouble with their finances.


## Records of verification

As was said in the opening, results of all verifications are stored and can be retrieved. Below is an example of records of verifications in all three of the registers
```json
 {
        "recordId": "PmDlBqwu2DN5tBMEO2zE",
        "identifierNumber": "213896446",
        "identifierType": "0",
        "found": "N",
        "checkedDatabase": "DOCS",
        "dateTimeOfVerification": "2021-07-11T18:47:08",
        "isir": null,
        "ares": null
    },
    {
        "recordId": "2G3r8oUfwSYowL0ZCyM6",
        "identifierNumber": "73475581",
        "identifierType": "ICO",
        "found": "S",
        "checkedDatabase": "ISIR",
        "dateTimeOfVerification": "2021-07-11T18:50:54",
        "isir": {
            "identifier": "73475581",
            "found": "S",
            "active": "S",
            "state": "ODDLUŽENÍ",
            "link": "https://isir.justice.cz/isir/ueu/evidence_upadcu_detail.do?id=5780cd68-0904-4c62-90f5-56500a5e0291"
        },
        "ares": null
    },
    {
        "recordId": "doSW0EIZh6AMjbidhGis",
        "identifierNumber": "00442704",
        "identifierType": "ICO",
        "found": "S",
        "checkedDatabase": "ARES",
        "dateTimeOfVerification": "2021-07-11T18:52:11",
        "isir": null,
        "ares": {
            "identifier": "00442704",
            "existsRZP": "N",
            "existsInsolvencniRejstrik": "N",
            "existsROB": "S",
            "existsDPH": "S",
            "exitsSpotrebniDan": "N",
            "existsEvidenceUpadcuKonkurz": "N",
            "existsEvidenceUpadcuVyrovnani": "N"
        }
    }
```

