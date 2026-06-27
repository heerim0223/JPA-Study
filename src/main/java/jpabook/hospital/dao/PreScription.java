package jpabook.hospital.dao;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "prescriptions")
public class PreScription {
    @Id @GeneratedValue
    @Column(name = "prescription_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "hadm_id")
    private Admission admission;

    @ManyToOne
    @JoinColumn(name = "stay_id")
    private IcuStay icuStay;

    @Column(name = "start_time")
    private LocalDateTime startTime;

    @Column(name = "stop_time")
    private LocalDateTime stopTime;

    @Column(name = "drug")
    private String drug;

    @Column(name = "dose_val")
    private String doseVal;

    @Column(name = "dose_unit")
    private String doseUnit;

    @Column(name = "route")
    private String route;
}
