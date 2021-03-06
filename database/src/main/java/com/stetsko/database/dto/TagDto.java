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
public class TagDto implements BaseDto<Long> {

    private Long id;
    private Lang lang;
    private String value;
}