package com.anupam.graphql.controller;

import com.anupam.graphql.entity.Poet;
import com.anupam.graphql.service.PoetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/poets")
public class PoetController {

    private PoetService poetService;

    @Autowired
    public PoetController(PoetService poetService) {
        this.poetService = poetService;
    }

    @PostMapping
    public Poet save(@RequestBody Poet poet){
        return poetService.createPoet(poet);
    }

    @GetMapping
    public List<Poet> getALL(){
        return poetService.getAllPoets();
    }

    @GetMapping("/{id}")
    public Poet get(@PathVariable int id){
        return poetService.getPoet(id);
    }
}
