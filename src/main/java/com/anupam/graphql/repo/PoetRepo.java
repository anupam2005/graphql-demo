package com.anupam.graphql.repo;

import com.anupam.graphql.entity.Poet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PoetRepo extends JpaRepository<Poet, Integer> {
}
