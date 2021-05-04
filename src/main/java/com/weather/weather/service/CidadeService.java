package com.weather.weather.service;

import com.weather.weather.model.Cidades;
import com.weather.weather.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService {

    @Autowired
    CidadeRepository cidadeRepository;

    public Cidades salvarCidades (Cidades cidades){
        cidadeRepository.save(cidades);
        return cidades;
    }

    public List<Cidades> listarCidades(){
        return cidadeRepository.findAll();
    }

    public List<Cidades> listarPorNome(){
        return cidadeRepository.findByFirstCharName("R");
    }

    public List<Cidades> litarPorLatitudeLongitude(){
        return cidadeRepository.findByLatitudeAndLongitude("2", "2");
    }
}
