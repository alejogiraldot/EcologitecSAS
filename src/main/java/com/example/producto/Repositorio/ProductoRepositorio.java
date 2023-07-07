package com.example.producto.Repositorio;

import com.example.producto.Entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto,Float > {
    List<Producto> findByCodeContains(String code);

    Producto findByCode(String code);
}
