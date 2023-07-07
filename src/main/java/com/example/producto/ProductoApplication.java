package com.example.producto;
import com.example.producto.Entity.Producto;
import com.example.producto.Repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;

@SpringBootApplication
public class ProductoApplication{
    public static void main(String[] args){
        SpringApplication.run(ProductoApplication.class, args);
    }
}
