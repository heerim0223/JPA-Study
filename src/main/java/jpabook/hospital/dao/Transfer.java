package jpabook.hospital.dao;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "transfers")
public class Transfer {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "transfer_id")
    private String id;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "hadm_id")
    private Admission admission;

    @Column(name = "event_type")
    private String eventType;

    @Column(name = "care_unit")
    private String careUnit;

    @Column(name = "in_time")
    private LocalDateTime inTime;

    @Column(name = "out_time")
    private LocalDateTime outTime;
}
