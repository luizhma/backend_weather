package com.weather.weather.repository;

import com.weather.weather.model.Cidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CidadeRepository extends JpaRepository <Cidades, Long> {

    @Query ("SELECT c FROM Cidades c WHERE c.nome LIKE ?1%")
    public List<Cidades> findByFirstCharName(String letra);

    @Query ("SELECT c FROM Cidades c WHERE c.latitude LIKE ?1% AND c.longitude LIKE ?1%")
    public List<Cidades> findByLatitudeAndLongitude(String latitude, String longitude);
}
