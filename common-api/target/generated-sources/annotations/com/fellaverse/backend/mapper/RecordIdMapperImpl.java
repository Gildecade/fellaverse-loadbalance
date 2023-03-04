package com.fellaverse.backend.mapper;

import com.fellaverse.backend.bean.RecordId;
import com.fellaverse.backend.dto.RecordIdDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-01T18:02:23-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@Component
public class RecordIdMapperImpl implements RecordIdMapper {

    @Override
    public RecordId toEntity(RecordIdDTO recordIdDTO) {
        if ( recordIdDTO == null ) {
            return null;
        }

        RecordId recordId = new RecordId();

        recordId.setId( recordIdDTO.getId() );
        recordId.setUserId( recordIdDTO.getUserId() );

        return recordId;
    }

    @Override
    public RecordIdDTO toDto(RecordId recordId) {
        if ( recordId == null ) {
            return null;
        }

        RecordIdDTO recordIdDTO = new RecordIdDTO();

        recordIdDTO.setId( recordId.getId() );
        recordIdDTO.setUserId( recordId.getUserId() );

        return recordIdDTO;
    }

    @Override
    public RecordId partialUpdate(RecordIdDTO recordIdDTO, RecordId recordId) {
        if ( recordIdDTO == null ) {
            return recordId;
        }

        if ( recordIdDTO.getId() != null ) {
            recordId.setId( recordIdDTO.getId() );
        }
        if ( recordIdDTO.getUserId() != null ) {
            recordId.setUserId( recordIdDTO.getUserId() );
        }

        return recordId;
    }
}
