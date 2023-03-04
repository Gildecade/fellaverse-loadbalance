package com.fellaverse.backend.mapper;

import com.fellaverse.backend.bean.User;
import com.fellaverse.backend.dto.UserLoginDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-01T18:02:23-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@Component
public class UserLoginMapperImpl implements UserLoginMapper {

    @Override
    public User toEntity(UserLoginDTO userLoginDTO) {
        if ( userLoginDTO == null ) {
            return null;
        }

        User user = new User();

        user.setPassword( userLoginDTO.getPassword() );
        user.setEmail( userLoginDTO.getEmail() );

        return user;
    }

    @Override
    public UserLoginDTO toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserLoginDTO userLoginDTO = new UserLoginDTO();

        userLoginDTO.setPassword( user.getPassword() );
        userLoginDTO.setEmail( user.getEmail() );

        return userLoginDTO;
    }

    @Override
    public User partialUpdate(UserLoginDTO userLoginDTO, User user) {
        if ( userLoginDTO == null ) {
            return user;
        }

        if ( userLoginDTO.getPassword() != null ) {
            user.setPassword( userLoginDTO.getPassword() );
        }
        if ( userLoginDTO.getEmail() != null ) {
            user.setEmail( userLoginDTO.getEmail() );
        }

        return user;
    }
}
