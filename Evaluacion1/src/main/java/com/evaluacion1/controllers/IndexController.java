package com.evaluacion1.controllers;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller //Establecimos que clase es controlador
public class IndexController {

    //Creacion de rutas

    @RequestMapping("/home") //Ruta inicial es home
    public String home(Model model) {


        return "home.jsp"; //retornamos el .jsp de home

    }
}
