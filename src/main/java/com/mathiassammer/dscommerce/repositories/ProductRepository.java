package com.mathiassammer.dscommerce.repositories;

import com.mathiassammer.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
