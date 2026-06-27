package jpabook.hospital.dao;

import jakarta.persistence.*;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Entity
@Table(name = "chart_events")
public class ChartEvent {
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

    @Column(name = "warning")
    private Boolean warning;
}
