package jpabook.hospital.dao;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "patients")
public class Patient {
    @Id @GeneratedValue
    @Column(name = "subject_id")
    private Long id;

    @Column
    private Character sex;

    @Column(name = "anchor_age")
    private Integer age;

    @Column(name = "anchor_year")
    private Integer year;

    @Column(name = "anchor_year_group")
    private String yearGroup;

    @Column
    private LocalDateTime dod;

}
