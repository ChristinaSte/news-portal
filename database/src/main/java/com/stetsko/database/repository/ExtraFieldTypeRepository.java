package com.stetsko.database.repository;

import com.stetsko.database.entity.ExtraFieldType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExtraFieldTypeRepository extends PagingAndSortingRepository<ExtraFieldType, Long> {
}