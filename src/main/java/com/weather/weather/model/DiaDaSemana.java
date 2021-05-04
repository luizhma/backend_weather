package com.weather.weather.model;

import javax.persistence.*;

@Entity
@Table (name = "tb_diadasemana")
public class DiaDaSemana {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "nomedodia")
    private String nomeDoDia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDoDia() {
        return nomeDoDia;
    }

    public void setNomeDoDia(String nomeDoDia) {
        this.nomeDoDia = nomeDoDia;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result  = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DiaDaSemana other = (DiaDaSemana)obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
