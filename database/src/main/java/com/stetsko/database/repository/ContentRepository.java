package com.stetsko.database.repository;

import com.stetsko.database.entity.Content;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepository extends PagingAndSortingRepository<Content, Long>, QuerydslPredicateExecutor<Content> {
}