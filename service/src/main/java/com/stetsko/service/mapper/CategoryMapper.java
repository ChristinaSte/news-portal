package com.stetsko.service.mapper;

import com.stetsko.database.dto.CategoryDto;
import com.stetsko.database.dto.CategoryTranslationDto;
import com.stetsko.database.entity.Category;
import com.stetsko.database.entity.CategoryTranslation;
import com.stetsko.database.entity.Lang;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Map;

@Mapper(config = Config.class)
public interface CategoryMapper {

    @Mapping(target = "translations", ignore = true)
    CategoryDto toCategoryDto(Category category);

    @Mapping(target = "parentCategory", ignore = true)
    @Mapping(target = "contents", ignore = true)
    @Mapping(target = "childCategories", ignore = true)
    Category fromCategoryDto(CategoryDto dto);

    Map<Lang, CategoryTranslationDto> toCategoryTranslationDtoMap(Map<Lang, CategoryTranslation> translations);
}