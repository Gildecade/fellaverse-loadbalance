package com.fellaverse.backend.mapper;

import com.fellaverse.backend.bean.User;
import com.fellaverse.backend.dto.UserIdDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-01T18:02:23-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@Component
public class UserIdMapperImpl implements UserIdMapper {

    @Override
    public User toEntity(UserIdDTO userIdDTO) {
        if ( userIdDTO == null ) {
            return null;
        }

        User user = new User();

        user.setId( userIdDTO.getId() );

        return user;
    }

    @Override
    public UserIdDTO toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserIdDTO userIdDTO = new UserIdDTO();

        userIdDTO.setId( user.getId() );

        return userIdDTO;
    }

    @Override
    public User partialUpdate(UserIdDTO userIdDTO, User user) {
        if ( userIdDTO == null ) {
            return user;
        }

        if ( userIdDTO.getId() != null ) {
            user.setId( userIdDTO.getId() );
        }

        return user;
    }
}
