package com.stetsko.service.mapper;

import com.stetsko.database.dto.CategoryTranslationDto;
import com.stetsko.database.entity.CategoryTranslation;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = CategoryMapper.class)
public interface CategoryTranslationMapper {

    @Mapping(target = "id", ignore = true)
    CategoryTranslationDto toCategoryTranslationDto(CategoryTranslation categoryTranslation);

    @InheritInverseConfiguration
    CategoryTranslation fromCategoryTranslationDto(CategoryTranslationDto translationDto);
}