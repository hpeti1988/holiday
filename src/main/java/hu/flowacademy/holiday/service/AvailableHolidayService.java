package hu.flowacademy.holiday.service;

import hu.flowacademy.holiday.repository.AvailableHolidayRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AvailableHolidayService {

    @Autowired
    private AvailableHolidayRepository availableHolidayRepository;
}
