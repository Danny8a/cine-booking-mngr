package com.cine.service.schedule;

import com.cine.model.Schedule;
import com.cine.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    private final ScheduleRepository scheduleRepository;

    @Autowired
    public ScheduleServiceImpl(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    @Override
    public Schedule saveSchedule(Schedule schedule) {
        return this.scheduleRepository.save(schedule);
    }

    @Override
    public List<Schedule> getAllSchedulesPerDay(Date date) {
        return this.scheduleRepository.findByStartTime(date);
    }
}
