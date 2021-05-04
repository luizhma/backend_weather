package com.weather.weather.service;

import com.weather.weather.model.Previsao;
import com.weather.weather.repository.PrevisaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PrevisaoService {

    @Autowired
    private PrevisaoRepository previsaoRepository;

    public Previsao salvar (Previsao previsao){
        previsaoRepository.save(previsao);
        return previsao;
    }

    public List<Previsao> listarPrevisao(){

        return previsaoRepository.findAll();
    }

}
