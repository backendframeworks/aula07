package com.backend.aula07.repository;

import com.backend.aula07.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {

    List<Product> findByName(String name);

    List<Product> findByNameStartingWith(String prefix);

    List<Product> findByNameStartingWithAndValueGreaterThan(String prefix, double value);
}
