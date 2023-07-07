package com.example.producto.Controller;

import com.example.producto.Entity.Producto;
import com.example.producto.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;


@Controller
public class ProductoControllador {

    @Autowired
    private ProductoService servicio;

    @GetMapping({"/Producto","/"})
    public String listar(Model model){
        model.addAttribute("Producto");
        return "Producto";
    }
    @GetMapping("/CrearProducto")
    public String crear(Model model){
        Producto producto = new Producto();
        String DATE_FORMAT = "yyyyMMdd";
        SimpleDateFormat sdf =
                new SimpleDateFormat(DATE_FORMAT);
        Calendar c1 = Calendar.getInstance(); // today
        producto.setCode(sdf.format(c1.getTime()));
        List<Producto> cantidad = servicio.findByCodeContains(producto.getCode());
        producto.setCode(sdf.format(c1.getTime())+(cantidad.size()+1));
        model.addAttribute("Producto", producto);
        return "Crear";
    }

    @PostMapping("/Producto")
    public String GuardarProducto(@ModelAttribute("Producto") Producto producto){
        servicio.GuardarProducto(producto);
        return "redirect:/Producto";
    }

    @GetMapping("/ObtenerProducto")
    public String ObtenerProducto(){
        return "ObtenerProducto";
    }

    @GetMapping("/BuscarProducto")
    public String BuscarProducto(String code, Model model){
        Producto modelo = servicio.findByCode(code);
        model.addAttribute("Producto", modelo);
        return "buscarProducto";
    }

    @GetMapping("/Obtener")
    public String Obtener(String code, Model model){
        Producto modelo = servicio.findByCode(code);
        model.addAttribute("Producto", modelo);
        return "Obtener";
    }
}
