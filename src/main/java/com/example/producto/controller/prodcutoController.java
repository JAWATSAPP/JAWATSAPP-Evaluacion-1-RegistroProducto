/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.producto.controller;



import com.example.producto.modelo.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author sise
 */
@Controller
public class prodcutoController {
    @GetMapping("/registro")
   public String mostrarFormulario(Model model) {
        model.addAttribute("producto", new Producto());
        return "registro";
        
   }
    @PostMapping("/registro")
    public String registrarProducto(@ModelAttribute Producto producto, Model model){
         model.addAttribute("producto",producto);
         return "exito";
         
    }
}
