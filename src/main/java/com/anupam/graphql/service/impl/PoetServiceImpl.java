package com.anupam.graphql.service.impl;

import com.anupam.graphql.entity.Poet;
import com.anupam.graphql.repo.PoetRepo;
import com.anupam.graphql.service.PoetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PoetServiceImpl implements PoetService {

    private PoetRepo repo;


    @Autowired
    public PoetServiceImpl(PoetRepo repo) {
        this.repo = repo;
    }

    @Override
    public Poet createPoet(Poet poet) {
        return repo.save(poet);
    }

    @Override
    public List<Poet> getAllPoets() {
        return repo.findAll();
    }

    @Override
    public Poet getPoet(int id) {
        return repo.findById(id).orElseThrow(()->new RuntimeException("Poet is missing ;)"));
    }
}
