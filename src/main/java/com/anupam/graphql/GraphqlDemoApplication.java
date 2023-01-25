package com.anupam.graphql;

import com.anupam.graphql.entity.Poet;
import com.anupam.graphql.service.PoetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlDemoApplication implements CommandLineRunner {

	@Autowired
	private PoetService poetService;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Poet p1=new Poet();
		p1.setName("Galib");
		p1.setGenre("Romance");
		p1.setLanguage("Urdu");
		p1.setNoOfBooksWritten(236);

		poetService.createPoet(p1);

		Poet p2=new Poet();
		p2.setName("Charles Bukowski");
		p2.setGenre("Realism");
		p2.setLanguage("English");
		p2.setNoOfBooksWritten(436);

		poetService.createPoet(p2);
	}
}
