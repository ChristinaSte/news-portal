package com.stetsko.service.mapper;

import com.stetsko.database.dto.CommentDto;
import com.stetsko.database.dto.ContentDto;
import com.stetsko.database.dto.ContentTranslationDto;
import com.stetsko.database.dto.FullContentDto;
import com.stetsko.database.dto.TagDto;
import com.stetsko.database.entity.Comment;
import com.stetsko.database.entity.Content;
import com.stetsko.database.entity.ContentTranslation;
import com.stetsko.database.entity.Lang;
import com.stetsko.database.entity.Tag;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Map;

@Mapper(config = Config.class,
        uses = {
                ContentTypeMapper.class,
                CategoryMapper.class,
                UserMapper.class,
                TagMapper.class,
                CommentMapper.class
        })
public interface ContentMapper {

    ContentDto toContentDto(Content content);

    @Mapping(target = "comments", ignore = true)
    @Mapping(target = "tags", ignore = true)
    Content fromContentDto(ContentDto dto);

    FullContentDto toFullContentDto(Content content);

    Content fromFullContentDto(FullContentDto dto);

    Map<Lang, ContentTranslationDto> toTranslationsDto(Map<Lang, ContentTranslation> translations);

    List<CommentDto> toCommentDto(List<Comment> comments);

    List<TagDto> toTagDto(List<Tag> tags);

    @Mapping(target = "lang", source = "id.lang")
    ContentTranslationDto toContentTranslationDto(ContentTranslation contentTranslation);

    default ContentTranslation fromContentTranslationDto(ContentTranslationDto dto) {
        return ContentTranslation.builder()
                .id(ContentTranslation.ComplexId.builder()
                        .lang(dto.getLang())
                        .build())
                .title(dto.getTitle())
                .introText(dto.getIntroText())
                .fullText(dto.getFullText())
                .metaTitle(dto.getMetaTitle())
                .metaDescription(dto.getMetaDescription())
                .metaKeywords(dto.getMetaKeywords())
                .build();
    }
}