package com.fellaverse.backend.mapper;

import com.fellaverse.backend.bean.CheckIn;
import com.fellaverse.backend.bean.User;
import com.fellaverse.backend.dto.CheckInDTO;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-01T18:02:23-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@Component
public class CheckInMapperImpl implements CheckInMapper {

    @Autowired
    private UserIdMapper userIdMapper;

    @Override
    public CheckIn toEntity(CheckInDTO checkInDTO) {
        if ( checkInDTO == null ) {
            return null;
        }

        CheckIn checkIn = new CheckIn();

        checkIn.setId( checkInDTO.getId() );
        checkIn.setUser( userIdMapper.toEntity( checkInDTO.getUser() ) );
        checkIn.setStartDateTime( checkInDTO.getStartDateTime() );
        checkIn.setEndDateTime( checkInDTO.getEndDateTime() );
        checkIn.setWeight( checkInDTO.getWeight() );

        return checkIn;
    }

    @Override
    public CheckInDTO toDto(CheckIn checkIn) {
        if ( checkIn == null ) {
            return null;
        }

        CheckInDTO checkInDTO = new CheckInDTO();

        checkInDTO.setId( checkIn.getId() );
        checkInDTO.setUser( userIdMapper.toDto( checkIn.getUser() ) );
        checkInDTO.setStartDateTime( checkIn.getStartDateTime() );
        checkInDTO.setEndDateTime( checkIn.getEndDateTime() );
        checkInDTO.setWeight( checkIn.getWeight() );

        return checkInDTO;
    }

    @Override
    public CheckIn partialUpdate(CheckInDTO checkInDTO, CheckIn checkIn) {
        if ( checkInDTO == null ) {
            return checkIn;
        }

        if ( checkInDTO.getId() != null ) {
            checkIn.setId( checkInDTO.getId() );
        }
        if ( checkInDTO.getUser() != null ) {
            if ( checkIn.getUser() == null ) {
                checkIn.setUser( new User() );
            }
            userIdMapper.partialUpdate( checkInDTO.getUser(), checkIn.getUser() );
        }
        if ( checkInDTO.getStartDateTime() != null ) {
            checkIn.setStartDateTime( checkInDTO.getStartDateTime() );
        }
        if ( checkInDTO.getEndDateTime() != null ) {
            checkIn.setEndDateTime( checkInDTO.getEndDateTime() );
        }
        if ( checkInDTO.getWeight() != null ) {
            checkIn.setWeight( checkInDTO.getWeight() );
        }

        return checkIn;
    }
}
