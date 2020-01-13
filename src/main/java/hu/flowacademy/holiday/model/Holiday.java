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
public class Holiday {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String boss;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private HolidayType type;
    private StatusType status;

    public enum HolidayType {
        PTO, VTO, SICK
    }

    public enum StatusType {
        APPROVED, DECLINED, PENDING
    }
}
