package com.inventario.repositories;

import com.inventario.entities.ProductoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends CrudRepository<ProductoEntity, Integer> {



}
