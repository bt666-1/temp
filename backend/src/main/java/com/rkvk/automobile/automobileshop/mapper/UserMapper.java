package com.rkvk.automobile.automobileshop.mapper;

import com.rkvk.automobile.automobileshop.dto.UserDTO;
import com.rkvk.automobile.automobileshop.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = { UserEmailMapper.class })
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    // entity -> dto
    UserDTO toDto(User user);

    // dto -> entity
    User toEntity(UserDTO userDto);
}
