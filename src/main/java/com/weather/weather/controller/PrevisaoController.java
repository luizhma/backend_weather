package com.weather.weather.controller;

import com.weather.weather.model.Previsao;
import com.weather.weather.service.PrevisaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/previsao")
public class PrevisaoController {

    @Autowired
    private PrevisaoService previsaoService;

    @GetMapping("/listar")
   public List<Previsao> listarPrevisao(){
        return previsaoService.listarPrevisao();
    }

    @PostMapping("/salvar")
    public ResponseEntity<Previsao> salvar (@RequestBody Previsao previsao , HttpServletResponse response) {
        Previsao p = previsaoService.salvar(previsao);
        URI uri = ServletUriComponentsBuilder.fromCurrentServletMapping().path("/{id}").buildAndExpand(p.getId()).toUri();
        return ResponseEntity.created(uri).body(p);
    }

}
