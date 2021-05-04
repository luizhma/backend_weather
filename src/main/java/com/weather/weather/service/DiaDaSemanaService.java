package com.weather.weather.service;

import com.weather.weather.model.DiaDaSemana;
import com.weather.weather.repository.DiaDaSemanaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiaDaSemanaService {

    @Autowired
    DiaDaSemanaRepository diaDaSemanaRepository;

    public void salvarDiaDaSemana (DiaDaSemana diaDaSemana){
        diaDaSemanaRepository.save(diaDaSemana);
    }

    public List<DiaDaSemana> listarDiaDaSemana(){
        return diaDaSemanaRepository.findAll();
    }
}
