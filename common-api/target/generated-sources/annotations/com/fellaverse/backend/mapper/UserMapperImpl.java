package com.fellaverse.backend.mapper;

import com.fellaverse.backend.bean.User;
import com.fellaverse.backend.dto.UserDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-01T18:02:23-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toEntity(UserDTO user) {
        if ( user == null ) {
            return null;
        }

        User user1 = new User();

        user1.setId( user.getId() );
        user1.setUsername( user.getUsername() );
        user1.setPassword( user.getPassword() );
        user1.setEmail( user.getEmail() );
        user1.setPhoneNumber( user.getPhoneNumber() );
        user1.setWallet( user.getWallet() );
        user1.setStatus( user.getStatus() );

        return user1;
    }

    @Override
    public UserDTO toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( user.getId() );
        userDTO.setUsername( user.getUsername() );
        userDTO.setPassword( user.getPassword() );
        userDTO.setEmail( user.getEmail() );
        userDTO.setPhoneNumber( user.getPhoneNumber() );
        userDTO.setWallet( user.getWallet() );
        userDTO.setStatus( user.getStatus() );

        return userDTO;
    }

    @Override
    public User partialUpdate(UserDTO userDTO, User user) {
        if ( userDTO == null ) {
            return user;
        }

        if ( userDTO.getId() != null ) {
            user.setId( userDTO.getId() );
        }
        if ( userDTO.getUsername() != null ) {
            user.setUsername( userDTO.getUsername() );
        }
        if ( userDTO.getPassword() != null ) {
            user.setPassword( userDTO.getPassword() );
        }
        if ( userDTO.getEmail() != null ) {
            user.setEmail( userDTO.getEmail() );
        }
        if ( userDTO.getPhoneNumber() != null ) {
            user.setPhoneNumber( userDTO.getPhoneNumber() );
        }
        if ( userDTO.getWallet() != null ) {
            user.setWallet( userDTO.getWallet() );
        }
        if ( userDTO.getStatus() != null ) {
            user.setStatus( userDTO.getStatus() );
        }

        return user;
    }
}
