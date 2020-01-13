package hu.flowacademy.holiday.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AvailableHoliday {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ID;
    @OneToOne
    private User user;
    private int countOfHoliday = 20;
    private int extraHoliday = 0;
}

