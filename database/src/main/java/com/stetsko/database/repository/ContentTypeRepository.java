package com.stetsko.database.repository;

import com.stetsko.database.entity.ContentType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentTypeRepository extends PagingAndSortingRepository<ContentType, Long> {
}