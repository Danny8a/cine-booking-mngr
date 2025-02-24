package com.cine.service.schedule;

import com.cine.model.Schedule;

import java.util.Date;
import java.util.List;

public interface ScheduleService {

    Schedule saveSchedule(Schedule schedule);
    List<Schedule> getAllSchedulesPerDay(Date date);
}
