package com.stetsko.database.repository;

import com.stetsko.database.entity.ContentTranslation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentTranslationRepository extends CrudRepository<ContentTranslation, ContentTranslation.ComplexId> {
}