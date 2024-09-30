package br.com.estoque.dao;

import br.com.estoque.interfaces.ProductService;

public class ProductDao implements ProductService {
    @Override
    public Integer getId() {
        return 0;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public Double getPrice() {
        return 0.0;
    }

    @Override
    public void setPrice(Double price) {

    }

    @Override
    public Integer getStockQuantity() {
        return 0;
    }

    @Override
    public void setStockQuantity(Integer quantity) {

    }

    @Override
    public String getProductInfo() {
        return "";
    }

    @Override
    public void setName(String name) {

    }
}
