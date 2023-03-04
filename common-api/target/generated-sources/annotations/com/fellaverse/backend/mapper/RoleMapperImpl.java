package com.fellaverse.backend.mapper;

import com.fellaverse.backend.bean.Role;
import com.fellaverse.backend.dto.RoleDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-01T18:02:23-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@Component
public class RoleMapperImpl implements RoleMapper {

    @Override
    public Role toEntity(RoleDTO roleDTO) {
        if ( roleDTO == null ) {
            return null;
        }

        Role role = new Role();

        role.setId( roleDTO.getId() );
        role.setRoleName( roleDTO.getRoleName() );
        role.setDescription( roleDTO.getDescription() );

        return role;
    }

    @Override
    public RoleDTO toDto(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleDTO roleDTO = new RoleDTO();

        roleDTO.setId( role.getId() );
        roleDTO.setRoleName( role.getRoleName() );
        roleDTO.setDescription( role.getDescription() );

        return roleDTO;
    }

    @Override
    public Role partialUpdate(RoleDTO roleDTO, Role role) {
        if ( roleDTO == null ) {
            return role;
        }

        if ( roleDTO.getId() != null ) {
            role.setId( roleDTO.getId() );
        }
        if ( roleDTO.getRoleName() != null ) {
            role.setRoleName( roleDTO.getRoleName() );
        }
        if ( roleDTO.getDescription() != null ) {
            role.setDescription( roleDTO.getDescription() );
        }

        return role;
    }
}
