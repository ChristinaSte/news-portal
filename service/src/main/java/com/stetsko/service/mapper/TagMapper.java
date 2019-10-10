package com.stetsko.service.mapper;

import com.stetsko.database.dto.TagDto;
import com.stetsko.database.entity.Tag;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = Config.class)
public interface TagMapper {

    TagDto toTagDto(Tag tag);

    @Mapping(target = "contents", ignore = true)
    Tag fromTagDto(TagDto tag);
}