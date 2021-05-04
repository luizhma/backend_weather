package com.weather.weather.controller;

import com.weather.weather.model.Cidades;
import com.weather.weather.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping ("/cidades")
public class CidadeResource {
    @Autowired
    CidadeService cidadeService;

    @GetMapping("/listar")
    public List<Cidades> litarCidades (){
        return cidadeService.listarCidades();
    }

    @GetMapping("/nome")
    public List<Cidades> listarCidadesNome (){
        return cidadeService.listarPorNome();
    }

    @PostMapping ("/salvar")
    public ResponseEntity<Cidades> salvar (@RequestBody Cidades cidades, HttpServletResponse response){
        Cidades c = cidadeService.salvarCidades(cidades);
        URI uri = ServletUriComponentsBuilder.fromCurrentServletMapping().path("/{id}").buildAndExpand(c.getId()).toUri();
        return ResponseEntity.created(uri).body(c);
    }

    @GetMapping ("/latlongi")
    public List<Cidades> listarPorLatLong () {
        return cidadeService.litarPorLatitudeLongitude();
    }

}
