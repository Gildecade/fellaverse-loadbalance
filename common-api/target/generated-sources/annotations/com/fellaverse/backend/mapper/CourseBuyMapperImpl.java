package com.fellaverse.backend.mapper;

import com.fellaverse.backend.bean.Course;
import com.fellaverse.backend.dto.CourseBuyDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-01T18:02:23-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@Component
public class CourseBuyMapperImpl implements CourseBuyMapper {

    @Override
    public Course toEntity(CourseBuyDTO courseBuyDTO) {
        if ( courseBuyDTO == null ) {
            return null;
        }

        Course course = new Course();

        course.setId( courseBuyDTO.getId() );
        course.setPrice( courseBuyDTO.getPrice() );
        course.setUserId( courseBuyDTO.getUserId() );

        return course;
    }

    @Override
    public CourseBuyDTO toDto(Course course) {
        if ( course == null ) {
            return null;
        }

        CourseBuyDTO courseBuyDTO = new CourseBuyDTO();

        courseBuyDTO.setId( course.getId() );
        courseBuyDTO.setUserId( course.getUserId() );
        courseBuyDTO.setPrice( course.getPrice() );

        return courseBuyDTO;
    }

    @Override
    public Course partialUpdate(CourseBuyDTO courseBuyDTO, Course course) {
        if ( courseBuyDTO == null ) {
            return course;
        }

        if ( courseBuyDTO.getId() != null ) {
            course.setId( courseBuyDTO.getId() );
        }
        if ( courseBuyDTO.getPrice() != null ) {
            course.setPrice( courseBuyDTO.getPrice() );
        }
        if ( courseBuyDTO.getUserId() != null ) {
            course.setUserId( courseBuyDTO.getUserId() );
        }

        return course;
    }
}
