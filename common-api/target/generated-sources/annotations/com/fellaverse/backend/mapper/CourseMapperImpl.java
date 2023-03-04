package com.fellaverse.backend.mapper;

import com.fellaverse.backend.bean.Course;
import com.fellaverse.backend.dto.CourseDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-01T18:02:23-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@Component
public class CourseMapperImpl implements CourseMapper {

    @Override
    public Course toEntity(CourseDTO courseDTO) {
        if ( courseDTO == null ) {
            return null;
        }

        Course course = new Course();

        course.setId( courseDTO.getId() );
        course.setProductName( courseDTO.getProductName() );
        course.setDescription( courseDTO.getDescription() );
        course.setImageUrl( courseDTO.getImageUrl() );
        course.setPrice( courseDTO.getPrice() );
        course.setCreatedDateTime( courseDTO.getCreatedDateTime() );
        course.setProductStatus( courseDTO.getProductStatus() );
        course.setVideoUrl( courseDTO.getVideoUrl() );
        course.setUserId( courseDTO.getUserId() );

        return course;
    }

    @Override
    public CourseDTO toDto(Course course) {
        if ( course == null ) {
            return null;
        }

        CourseDTO courseDTO = new CourseDTO();

        courseDTO.setId( course.getId() );
        courseDTO.setProductName( course.getProductName() );
        courseDTO.setDescription( course.getDescription() );
        courseDTO.setImageUrl( course.getImageUrl() );
        courseDTO.setPrice( course.getPrice() );
        courseDTO.setCreatedDateTime( course.getCreatedDateTime() );
        courseDTO.setProductStatus( course.getProductStatus() );
        courseDTO.setVideoUrl( course.getVideoUrl() );
        courseDTO.setUserId( course.getUserId() );

        return courseDTO;
    }

    @Override
    public Course partialUpdate(CourseDTO courseDTO, Course course) {
        if ( courseDTO == null ) {
            return course;
        }

        if ( courseDTO.getId() != null ) {
            course.setId( courseDTO.getId() );
        }
        if ( courseDTO.getProductName() != null ) {
            course.setProductName( courseDTO.getProductName() );
        }
        if ( courseDTO.getDescription() != null ) {
            course.setDescription( courseDTO.getDescription() );
        }
        if ( courseDTO.getImageUrl() != null ) {
            course.setImageUrl( courseDTO.getImageUrl() );
        }
        if ( courseDTO.getPrice() != null ) {
            course.setPrice( courseDTO.getPrice() );
        }
        if ( courseDTO.getCreatedDateTime() != null ) {
            course.setCreatedDateTime( courseDTO.getCreatedDateTime() );
        }
        if ( courseDTO.getProductStatus() != null ) {
            course.setProductStatus( courseDTO.getProductStatus() );
        }
        if ( courseDTO.getVideoUrl() != null ) {
            course.setVideoUrl( courseDTO.getVideoUrl() );
        }
        if ( courseDTO.getUserId() != null ) {
            course.setUserId( courseDTO.getUserId() );
        }

        return course;
    }
}
