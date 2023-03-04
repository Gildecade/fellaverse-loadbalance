package com.fellaverse.backend.mapper;

import com.fellaverse.backend.bean.Course;
import com.fellaverse.backend.bean.User;
import com.fellaverse.backend.dto.CoachDTO;
import com.fellaverse.backend.dto.CourseFindAllDTO;
import com.fellaverse.backend.enumerator.ProductStatus;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-01T18:02:23-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@Component
public class CourseFindAllMapperImpl implements CourseFindAllMapper {

    @Override
    public Course toEntity(CourseFindAllDTO courseFindAllDTO) {
        if ( courseFindAllDTO == null ) {
            return null;
        }

        Course course = new Course();

        course.setId( courseFindAllDTO.getId() );
        course.setProductName( courseFindAllDTO.getProductName() );
        course.setDescription( courseFindAllDTO.getDescription() );
        course.setImageUrl( courseFindAllDTO.getImageUrl() );
        course.setPrice( courseFindAllDTO.getPrice() );
        course.setCreatedDateTime( courseFindAllDTO.getCreatedDateTime() );
        course.setProductStatus( courseFindAllDTO.getProductStatus() );
        course.setVideoUrl( courseFindAllDTO.getVideoUrl() );
        course.setUser( coachDTOToUser( courseFindAllDTO.getUser() ) );

        return course;
    }

    @Override
    public CourseFindAllDTO toDto(Course course) {
        if ( course == null ) {
            return null;
        }

        Long id = null;
        String productName = null;
        String description = null;
        String imageUrl = null;
        Float price = null;
        LocalDateTime createdDateTime = null;
        ProductStatus productStatus = null;
        String videoUrl = null;
        CoachDTO user = null;

        id = course.getId();
        productName = course.getProductName();
        description = course.getDescription();
        imageUrl = course.getImageUrl();
        price = course.getPrice();
        createdDateTime = course.getCreatedDateTime();
        productStatus = course.getProductStatus();
        videoUrl = course.getVideoUrl();
        user = userToCoachDTO( course.getUser() );

        CourseFindAllDTO courseFindAllDTO = new CourseFindAllDTO( id, productName, description, imageUrl, price, createdDateTime, productStatus, videoUrl, user );

        return courseFindAllDTO;
    }

    @Override
    public Course partialUpdate(CourseFindAllDTO courseFindAllDTO, Course course) {
        if ( courseFindAllDTO == null ) {
            return course;
        }

        if ( courseFindAllDTO.getId() != null ) {
            course.setId( courseFindAllDTO.getId() );
        }
        if ( courseFindAllDTO.getProductName() != null ) {
            course.setProductName( courseFindAllDTO.getProductName() );
        }
        if ( courseFindAllDTO.getDescription() != null ) {
            course.setDescription( courseFindAllDTO.getDescription() );
        }
        if ( courseFindAllDTO.getImageUrl() != null ) {
            course.setImageUrl( courseFindAllDTO.getImageUrl() );
        }
        if ( courseFindAllDTO.getPrice() != null ) {
            course.setPrice( courseFindAllDTO.getPrice() );
        }
        if ( courseFindAllDTO.getCreatedDateTime() != null ) {
            course.setCreatedDateTime( courseFindAllDTO.getCreatedDateTime() );
        }
        if ( courseFindAllDTO.getProductStatus() != null ) {
            course.setProductStatus( courseFindAllDTO.getProductStatus() );
        }
        if ( courseFindAllDTO.getVideoUrl() != null ) {
            course.setVideoUrl( courseFindAllDTO.getVideoUrl() );
        }
        if ( courseFindAllDTO.getUser() != null ) {
            if ( course.getUser() == null ) {
                course.setUser( new User() );
            }
            coachDTOToUser1( courseFindAllDTO.getUser(), course.getUser() );
        }

        return course;
    }

    protected User coachDTOToUser(CoachDTO coachDTO) {
        if ( coachDTO == null ) {
            return null;
        }

        User user = new User();

        user.setId( coachDTO.getId() );
        user.setUsername( coachDTO.getUsername() );
        user.setEmail( coachDTO.getEmail() );
        user.setPhoneNumber( coachDTO.getPhoneNumber() );

        return user;
    }

    protected CoachDTO userToCoachDTO(User user) {
        if ( user == null ) {
            return null;
        }

        CoachDTO coachDTO = new CoachDTO();

        coachDTO.setId( user.getId() );
        coachDTO.setUsername( user.getUsername() );
        coachDTO.setEmail( user.getEmail() );
        coachDTO.setPhoneNumber( user.getPhoneNumber() );

        return coachDTO;
    }

    protected void coachDTOToUser1(CoachDTO coachDTO, User mappingTarget) {
        if ( coachDTO == null ) {
            return;
        }

        mappingTarget.setId( coachDTO.getId() );
        mappingTarget.setUsername( coachDTO.getUsername() );
        mappingTarget.setEmail( coachDTO.getEmail() );
        mappingTarget.setPhoneNumber( coachDTO.getPhoneNumber() );
    }
}
