package com.weather.weather.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Previsao implements Serializable {
    private static final long serialVersion = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "_TEMPERATURAMINIMA")
    private Double temperaturaMinima;
    @Column(name = "_TEMPERATURAMAXIMA")
    private Double temperaturaMaxima;
    @Column(name = "_HUMIDADE")
    private Double humidade;
    @Column(name = "_DESCRICAO")
    private String descricao;

    /* --Relação Previsão - Dia da Semana-- */
    @OneToOne
    @JoinColumn (name = "dia_da_semana")
    private DiaDaSemana diaDaSemana;

    public DiaDaSemana getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(DiaDaSemana diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    /* Relacionamento ManyToOne - Cidades - Previsão */

    @OneToOne
    @JoinColumn (name = "cidade")
    private Cidades cidades;

    public Cidades getCidades() {
        return cidades;
    }

    public void setCidades(Cidades cidades) {
        this.cidades = cidades;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Double getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(Double temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public Double getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(Double temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public Double getHumidade() {
        return humidade;
    }

    public void setHumidade(Double humidade) {
        this.humidade = humidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
