package com.anupam.graphql.service;

import com.anupam.graphql.entity.Poet;

import java.util.List;

public interface PoetService {

    public Poet createPoet(Poet poet);

    public List<Poet> getAllPoets();

    public Poet getPoet(int id);

}
