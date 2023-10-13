package com.onlineapp.userinfo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.onlineapp.userinfo.dto.UserDTO;
import com.onlineapp.userinfo.entity.User;

@Mapper
public interface UserMapper {
	
	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
	
	User mapUserDTOToUser(UserDTO userDTO);
	UserDTO mapUserToUserDTO(User user);
	
}
