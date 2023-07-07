package com.example.producto.service;

import com.example.producto.Entity.Producto;
import com.example.producto.Repositorio.ProductoRepositorio;
import org.aspectj.apache.bcel.classfile.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductoServicioImpl implements ProductoService{
    @Autowired
    private ProductoRepositorio repositorio;

    @Override
    public List<Producto> listarTodosLosProductos() {

        return repositorio.findAll();
    }

    @Override
    public Producto GuardarProducto(Producto producto) {

        return repositorio.save(producto);

    }

    @Override
    public List<Producto> findByCodeContains(String code) {
        return repositorio.findByCodeContains(code);
    }

    @Override
    public Producto findByCode(String code) {
        return repositorio.findByCode(code);
    }

    @Override
    public Producto Actualizar(Producto producto) {
        return repositorio.save(producto);
    }

    @Override
    public Producto deleteBy(String code) {
        return null;
    }


}
