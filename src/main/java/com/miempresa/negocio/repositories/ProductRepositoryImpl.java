package com.miempresa.negocio.repositories;

import com.miempresa.datos.datasources.ProductDatasource;
import com.miempresa.datos.entities.Product;
import com.miempresa.datos.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

public class ProductRepositoryImpl extends ProductRepository {

    private final ProductDatasource dataSource;

    public ProductRepositoryImpl(ProductDatasource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Product insert(Product product) {
        return this.dataSource.insert(product);
    }

    @Override
    public Product update(Product product) {
        return this.dataSource.update(product);
    }

    @Override
    public boolean delete(int id) {
        return this.dataSource.delete(id);
    }

    @Override
    public Optional<Product> getById(int id) {
        return this.dataSource.getById(id);
    }

    @Override
    public List<Product> getAll() {
        return this.dataSource.getAll();
    }
}
