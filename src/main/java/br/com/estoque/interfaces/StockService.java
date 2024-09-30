package br.com.estoque.interfaces;

import br.com.estoque.entities.Product;

import java.util.List;

public interface StockService {

    void insert(Product product);
    void update(Product product);
    void deleteByName(String product);
    Product findByName(String product);
    List<Product> findAll();
}
