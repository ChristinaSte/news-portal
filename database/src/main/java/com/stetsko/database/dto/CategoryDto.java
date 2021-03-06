package com.stetsko.database.dto;

import com.stetsko.database.entity.Lang;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto implements BaseDto<Long>{

    private Long id;
    private String alias;
    private String created;
    private Boolean active;
    @Builder.Default
    private Map<Lang, CategoryTranslationDto> translations = new HashMap<>();
}