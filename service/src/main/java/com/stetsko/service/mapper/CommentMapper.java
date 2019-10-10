package com.stetsko.service.mapper;

import com.stetsko.database.dto.CommentDto;
import com.stetsko.database.entity.Comment;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = Config.class)
public interface CommentMapper {

    @Mapping(target = "content", ignore = true)
    CommentDto toCommentDto(Comment comment);

    @InheritInverseConfiguration
    Comment fromCommentDto(CommentDto dto);
}