package com.rkvk.automobile.automobileshop.mapper;

import com.rkvk.automobile.automobileshop.dto.UserMiddleNameDTO;
import com.rkvk.automobile.automobileshop.entity.UserMiddleName;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMiddleNameMapper {

    UserMiddleNameMapper INSTANCE = Mappers.getMapper(UserMiddleNameMapper.class);

    @Mapping(source = "id.userId", target = "userId")
    @Mapping(source = "id.middleName", target = "middleName")
    @Mapping(source = "middleNameOrder", target = "middleNameOrder")
    UserMiddleNameDTO toDto(UserMiddleName userMiddleName);

    @Mapping(source = "userId", target = "id.userId")
    @Mapping(source = "middleName", target = "id.middleName")
    @Mapping(source = "middleNameOrder", target = "middleNameOrder")
    UserMiddleName toEntity(UserMiddleNameDTO userMiddleNameDTO);
}
