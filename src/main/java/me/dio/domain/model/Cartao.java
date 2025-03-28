package me.dio.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity(name = "tb_cartao")
public class Cartao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String numero;

    @Column(name = "limite_disponivel", precision = 2, scale = 13)
    private BigDecimal limite;

    private Double saldo;

    public Cartao(String numero, BigDecimal limite) {
        this.numero = numero;
        this.limite = limite;
        this.saldo = 0.0; // Inicializa o saldo como 0.0
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public BigDecimal getLimite() {
        return limite;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }

    public Double getSaldo() {
        return saldo;
    }

}
