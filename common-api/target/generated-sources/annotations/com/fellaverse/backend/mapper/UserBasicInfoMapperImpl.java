package com.fellaverse.backend.mapper;

import com.fellaverse.backend.bean.User;
import com.fellaverse.backend.dto.UserBasicInfoDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-01T18:02:23-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@Component
public class UserBasicInfoMapperImpl implements UserBasicInfoMapper {

    @Override
    public User toEntity(UserBasicInfoDTO userBasicInfoDTO) {
        if ( userBasicInfoDTO == null ) {
            return null;
        }

        User user = new User();

        user.setId( userBasicInfoDTO.getId() );
        user.setUsername( userBasicInfoDTO.getUsername() );
        user.setEmail( userBasicInfoDTO.getEmail() );
        user.setPhoneNumber( userBasicInfoDTO.getPhoneNumber() );
        user.setWallet( userBasicInfoDTO.getWallet() );
        user.setStatus( userBasicInfoDTO.getStatus() );

        return user;
    }

    @Override
    public UserBasicInfoDTO toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserBasicInfoDTO userBasicInfoDTO = new UserBasicInfoDTO();

        userBasicInfoDTO.setId( user.getId() );
        userBasicInfoDTO.setUsername( user.getUsername() );
        userBasicInfoDTO.setEmail( user.getEmail() );
        userBasicInfoDTO.setPhoneNumber( user.getPhoneNumber() );
        userBasicInfoDTO.setWallet( user.getWallet() );
        userBasicInfoDTO.setStatus( user.getStatus() );

        return userBasicInfoDTO;
    }

    @Override
    public User partialUpdate(UserBasicInfoDTO userBasicInfoDTO, User user) {
        if ( userBasicInfoDTO == null ) {
            return user;
        }

        if ( userBasicInfoDTO.getId() != null ) {
            user.setId( userBasicInfoDTO.getId() );
        }
        if ( userBasicInfoDTO.getUsername() != null ) {
            user.setUsername( userBasicInfoDTO.getUsername() );
        }
        if ( userBasicInfoDTO.getEmail() != null ) {
            user.setEmail( userBasicInfoDTO.getEmail() );
        }
        if ( userBasicInfoDTO.getPhoneNumber() != null ) {
            user.setPhoneNumber( userBasicInfoDTO.getPhoneNumber() );
        }
        if ( userBasicInfoDTO.getWallet() != null ) {
            user.setWallet( userBasicInfoDTO.getWallet() );
        }
        if ( userBasicInfoDTO.getStatus() != null ) {
            user.setStatus( userBasicInfoDTO.getStatus() );
        }

        return user;
    }
}
