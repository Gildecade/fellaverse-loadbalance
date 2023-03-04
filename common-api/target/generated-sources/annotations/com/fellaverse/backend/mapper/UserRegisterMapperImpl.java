package com.fellaverse.backend.mapper;

import com.fellaverse.backend.bean.User;
import com.fellaverse.backend.dto.UserRegisterDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-01T18:02:23-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@Component
public class UserRegisterMapperImpl implements UserRegisterMapper {

    @Override
    public User toEntity(UserRegisterDTO userRegisterDTO) {
        if ( userRegisterDTO == null ) {
            return null;
        }

        User user = new User();

        user.setUsername( userRegisterDTO.getUsername() );
        user.setPassword( userRegisterDTO.getPassword() );
        user.setEmail( userRegisterDTO.getEmail() );
        user.setPhoneNumber( userRegisterDTO.getPhoneNumber() );

        return user;
    }

    @Override
    public UserRegisterDTO toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserRegisterDTO userRegisterDTO = new UserRegisterDTO();

        userRegisterDTO.setUsername( user.getUsername() );
        userRegisterDTO.setPassword( user.getPassword() );
        userRegisterDTO.setEmail( user.getEmail() );
        userRegisterDTO.setPhoneNumber( user.getPhoneNumber() );

        return userRegisterDTO;
    }

    @Override
    public User partialUpdate(UserRegisterDTO userRegisterDTO, User user) {
        if ( userRegisterDTO == null ) {
            return user;
        }

        if ( userRegisterDTO.getUsername() != null ) {
            user.setUsername( userRegisterDTO.getUsername() );
        }
        if ( userRegisterDTO.getPassword() != null ) {
            user.setPassword( userRegisterDTO.getPassword() );
        }
        if ( userRegisterDTO.getEmail() != null ) {
            user.setEmail( userRegisterDTO.getEmail() );
        }
        if ( userRegisterDTO.getPhoneNumber() != null ) {
            user.setPhoneNumber( userRegisterDTO.getPhoneNumber() );
        }

        return user;
    }
}
