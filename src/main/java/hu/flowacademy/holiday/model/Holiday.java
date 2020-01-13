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
    @Column
    private long Id;
    @ManyToOne
    @JoinColumn
    private User boss;
    @ManyToOne
    @JoinColumn
    private User user;
    @Column
    private LocalDate startDate;
    @Column
    private LocalDate endDate;
    @Column
    private HolidayType type;
    @Column
    private StatusType status;

    public enum HolidayType {
        PTO, VTO, SICK
    }

    public enum StatusType {
        APPROVED, DECLINED, PENDING
    }
}
