package com.fellaverse.backend.mapper;

import com.fellaverse.backend.bean.CheckInId;
import com.fellaverse.backend.dto.CheckInIdDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-01T18:02:23-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@Component
public class CheckInIdMapperImpl implements CheckInIdMapper {

    @Override
    public CheckInId toEntity(CheckInIdDTO checkInIdDTO) {
        if ( checkInIdDTO == null ) {
            return null;
        }

        CheckInId checkInId = new CheckInId();

        checkInId.setId( checkInIdDTO.getId() );
        checkInId.setUserId( checkInIdDTO.getUserId() );

        return checkInId;
    }

    @Override
    public CheckInIdDTO toDto(CheckInId checkInId) {
        if ( checkInId == null ) {
            return null;
        }

        Long id = null;
        Long userId = null;

        id = checkInId.getId();
        userId = checkInId.getUserId();

        CheckInIdDTO checkInIdDTO = new CheckInIdDTO( id, userId );

        return checkInIdDTO;
    }

    @Override
    public CheckInId partialUpdate(CheckInIdDTO checkInIdDTO, CheckInId checkInId) {
        if ( checkInIdDTO == null ) {
            return checkInId;
        }

        if ( checkInIdDTO.getId() != null ) {
            checkInId.setId( checkInIdDTO.getId() );
        }
        if ( checkInIdDTO.getUserId() != null ) {
            checkInId.setUserId( checkInIdDTO.getUserId() );
        }

        return checkInId;
    }
}
