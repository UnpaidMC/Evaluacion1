package com.evaluacion1.controllers;


import javax.validation.Valid;


import com.evaluacion1.models.Guitarra;
import com.evaluacion1.services.GuitarraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller

public class RegistroController {

    @Autowired
    GuitarraService guitarraService; //Traemos el service de GuitarraService para hacer uso del repositorio


    @RequestMapping ("/home/registro")
    public String registro(@ModelAttribute("guitarra") Guitarra guitarra){//Metodo solo para desplegar
                                                                          //pagina de registro

        return "registroGuitarra.jsp";
    }
    @RequestMapping("/registro/mostrar")
    public String mostrarroauto(Model model){


        //Solo mostrar autos mandandole el listado al .jsp
        List<Guitarra> listaGuitarras = guitarraService.findAll();
        model.addAttribute("ListaGuitarras", listaGuitarras);

        return "mostrarautos.jsp";
    }



    @RequestMapping("/home/registro/completo")
    public String guardarGuitarra(@Valid @ModelAttribute("guitarra") Guitarra guitarra,
                                 BindingResult resultado,//BindingResult + nombredevariable permite validar variable
                                 Model model) {

        if (resultado.hasErrors()) {//Validar si resultado tiene errores
            model.addAttribute("msgError", "Datos incorrectos. Comprueba la información.");
            return "registroGuitarra.jsp";
        } else

            guitarraService.GuardarGuitarra(guitarra);
        return "mostrarGuitarras.jsp";//.jsp para mostrar listado de guitarras


    }
    @RequestMapping("/registro/editar/{id}")
    public String editar(@PathVariable("id") Long id, Model model) {
        Guitarra guitarra = guitarraService.BuscarIDGuitarra(id);
        model.addAttribute("guitarra", guitarra); //Establecimos que busque el atributo "guitarra"
        return "editarregistroGuitarra.jsp";                             // Y que agrege los elementos de guitarra

    }

    //Para actualizar la BBDD
    @PostMapping("registro/actualizar/{id}")
    public String actualizarRegistro(@PathVariable("id") Long id, @Valid @ModelAttribute("guitarra") Guitarra guitarra, //Objeto Usuario esta vacio
                                     BindingResult resultado,
                                     Model model) {


        if (resultado.hasErrors()) {//Validar si resultado tiene errores
            model.addAttribute("msgError", "Uno de los datos esta erroneo, porfavor arreglar");

            return "editarregistroGuitarra.jsp";

        }

            guitarra.setId(id); //Agregamos id al objeto
            guitarraService.GuardarGuitarra(guitarra);
            List<Guitarra> listaGuitarras = guitarraService.findAll();
            model.addAttribute("ListaGuitarra", listaGuitarras);
            return "mostrarGuitarras.jsp";


    }
}
