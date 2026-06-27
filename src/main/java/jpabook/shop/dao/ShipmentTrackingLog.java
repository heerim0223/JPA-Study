package jpabook.shop.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "shipment_tracking_logs")
public class ShipmentTrackingLog {
    @Id @GeneratedValue
    @Column(name = "tracking_log_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "shipment_id")
    private Shipment shipment;

    @Column(name = "status")
    private String status;

    @Column(name = "location", nullable = true)
    private String location;

    @Column(name = "message", nullable = true)
    private String message;

    @Column(name = "logged_at")
    private LocalDateTime loggedAt;
}
