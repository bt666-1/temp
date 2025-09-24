package com.rkvk.automobile.automobileshop.mapper;

import com.rkvk.automobile.automobileshop.dto.UserEmailDTO;
import com.rkvk.automobile.automobileshop.entity.UserEmail;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserEmailMapper {

    UserEmailMapper INSTANCE = Mappers.getMapper(UserEmailMapper.class);

    @Mapping(source = "id.userId", target = "userId")
    @Mapping(source = "id.email", target = "email")
    UserEmailDTO toDto(UserEmail userEmail);

    @Mapping(source = "userId", target = "id.userId")
    @Mapping(source = "email", target = "id.email")
    UserEmail toEntity(UserEmailDTO userEmailDTO);
}
