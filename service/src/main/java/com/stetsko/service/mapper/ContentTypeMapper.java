package com.stetsko.service.mapper;

import com.stetsko.database.dto.ContentTypeDto;
import jdk.jfr.ContentType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = Config.class)
public interface ContentTypeMapper {

    ContentTypeDto toContentTypeDto(ContentType contentType);

    @Mapping(target = "extraFields", ignore = true)
    @Mapping(target = "contents", ignore = true)
    ContentType fromContentTypeDto(ContentTypeDto dto);
}