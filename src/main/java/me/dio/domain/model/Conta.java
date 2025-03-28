package me.dio.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity(name = "tb_usuario")
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String numero;

    private String agencia;

    @Column(name = "balanco", precision = 2, scale = 13)
    private BigDecimal balanco;

    @Column(name = "balanco", precision = 2, scale = 13)
    private BigDecimal limite;

    private Double saldo;
    private Usuario usuario;
    private Cartao cartao;

    public Conta(Long id, String numero, String agencia, Double saldo, Usuario usuario, Cartao cartao) {
        this.id = id;
        this.numero = numero;
        this.agencia = agencia;
        this.balanco = BigDecimal.ZERO;
        this.limite = BigDecimal.ZERO;
        this.saldo = saldo;
        this.usuario = usuario;
        this.cartao = cartao;
    }

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

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public BigDecimal getBalanco() {
        return balanco;
    }

    public void setBalanco(BigDecimal balanco) {
        this.balanco = balanco;
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

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }    
}
