package com.tomveselka.uniconnector.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.tomveselka.uniconnector.entity.ResultSummaryEntity;

@Repository
public interface  ResultsRepository extends PagingAndSortingRepository<ResultSummaryEntity, Long>{
	ResultSummaryEntity findByRecordId(String recordId);
	List<ResultSummaryEntity> findByIdentifierNumber(String identifier);
}
