package com.tomveselka.uniconnector.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity(name = "isir")
public class ResultIsirEntity implements Serializable {

	private static final long serialVersionUID = -2850444583856523205L;

	@Id
	@Column(name = "summary_id")
	private long id;

	@Column(length = 50)
	private String identifier;
	
	// was anything found at all
	@Column(length = 50)
	private String result;
	
	// is Rizeni still active
	@Column(length = 50)
	private String active;
	
	// state of proceeding
	@Column(length = 50)
	private String state;
	
	// link to information about proceeding
	@Column(length = 50)
	private String link;
	
	@OneToOne
    @MapsId
    @JoinColumn(name = "summary_id")
	private ResultSummaryEntity summary;

}
