package com.irina.cartelera.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.irina.cartelera.entities.Pelicula;
import com.irina.cartelera.entities.PeliculaSalaCine;
import com.irina.cartelera.services.PeliculaSalaCineService;
import com.irina.cartelera.services.PeliculaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pelicula")
public class PeliculaControlador {
    @Autowired
    private PeliculaService peliServ;
    @Autowired
    private PeliculaSalaCineService peliSalaServ;

    //Metodo get para mostrar las peliculas
    @GetMapping
    public List<Pelicula> mostrarPeliculas(){return peliServ.mostrarPeliculas();}

    /*
     * Buscar la película de acuerdo con el nombre de la película e identificador de la sala. REQUERIDO
    */
    @PostMapping("/buscarPorNombre")
    public List<PeliculaSalaCine> buscarPeli(@RequestBody String nombrePeli, @RequestBody Integer idSala){
        return peliSalaServ.buscarPeliPorNombre(nombrePeli, idSala);
    }
}
