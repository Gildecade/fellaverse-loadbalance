package com.fellaverse.backend.mapper;

import com.fellaverse.backend.bean.Schedule;
import com.fellaverse.backend.dto.ScheduleDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-01T18:02:21-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@Component
public class ScheduleMapperImpl implements ScheduleMapper {

    @Override
    public Schedule toEntity(ScheduleDTO scheduleDTO) {
        if ( scheduleDTO == null ) {
            return null;
        }

        Schedule schedule = new Schedule();

        schedule.setId( scheduleDTO.getId() );
        schedule.setScheduleName( scheduleDTO.getScheduleName() );
        schedule.setWorkoutDays( scheduleDTO.getWorkoutDays() );
        schedule.setStartTime( scheduleDTO.getStartTime() );
        schedule.setEndTime( scheduleDTO.getEndTime() );
        schedule.setUserId( scheduleDTO.getUserId() );

        return schedule;
    }

    @Override
    public ScheduleDTO toDto(Schedule schedule) {
        if ( schedule == null ) {
            return null;
        }

        ScheduleDTO scheduleDTO = new ScheduleDTO();

        scheduleDTO.setId( schedule.getId() );
        scheduleDTO.setScheduleName( schedule.getScheduleName() );
        scheduleDTO.setWorkoutDays( schedule.getWorkoutDays() );
        scheduleDTO.setStartTime( schedule.getStartTime() );
        scheduleDTO.setEndTime( schedule.getEndTime() );
        scheduleDTO.setUserId( schedule.getUserId() );

        return scheduleDTO;
    }

    @Override
    public Schedule partialUpdate(ScheduleDTO scheduleDTO, Schedule schedule) {
        if ( scheduleDTO == null ) {
            return schedule;
        }

        if ( scheduleDTO.getId() != null ) {
            schedule.setId( scheduleDTO.getId() );
        }
        if ( scheduleDTO.getScheduleName() != null ) {
            schedule.setScheduleName( scheduleDTO.getScheduleName() );
        }
        if ( scheduleDTO.getWorkoutDays() != null ) {
            schedule.setWorkoutDays( scheduleDTO.getWorkoutDays() );
        }
        if ( scheduleDTO.getStartTime() != null ) {
            schedule.setStartTime( scheduleDTO.getStartTime() );
        }
        if ( scheduleDTO.getEndTime() != null ) {
            schedule.setEndTime( scheduleDTO.getEndTime() );
        }
        if ( scheduleDTO.getUserId() != null ) {
            schedule.setUserId( scheduleDTO.getUserId() );
        }

        return schedule;
    }
}
