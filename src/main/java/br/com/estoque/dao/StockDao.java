package br.com.estoque.dao;

import br.com.estoque.entities.Product;
import br.com.estoque.interfaces.StockService;

import java.util.List;

public class StockDao implements StockService {
    @Override
    public void insert(Product product) {

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void deleteByName(String product) {

    }

    @Override
    public Product findByName(String product) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return List.of();
    }
}
