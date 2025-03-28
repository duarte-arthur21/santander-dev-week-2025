package me.dio.domain.model;

import java.math.BigDecimal;

public class Cartao {
    private Long id;
    private String numero;
    private String validade;
    private String cvv;
    private String bandeira;
    private BigDecimal limite;
    private Double saldo;

    public Cartao(String numero, String validade, String cvv, String bandeira, BigDecimal limite) {
        this.numero = numero;
        this.validade = validade;
        this.cvv = cvv;
        this.bandeira = bandeira;
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

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
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
