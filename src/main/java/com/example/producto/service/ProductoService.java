package com.example.producto.service;

import com.example.producto.Entity.Producto;

import java.util.List;

public interface ProductoService {
    public List<Producto> listarTodosLosProductos();
    public Producto GuardarProducto(Producto producto);
    List<Producto> findByCodeContains(String code);
    public  Producto findByCode(String code);

    public Producto Actualizar(Producto producto);
    public Producto deleteBy(String code);
}
