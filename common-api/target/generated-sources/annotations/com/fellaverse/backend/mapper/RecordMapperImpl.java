package com.fellaverse.backend.mapper;

import com.fellaverse.backend.bean.Exercise;
import com.fellaverse.backend.bean.Record;
import com.fellaverse.backend.bean.RecordId;
import com.fellaverse.backend.bean.User;
import com.fellaverse.backend.dto.RecordDTO;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-01T18:02:23-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@Component
public class RecordMapperImpl implements RecordMapper {

    @Autowired
    private RecordIdMapper recordIdMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ExerciseMapper exerciseMapper;

    @Override
    public Record toEntity(RecordDTO recordDTO) {
        if ( recordDTO == null ) {
            return null;
        }

        Record record = new Record();

        record.setId( recordIdMapper.toEntity( recordDTO.getId() ) );
        record.setUser( userMapper.toEntity( recordDTO.getUser() ) );
        record.setCreateDateTime( recordDTO.getCreateDateTime() );
        record.setWeights( recordDTO.getWeights() );
        record.setQuantity( recordDTO.getQuantity() );
        record.setNumOfSets( recordDTO.getNumOfSets() );
        record.setExercise( exerciseMapper.toEntity( recordDTO.getExercise() ) );

        return record;
    }

    @Override
    public RecordDTO toDto(Record record) {
        if ( record == null ) {
            return null;
        }

        RecordDTO recordDTO = new RecordDTO();

        recordDTO.setId( recordIdMapper.toDto( record.getId() ) );
        recordDTO.setUser( userMapper.toDto( record.getUser() ) );
        recordDTO.setCreateDateTime( record.getCreateDateTime() );
        recordDTO.setWeights( record.getWeights() );
        recordDTO.setQuantity( record.getQuantity() );
        recordDTO.setNumOfSets( record.getNumOfSets() );
        recordDTO.setExercise( exerciseMapper.toDto( record.getExercise() ) );

        return recordDTO;
    }

    @Override
    public Record partialUpdate(RecordDTO recordDTO, Record record) {
        if ( recordDTO == null ) {
            return record;
        }

        if ( recordDTO.getId() != null ) {
            if ( record.getId() == null ) {
                record.setId( new RecordId() );
            }
            recordIdMapper.partialUpdate( recordDTO.getId(), record.getId() );
        }
        if ( recordDTO.getUser() != null ) {
            if ( record.getUser() == null ) {
                record.setUser( new User() );
            }
            userMapper.partialUpdate( recordDTO.getUser(), record.getUser() );
        }
        if ( recordDTO.getCreateDateTime() != null ) {
            record.setCreateDateTime( recordDTO.getCreateDateTime() );
        }
        if ( recordDTO.getWeights() != null ) {
            record.setWeights( recordDTO.getWeights() );
        }
        if ( recordDTO.getQuantity() != null ) {
            record.setQuantity( recordDTO.getQuantity() );
        }
        if ( recordDTO.getNumOfSets() != null ) {
            record.setNumOfSets( recordDTO.getNumOfSets() );
        }
        if ( recordDTO.getExercise() != null ) {
            if ( record.getExercise() == null ) {
                record.setExercise( new Exercise() );
            }
            exerciseMapper.partialUpdate( recordDTO.getExercise(), record.getExercise() );
        }

        return record;
    }
}
