package jpabook.shop.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "shipments")
public class Shipment {
    @Id @GeneratedValue
    @Column(name = "shipment_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_item_id")
    private OrderItem orderItem;

    @Column(name = "courier")
    private String courier;

    @Column(name = "tracking_no")
    private String trackingNo;

    @Column(name = "status")
    private String status;

    @Column(name = "shipped_at")
    private LocalDateTime shipped_at;

    @Column(name = "delivered_at")
    private LocalDateTime deliveredAt;

    @OneToMany(targetEntity = ShipmentTrackingLog.class, mappedBy = "shipment")
    private List<ShipmentTrackingLog> shipmentTrackingLogs = new ArrayList<>();
}
