package com.autoBrokers.payment_service.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "cards")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "holder_name", nullable = false)
    private String holderName;

    @Column(name = "nickname", nullable = false)
    private String nickname;

    @Column(name = "issuer", nullable = false)
    private String issuer;

    @Column(name = "number", nullable = false, length = 16)
    private Long number;

    @Column(name = "expiration_date", nullable = false, length = 5)
    private LocalDate expirationDate;

    @Column(name = "cvv", nullable = false, length = 5)
    private int cvv;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "id_client", nullable = false)
    private Long idClient;

    @Column(name = "id_driver", nullable = false)
    private Long idDriver;

}