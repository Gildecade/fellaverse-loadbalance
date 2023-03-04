package com.fellaverse.backend.mapper;

import com.fellaverse.backend.bean.Course;
import com.fellaverse.backend.bean.Order;
import com.fellaverse.backend.bean.Product;
import com.fellaverse.backend.bean.User;
import com.fellaverse.backend.dto.CoachDTO;
import com.fellaverse.backend.dto.CourseOrderDTO;
import com.fellaverse.backend.dto.OrderFindAllDTO;
import com.fellaverse.backend.dto.ProductDTO;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-01T18:02:23-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@Component
public class OrderFindAllMapperImpl implements OrderFindAllMapper {

    @Autowired
    private UserBasicInfoMapper userBasicInfoMapper;

    @Override
    public Order toEntity(OrderFindAllDTO orderFindAllDTO) {
        if ( orderFindAllDTO == null ) {
            return null;
        }

        Order order = new Order();

        order.setId( orderFindAllDTO.getId() );
        order.setQuantity( orderFindAllDTO.getQuantity() );
        order.setPurchaseDateTime( orderFindAllDTO.getPurchaseDateTime() );
        order.setAmount( orderFindAllDTO.getAmount() );
        order.setUser( userBasicInfoMapper.toEntity( orderFindAllDTO.getUser() ) );
        order.setProduct( productDTOToProduct( orderFindAllDTO.getProduct() ) );

        return order;
    }

    @Override
    public OrderFindAllDTO toDto(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderFindAllDTO orderFindAllDTO = new OrderFindAllDTO();

        orderFindAllDTO.setId( order.getId() );
        orderFindAllDTO.setQuantity( order.getQuantity() );
        orderFindAllDTO.setPurchaseDateTime( order.getPurchaseDateTime() );
        orderFindAllDTO.setAmount( order.getAmount() );
        orderFindAllDTO.setUser( userBasicInfoMapper.toDto( order.getUser() ) );
        orderFindAllDTO.setProduct( productToProductDTO( order.getProduct() ) );

        return orderFindAllDTO;
    }

    @Override
    public Order partialUpdate(OrderFindAllDTO orderFindAllDTO, Order order) {
        if ( orderFindAllDTO == null ) {
            return order;
        }

        if ( orderFindAllDTO.getId() != null ) {
            order.setId( orderFindAllDTO.getId() );
        }
        if ( orderFindAllDTO.getQuantity() != null ) {
            order.setQuantity( orderFindAllDTO.getQuantity() );
        }
        if ( orderFindAllDTO.getPurchaseDateTime() != null ) {
            order.setPurchaseDateTime( orderFindAllDTO.getPurchaseDateTime() );
        }
        if ( orderFindAllDTO.getAmount() != null ) {
            order.setAmount( orderFindAllDTO.getAmount() );
        }
        if ( orderFindAllDTO.getUser() != null ) {
            if ( order.getUser() == null ) {
                order.setUser( new User() );
            }
            userBasicInfoMapper.partialUpdate( orderFindAllDTO.getUser(), order.getUser() );
        }
        if ( orderFindAllDTO.getProduct() != null ) {
            if ( order.getProduct() == null ) {
                order.setProduct( new Product() );
            }
            productDTOToProduct1( orderFindAllDTO.getProduct(), order.getProduct() );
        }

        return order;
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

    protected Course courseOrderDTOToCourse(CourseOrderDTO courseOrderDTO) {
        if ( courseOrderDTO == null ) {
            return null;
        }

        Course course = new Course();

        course.setVideoUrl( courseOrderDTO.getVideoUrl() );
        course.setUser( coachDTOToUser( courseOrderDTO.getUser() ) );

        return course;
    }

    protected Product productDTOToProduct(ProductDTO productDTO) {
        if ( productDTO == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( productDTO.getId() );
        product.setProductName( productDTO.getProductName() );
        product.setDescription( productDTO.getDescription() );
        product.setImageUrl( productDTO.getImageUrl() );
        product.setPrice( productDTO.getPrice() );
        product.setCreatedDateTime( productDTO.getCreatedDateTime() );
        product.setProductStatus( productDTO.getProductStatus() );
        product.setCourse( courseOrderDTOToCourse( productDTO.getCourse() ) );

        return product;
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

    protected CourseOrderDTO courseToCourseOrderDTO(Course course) {
        if ( course == null ) {
            return null;
        }

        CourseOrderDTO courseOrderDTO = new CourseOrderDTO();

        courseOrderDTO.setVideoUrl( course.getVideoUrl() );
        courseOrderDTO.setUser( userToCoachDTO( course.getUser() ) );

        return courseOrderDTO;
    }

    protected ProductDTO productToProductDTO(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDTO productDTO = new ProductDTO();

        productDTO.setId( product.getId() );
        productDTO.setProductName( product.getProductName() );
        productDTO.setDescription( product.getDescription() );
        productDTO.setImageUrl( product.getImageUrl() );
        productDTO.setPrice( product.getPrice() );
        productDTO.setCreatedDateTime( product.getCreatedDateTime() );
        productDTO.setProductStatus( product.getProductStatus() );
        productDTO.setCourse( courseToCourseOrderDTO( product.getCourse() ) );

        return productDTO;
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

    protected void courseOrderDTOToCourse1(CourseOrderDTO courseOrderDTO, Course mappingTarget) {
        if ( courseOrderDTO == null ) {
            return;
        }

        mappingTarget.setVideoUrl( courseOrderDTO.getVideoUrl() );
        if ( courseOrderDTO.getUser() != null ) {
            if ( mappingTarget.getUser() == null ) {
                mappingTarget.setUser( new User() );
            }
            coachDTOToUser1( courseOrderDTO.getUser(), mappingTarget.getUser() );
        }
        else {
            mappingTarget.setUser( null );
        }
    }

    protected void productDTOToProduct1(ProductDTO productDTO, Product mappingTarget) {
        if ( productDTO == null ) {
            return;
        }

        mappingTarget.setId( productDTO.getId() );
        mappingTarget.setProductName( productDTO.getProductName() );
        mappingTarget.setDescription( productDTO.getDescription() );
        mappingTarget.setImageUrl( productDTO.getImageUrl() );
        mappingTarget.setPrice( productDTO.getPrice() );
        mappingTarget.setCreatedDateTime( productDTO.getCreatedDateTime() );
        mappingTarget.setProductStatus( productDTO.getProductStatus() );
        if ( productDTO.getCourse() != null ) {
            if ( mappingTarget.getCourse() == null ) {
                mappingTarget.setCourse( new Course() );
            }
            courseOrderDTOToCourse1( productDTO.getCourse(), mappingTarget.getCourse() );
        }
        else {
            mappingTarget.setCourse( null );
        }
    }
}
