package com.cine.controller;

import com.cine.model.Schedule;
import com.cine.model.ScheduleAvaible;
import com.cine.service.schedule.ScheduleService;
import com.cine.service.schedule.SheduleAvaibleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class SheduleController {
    private final ScheduleService sheduleService;
    private final SheduleAvaibleService sheduleAvaibleService;

    @Autowired
    public SheduleController(ScheduleService sheduleService, SheduleAvaibleService sheduleAvaibleService) {
        this.sheduleService = sheduleService;
        this.sheduleAvaibleService = sheduleAvaibleService;
    }

    @GetMapping("/schedules")
    public List<Schedule> getAllSchedules(@RequestParam("time") Date time) {
        return sheduleService.getAllSchedulesPerDay(time);
    }

    @PostMapping("/schedules")
    public Schedule saveSchedule(Schedule schedule) {
        return sheduleService.saveSchedule(schedule);
    }

    @GetMapping("/schedules/avaible")
    public List<ScheduleAvaible> getAllSchedulesAvaible(@RequestParam("time") Date time) {
        return sheduleAvaibleService.getScheduleAvaible();
    }
}
