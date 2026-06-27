package jpabook.hospital.dao;

import jakarta.persistence.*;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "lab_events")
public class LabEvent {
    @Id @GeneratedValue
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
    @Lob
    private String value;

    @Column(name = "value_num")
    private BigDecimal valueNum;

    @Column(name = "value_uom")
    private String valueUom;

    @Column(name = "ref_low")
    private BigDecimal refLow;

    @Column(name = "ref_high")
    private BigDecimal refHigh;

    @Column(name = "flag")
    private String flag;
}
