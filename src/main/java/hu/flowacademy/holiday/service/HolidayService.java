package hu.flowacademy.holiday.service;

import hu.flowacademy.holiday.repository.HolidayRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class HolidayService {
    @Autowired
    private HolidayRepository holidayRepository;
}
