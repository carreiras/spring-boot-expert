package com.ewecarreira.spring.boot.expert.entities;

import com.ewecarreira.spring.boot.expert.enums.SalesOrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "sales_order")
public class SalesOrder {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "order_date")
    private LocalDate order_date;

    @Column(name = "total", precision = 20, scale = 2)
    private BigDecimal total;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private SalesOrderStatus status;

    @OneToMany(mappedBy = "sales_order_item")
    private List<SalesOrderItem> items;
}
