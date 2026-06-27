package jpabook.hospital.dao;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "edstays")
public class EdStay {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "stay_id")
    private String id;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Patient patient;

    @Column(name = "in_time")
    private LocalDateTime inTime;

    @Column(name = "out_time")
    private LocalDateTime outTime;

    @Column(name = "sex")
    private Character sex;
}
