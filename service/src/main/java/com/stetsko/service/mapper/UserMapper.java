package com.stetsko.service.mapper;

import com.stetsko.database.dto.UserDto;
import com.stetsko.database.dto.UserWithContentsDto;
import com.stetsko.database.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = Config.class)
public interface UserMapper {

    UserDto toUserDto(User user);

    @Mapping(target = "comments", ignore = true)
    User fromUserDto(UserDto dto);

    UserWithContentsDto toUserWithContentsDto(User user);

    User fromUserWithContentsDto(UserWithContentsDto dto);
}