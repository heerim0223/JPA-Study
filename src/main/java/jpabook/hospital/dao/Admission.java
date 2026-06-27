package jpabook.hospital.dao;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "admissions")
public class Admission {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "hadm_id")
    private String id;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Patient patient;

    @Column(name = "admit_time")
    private LocalDateTime admitTime;

    @Column(name = "disch_time")
    private LocalDateTime dischTime;

    @Column(name = "death_time")
    private LocalDateTime deathTime;

    @Column(name = "admission_type")
    private String admissionType;

    @Column(name = "admission_location")
    private String admissionLocation;

    @Column(name = "discharge_location")
    private String dischargeLocation;


    @Column(name = "insurance")
    private String insurance;

    @Column(name = "marital_status")
    private String maritalStatus;

    @Column(name = "ethnicity")
    private String ethnicity;


    @Column(name = "edreg_time")
    private LocalDateTime edregTime;

    @Column(name = "edout_time")
    private LocalDateTime edoutTime;


    @Column(name = "hospital_expire_flag")
    private Boolean hospitalExpireFlag;


    @Column(name = "icu_expire_flag")
    private Boolean icuExpireFlag;


    @Column(name = "nationality")
    private String nationality;

    @Column(name = "hospital_id")
    private Integer hospitalId;
}
