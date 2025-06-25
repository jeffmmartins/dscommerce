package com.jeffmmartins.dscommerce.entities;

import com.jeffmmartins.dscommerce.enums.OrderStatus;
import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "tb_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant moment;
    private OrderStatus status;

    @ManyToOne
    @JoinColumn(name = "client_id") //nome para chave estrangeira
    private User client;


}
