package com.inventario.services.imple;

import com.inventario.entities.ProductoEntity;
import com.inventario.repositories.IProductoRepository;
import com.inventario.services.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicesImple implements IProductoService {

    @Autowired
    IProductoRepository productoRepository;

    @Override
    public List<ProductoEntity> findAllProduct() {
        return (List<ProductoEntity>) productoRepository.findAll();
    }

    @Override
    public ProductoEntity findByIdProduct(Integer id) {
        ProductoEntity obj = productoRepository.findById(id).orElseGet(null);
        return obj;
    }

    @Override
    public ProductoEntity insertProduct(ProductoEntity productoEntity) {
        if (productoEntity.getId() == null){
            return productoRepository.save(productoEntity);
        }else {
            return null;
        }
    }

    @Override
    public ProductoEntity updateProduct(ProductoEntity productoEntity) {
        ProductoEntity obj = productoRepository.findById(productoEntity.getId()).orElseGet(null);
        if (obj == null){
            return null;
        }else {
            productoRepository.save(obj);
        }
        return obj;
    }

    @Override
    public boolean findByIdDeleteProduct(Integer id) {
        ProductoEntity obj = productoRepository.findById(id).orElseGet(null);
        if (obj == null){
            return false;
        }else {
            productoRepository.save(obj);
            return true;
        }
    }
}
