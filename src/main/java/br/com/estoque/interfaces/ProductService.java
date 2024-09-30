package br.com.estoque.interfaces;

import br.com.estoque.entities.Product;

public interface ProductService {
    // Método para obter o ID do produto
    Integer getId();

    // Método para obter o nome do produto
    String getName();

    // Método para definir o nome do produto
    void setName(String name);

    // Método para obter o preço do produto
    Double getPrice();

    // Método para definir o preço do produto
    void setPrice(Double price);

    // Método para obter a quantidade em estoque do produto
    Integer getStockQuantity();

    // Método para definir a quantidade em estoque do produto
    void setStockQuantity(Integer quantity);

    // Método para exibir informações do produto
    String getProductInfo();


}
