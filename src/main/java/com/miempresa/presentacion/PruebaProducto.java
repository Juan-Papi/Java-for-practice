package com.miempresa.presentacion;

import java.util.List;

import com.miempresa.datos.entities.Product;
import com.miempresa.datos.repositories.ProductRepository;
import com.miempresa.negocio.datasources.ProductDatasourceImpl;
import com.miempresa.negocio.repositories.ProductRepositoryImpl;

public class PruebaProducto {
    ProductRepository productRepository;

    public PruebaProducto(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public static void main(String[] args) {
        // Crear instancia del repositorio con la implementación y datasource
        // correspondientes
        PruebaProducto pruebaProducto = new PruebaProducto(new ProductRepositoryImpl(new ProductDatasourceImpl()));

        // Crear un objeto Product con los valores deseados
        Product newProduct = new Product(1, "Producto A", 100.0, 10);

        // Insertar el producto usando el método insert
        pruebaProducto.productRepository.insert(newProduct);

        System.out.println("Producto insertado exitosamente \n" + newProduct.toString());
     // Obtener y mostrar todos los productos
     
        List<Product> productos = pruebaProducto.productRepository.getAll();
        System.out.println("Lista de productos:");
        
        // Imprimir la lista de productos
        productos.forEach(product -> System.out.println(product));
    }
}
