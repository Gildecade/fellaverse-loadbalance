package com.fellaverse.backend.mapper;

import com.fellaverse.backend.bean.AdminRole;
import com.fellaverse.backend.dto.AdminRoleDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-01T18:02:20-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@Component
public class AdminRoleMapperImpl implements AdminRoleMapper {

    @Override
    public AdminRole toEntity(AdminRoleDTO adminRoleDTO) {
        if ( adminRoleDTO == null ) {
            return null;
        }

        AdminRole adminRole = new AdminRole();

        return adminRole;
    }

    @Override
    public AdminRoleDTO toDto(AdminRole adminRole) {
        if ( adminRole == null ) {
            return null;
        }

        AdminRoleDTO adminRoleDTO = new AdminRoleDTO();

        return adminRoleDTO;
    }

    @Override
    public AdminRole partialUpdate(AdminRoleDTO adminRoleDTO, AdminRole adminRole) {
        if ( adminRoleDTO == null ) {
            return adminRole;
        }

        return adminRole;
    }
}
