package com.evaluacion1.repositories;


import com.evaluacion1.models.Guitarra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Establecemos repositorio
//Extendimos a JpaRepository para usar los metodos de esa libreria
public interface RepositoryGuitarra extends JpaRepository<Guitarra, Long> {


}
