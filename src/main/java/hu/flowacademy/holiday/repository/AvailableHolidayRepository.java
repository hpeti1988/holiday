package hu.flowacademy.holiday.repository;

import hu.flowacademy.holiday.model.AvailableHoliday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvailableHolidayRepository extends JpaRepository<AvailableHoliday, Long> {
}
