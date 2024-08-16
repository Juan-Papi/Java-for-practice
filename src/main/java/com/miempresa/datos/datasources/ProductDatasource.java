package com.miempresa.datos.datasources;

import com.miempresa.datos.entities.Product;
import java.util.List;
import java.util.Optional;

public abstract class ProductDatasource {

    /**
     * Inserta un nuevo producto en el repositorio.
     * 
     * @param product El producto a insertar.
     * @return El producto insertado con su ID asignado.
     */
    public abstract Product insert(Product product);

    /**
     * Actualiza un producto existente en el repositorio.
     * 
     * @param product El producto con la información actualizada.
     * @return El producto actualizado.
     */
    public abstract Product update(Product product);

    /**
     * Elimina un producto del repositorio por su ID.
     * 
     * @param id El ID del producto a eliminar.
     * @return true si el producto fue eliminado con éxito, false en caso contrario.
     */
    public abstract boolean delete(int id);

    /**
     * Obtiene un producto del repositorio por su ID.
     * 
     * @param id El ID del producto a buscar.
     * @return Un Optional que contiene el producto si se encuentra, o vacío si no
     *         se encuentra.
     */
    public abstract Optional<Product> getById(int id);

    /**
     * Obtiene todos los productos del repositorio.
     * 
     * @return Una lista de todos los productos.
     */
    public abstract List<Product> getAll();
}
