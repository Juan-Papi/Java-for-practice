package com.miempresa.negocio.datasources;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.miempresa.datos.datasources.ProductDatasource;
import com.miempresa.datos.entities.Product;

public class ProductDatasourceImpl extends ProductDatasource {
 // Simulación de almacenamiento en memoria
 private List<Product> productList = new ArrayList<>();

 @Override
 public Product insert(Product product) {
     productList.add(product);
     return product;
 }

 @Override
 public Product update(Product product) {
     for (int i = 0; i < productList.size(); i++) {
         if (productList.get(i).getId() == product.getId()) { // Usa '==' para comparar int
             productList.set(i, product);
             return product;
         }
     }
     throw new IllegalArgumentException("Product not found");
 }
 
 @Override
 public boolean delete(int id) {
     return productList.removeIf(product -> product.getId() == id); // Usa '==' para comparar int
 }
 

 @Override
 public Optional<Product> getById(int id) {
     return productList.stream()
             .filter(product -> product.getId() == id) // Usa '==' para comparar int
             .findFirst();
 }
 

 @Override
 public List<Product> getAll() {
     return new ArrayList<>(productList);
 }
}
