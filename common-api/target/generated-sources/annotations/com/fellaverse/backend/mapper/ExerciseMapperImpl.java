package com.fellaverse.backend.mapper;

import com.fellaverse.backend.bean.Exercise;
import com.fellaverse.backend.dto.ExerciseDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-01T18:02:23-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@Component
public class ExerciseMapperImpl implements ExerciseMapper {

    @Override
    public Exercise toEntity(ExerciseDTO exerciseDTO) {
        if ( exerciseDTO == null ) {
            return null;
        }

        Exercise exercise = new Exercise();

        exercise.setId( exerciseDTO.getId() );
        exercise.setExerciseName( exerciseDTO.getExerciseName() );

        return exercise;
    }

    @Override
    public ExerciseDTO toDto(Exercise exercise) {
        if ( exercise == null ) {
            return null;
        }

        ExerciseDTO exerciseDTO = new ExerciseDTO();

        exerciseDTO.setId( exercise.getId() );
        exerciseDTO.setExerciseName( exercise.getExerciseName() );

        return exerciseDTO;
    }

    @Override
    public Exercise partialUpdate(ExerciseDTO exerciseDTO, Exercise exercise) {
        if ( exerciseDTO == null ) {
            return exercise;
        }

        if ( exerciseDTO.getId() != null ) {
            exercise.setId( exerciseDTO.getId() );
        }
        if ( exerciseDTO.getExerciseName() != null ) {
            exercise.setExerciseName( exerciseDTO.getExerciseName() );
        }

        return exercise;
    }
}
