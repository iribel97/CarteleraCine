package com.irina.cartelera.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irina.cartelera.entities.Pelicula;
import com.irina.cartelera.repositories.PeliculaRepository;

@Service
public class PeliculaService {

    @Autowired
    private PeliculaRepository repoPeli;

    // Metodo Para crear una peli
    @Transactional
    public void crearPeli(String nombre, Integer duracion) {
        Pelicula pelicula =new Pelicula();
        pelicula.setNombre(nombre);
        pelicula.setDuracion(duracion);
        repoPeli.save(pelicula);
    }

    // Metodo para eliminar una peli
    @Transactional
    public void eliminarPeli(Integer id) {
        Optional<Pelicula> peli = repoPeli.findById(id);
        if (peli.isPresent()) {
            repoPeli.deleteById(id);
        }
    }

    // Metodo para modificar una peli
    @Transactional
    public void modificarPeli(Integer id, String nombre, Integer duracion) {
        Pelicula pelicula =new Pelicula();
        Optional<Pelicula> peli = repoPeli.findById(id);
        if (peli.isPresent()) {
            pelicula.setNombre(nombre);
            pelicula.setDuracion(duracion);
            repoPeli.save(pelicula);
        }
    }

    // Metodo para listar peliculas
    public List<Pelicula> mostrarPeliculas(){
        return repoPeli.findAll();
    }
}
