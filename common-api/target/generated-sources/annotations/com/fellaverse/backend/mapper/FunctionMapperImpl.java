package com.fellaverse.backend.mapper;

import com.fellaverse.backend.bean.Function;
import com.fellaverse.backend.dto.FunctionIdNameDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-01T18:02:23-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@Component
public class FunctionMapperImpl implements FunctionMapper {

    @Override
    public Function toEntity(FunctionIdNameDTO functionIdNameDTO) {
        if ( functionIdNameDTO == null ) {
            return null;
        }

        Function function = new Function();

        function.setId( functionIdNameDTO.getId() );
        function.setFunctionName( functionIdNameDTO.getFunctionName() );

        return function;
    }

    @Override
    public FunctionIdNameDTO toDto(Function function) {
        if ( function == null ) {
            return null;
        }

        FunctionIdNameDTO functionIdNameDTO = new FunctionIdNameDTO();

        functionIdNameDTO.setId( function.getId() );
        functionIdNameDTO.setFunctionName( function.getFunctionName() );

        return functionIdNameDTO;
    }

    @Override
    public Function partialUpdate(FunctionIdNameDTO functionIdNameDTO, Function function) {
        if ( functionIdNameDTO == null ) {
            return function;
        }

        if ( functionIdNameDTO.getId() != null ) {
            function.setId( functionIdNameDTO.getId() );
        }
        if ( functionIdNameDTO.getFunctionName() != null ) {
            function.setFunctionName( functionIdNameDTO.getFunctionName() );
        }

        return function;
    }
}
