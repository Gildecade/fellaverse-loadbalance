package com.fellaverse.backend.mapper;

import com.fellaverse.backend.bean.Admin;
import com.fellaverse.backend.dto.AdminDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-01T18:02:23-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@Component
public class AdminMapperImpl implements AdminMapper {

    @Override
    public Admin toEntity(AdminDTO adminDTO) {
        if ( adminDTO == null ) {
            return null;
        }

        Admin admin = new Admin();

        admin.setId( adminDTO.getId() );
        admin.setUsername( adminDTO.getUsername() );
        admin.setPassword( adminDTO.getPassword() );
        admin.setEmail( adminDTO.getEmail() );
        admin.setPhoneNumber( adminDTO.getPhoneNumber() );

        return admin;
    }

    @Override
    public AdminDTO toDto(Admin admin) {
        if ( admin == null ) {
            return null;
        }

        AdminDTO adminDTO = new AdminDTO();

        adminDTO.setId( admin.getId() );
        adminDTO.setUsername( admin.getUsername() );
        adminDTO.setPassword( admin.getPassword() );
        adminDTO.setEmail( admin.getEmail() );
        adminDTO.setPhoneNumber( admin.getPhoneNumber() );

        return adminDTO;
    }

    @Override
    public Admin partialUpdate(AdminDTO adminDTO, Admin admin) {
        if ( adminDTO == null ) {
            return admin;
        }

        if ( adminDTO.getId() != null ) {
            admin.setId( adminDTO.getId() );
        }
        if ( adminDTO.getUsername() != null ) {
            admin.setUsername( adminDTO.getUsername() );
        }
        if ( adminDTO.getPassword() != null ) {
            admin.setPassword( adminDTO.getPassword() );
        }
        if ( adminDTO.getEmail() != null ) {
            admin.setEmail( adminDTO.getEmail() );
        }
        if ( adminDTO.getPhoneNumber() != null ) {
            admin.setPhoneNumber( adminDTO.getPhoneNumber() );
        }

        return admin;
    }
}
