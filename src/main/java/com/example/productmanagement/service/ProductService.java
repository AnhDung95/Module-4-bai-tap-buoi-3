package com.example.productmanagement.service;

import com.example.productmanagement.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService{
    private static final Map<Integer, Product> products;

    static {

        products = new HashMap<>();
        products.put(1, new Product(1, "Thit ga", "ga trong", "Hien company"));
        products.put(2, new Product(2, "Ca", "ca thu", "Dung company"));
        products.put(3, new Product(3, "Trung", "Trung vit", "Phuong company"));
        products.put(4, new Product(4, "Sua", "vinamilk", "Quyet company"));
        products.put(5, new Product(5, "Rau", "rau muong", "Nam company"));
        products.put(6, new Product(6, "Tuong ot", "chin-su", "Duc Anh company"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
    public Product findByName(String name){
        return products.get(name);
    }
}

