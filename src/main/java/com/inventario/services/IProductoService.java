    package com.inventario.services;

import com.inventario.entities.ProductoEntity;

import java.util.List;

public interface IProductoService {

    public List<ProductoEntity> findAllProduct();

    public ProductoEntity findByIdProduct(Integer id);

    public ProductoEntity insertProduct(ProductoEntity productoEntity);

    public ProductoEntity updateProduct(ProductoEntity productoEntity);

    public boolean findByIdDeleteProduct(Integer id);
}
