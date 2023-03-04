package com.fellaverse.backend.mapper;

import com.fellaverse.backend.bean.User;
import com.fellaverse.backend.dto.UserBalanceStatusDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-01T18:02:23-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@Component
public class UserBalanceStatusMapperImpl implements UserBalanceStatusMapper {

    @Override
    public User toEntity(UserBalanceStatusDTO userBalanceStatusDTO) {
        if ( userBalanceStatusDTO == null ) {
            return null;
        }

        User user = new User();

        user.setId( userBalanceStatusDTO.getId() );
        user.setWallet( userBalanceStatusDTO.getWallet() );
        user.setStatus( userBalanceStatusDTO.getStatus() );

        return user;
    }

    @Override
    public UserBalanceStatusDTO toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserBalanceStatusDTO userBalanceStatusDTO = new UserBalanceStatusDTO();

        userBalanceStatusDTO.setId( user.getId() );
        userBalanceStatusDTO.setWallet( user.getWallet() );
        userBalanceStatusDTO.setStatus( user.getStatus() );

        return userBalanceStatusDTO;
    }

    @Override
    public User partialUpdate(UserBalanceStatusDTO userBalanceStatusDTO, User user) {
        if ( userBalanceStatusDTO == null ) {
            return user;
        }

        if ( userBalanceStatusDTO.getId() != null ) {
            user.setId( userBalanceStatusDTO.getId() );
        }
        if ( userBalanceStatusDTO.getWallet() != null ) {
            user.setWallet( userBalanceStatusDTO.getWallet() );
        }
        if ( userBalanceStatusDTO.getStatus() != null ) {
            user.setStatus( userBalanceStatusDTO.getStatus() );
        }

        return user;
    }
}
