package com.stetsko.database.repository;

import com.stetsko.database.entity.CategoryTranslation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryTranslationRepository extends CrudRepository<CategoryTranslation, CategoryTranslation.ComplexId> {
}
