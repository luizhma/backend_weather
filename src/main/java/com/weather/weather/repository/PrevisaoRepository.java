package com.weather.weather.repository;

import com.weather.weather.model.Previsao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrevisaoRepository extends JpaRepository<Previsao, Long> {


}
