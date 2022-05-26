package com.restfulapi.restfulapiserver.service;

import com.restfulapi.restfulapiserver.shared.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto user);
    UserDto getUser(String email);
    UserDto getUserByUserId(String userId);
    UserDto updateUser(String userId, UserDto user);
    void    deleteUser(String userId);
    List<UserDto> getUsers(int page, int limit);
}
