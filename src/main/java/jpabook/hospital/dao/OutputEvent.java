package jpabook.hospital.dao;

import jakarta.persistence.*;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "output_events")
public class OutputEvent {
    @Id
    @GeneratedValue
    @Column(name = "event_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "hadm_id")
    private Admission admission;

    @ManyToOne
    @JoinColumn(name = "stay_id")
    private IcuStay icuStay;

    @Column(name = "chart_time")
    private LocalDateTime chartTime;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @Column(name = "value")
    private BigDecimal value;

    @Column(name = "value_uom")
    private String valueUom;

    @Column(name = "warning")
    private Boolean warning;
}
