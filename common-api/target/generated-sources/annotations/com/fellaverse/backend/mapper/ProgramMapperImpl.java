package com.fellaverse.backend.mapper;

import com.fellaverse.backend.bean.Program;
import com.fellaverse.backend.dto.ProgramDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-01T18:02:23-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@Component
public class ProgramMapperImpl implements ProgramMapper {

    @Override
    public Program toEntity(ProgramDTO programDTO) {
        if ( programDTO == null ) {
            return null;
        }

        Program program = new Program();

        program.setId( programDTO.getId() );
        program.setProgramName( programDTO.getProgramName() );

        return program;
    }

    @Override
    public ProgramDTO toDto(Program program) {
        if ( program == null ) {
            return null;
        }

        ProgramDTO programDTO = new ProgramDTO();

        programDTO.setId( program.getId() );
        programDTO.setProgramName( program.getProgramName() );

        return programDTO;
    }

    @Override
    public Program partialUpdate(ProgramDTO programDTO, Program program) {
        if ( programDTO == null ) {
            return program;
        }

        if ( programDTO.getId() != null ) {
            program.setId( programDTO.getId() );
        }
        if ( programDTO.getProgramName() != null ) {
            program.setProgramName( programDTO.getProgramName() );
        }

        return program;
    }
}
