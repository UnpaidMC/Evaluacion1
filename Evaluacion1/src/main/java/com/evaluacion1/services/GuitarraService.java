package com.evaluacion1.services;

import com.evaluacion1.models.Guitarra;
import com.evaluacion1.repositories.RepositoryGuitarra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
public class GuitarraService {

    @Autowired
    RepositoryGuitarra repositoryGuitarra;

    public void GuardarGuitarra(@Valid Guitarra guitarra) {
        repositoryGuitarra.save(guitarra);
    }
    public List<Guitarra> findAll(){

        return repositoryGuitarra.findAll();


    }
    public Guitarra BuscarIDGuitarra(Long id){

        return repositoryGuitarra.findById(id).get(); //.get() especificamos el tipo de dato en este caso
                                                      //el tipo de dato es Guitarra(objeto)


    }
}
