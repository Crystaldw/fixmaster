package de.telran.fixmaster.repository;

import de.telran.fixmaster.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product>findAllByCategory_Id(int id);

}
