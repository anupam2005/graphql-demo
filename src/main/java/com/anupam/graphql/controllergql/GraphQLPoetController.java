package com.anupam.graphql.controllergql;

import com.anupam.graphql.entity.Poet;
import com.anupam.graphql.entity.PoetInput;
import com.anupam.graphql.service.PoetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;


import java.util.List;

@Controller
public class GraphQLPoetController {
    private PoetService poetService;

    @Autowired
    public GraphQLPoetController(PoetService poetService) {
        this.poetService = poetService;
    }


    @MutationMapping("createApoet")
    public Poet save(@Argument PoetInput poet){
        Poet myPoet = new Poet();
        myPoet.setName(poet.getName());
        myPoet.setGenre(poet.getGenre());
        myPoet.setLanguage(poet.getLanguage());
        myPoet.setNoOfBooksWritten(poet.getNoOfBooksWritten());

        return poetService.createPoet(myPoet);
    }


    @QueryMapping("allPoets")
    public List<Poet> getALL(){
        return poetService.getAllPoets();
    }


    @QueryMapping("getPoet")
    public Poet get(@Argument int id){
        return poetService.getPoet(id);
    }
}
