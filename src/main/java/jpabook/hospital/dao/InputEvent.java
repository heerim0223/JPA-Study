package jpabook.hospital.dao;

import jakarta.persistence.*;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "input_events")
public class InputEvent {
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

    @Column(name = "start_time")
    private LocalDateTime startTime;

    @Column(name = "end_time")
    private LocalDateTime endTime;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "amount_uom")
    private String amountUom;

    @Column(name = "rate")
    private BigDecimal rate;

    @Column(name = "rate_uom")
    private String rateUom;
}
