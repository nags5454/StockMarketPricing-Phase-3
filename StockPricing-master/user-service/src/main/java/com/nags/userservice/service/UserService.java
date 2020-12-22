package com.nags.userservice.service;

import com.nags.userservice.dto.UserDto;
import com.nags.userservice.entities.User;
import com.nags.userservice.exceptions.AccountActivationException;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Optional;



public interface UserService {

    Optional<UserDto> findById(@NotNull int id);

    Optional<UserDto> findByUsername(@Size(max = 25, min = 3)
                                     @NotNull
                                     @Pattern(regexp = "^[A-Za-z]*$") String username);

    public Iterable<UserDto> getAllUsers();

    Iterable<UserDto> getByName(String name);

    Optional<UserDto> findByEmailId(@Email String email);

    void saveCustomer(User user);

    void activate(String username, String email, int userId) throws AccountActivationException;
}
