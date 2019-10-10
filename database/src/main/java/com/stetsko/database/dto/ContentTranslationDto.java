package com.stetsko.database.dto;

import com.stetsko.database.entity.Lang;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContentTranslationDto {

    private Lang lang;
    private String title;
    private String introText;
    private String fullText;
    private String metaTitle;
    private String metaDescription;
    private String metaKeywords;
}