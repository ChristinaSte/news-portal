package com.stetsko.database.repository;

import com.stetsko.database.entity.ExtraField;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExtraFieldRepository extends PagingAndSortingRepository<ExtraField, Long> {
}