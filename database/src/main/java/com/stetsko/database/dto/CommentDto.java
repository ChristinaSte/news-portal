package com.stetsko.database.dto;

import com.stetsko.database.entity.CommentStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommentDto implements BaseDto<Long> {

    private Long id;
    private ContentDto content;
    private UserDto user;
    private String created;
    private String fullText;
    private CommentStatus commentStatus;
}