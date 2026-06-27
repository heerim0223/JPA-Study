package jpabook.hospital.dao;

import jakarta.persistence.*;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "icu_stays")
public class IcuStay {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "stay_id")
    private String id;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "hadm_id")
    private Admission admission;

    @Column(name = "first_care_unit")
    private String firstCareUnit;

    @Column(name = "last_care_unit")
    private String lastCareUnit;

    @Column(name = "in_time")
    private LocalDateTime inTime;

    @Column(name = "out_time")
    private LocalDateTime outTime;

    @Column(name = "los")
    private BigDecimal los;

    @Column(name = "op_flag")
    private Boolean opFlag;
}
