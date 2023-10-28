package com.irina.cartelera.services;

import com.irina.cartelera.entities.Pelicula;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irina.cartelera.entities.PeliculaSalaCine;
import com.irina.cartelera.repositories.PeliculaRepository;
import com.irina.cartelera.repositories.PeliculaSalaCineRepository;
import com.irina.cartelera.repositories.SalaCineRepository;
import java.util.ArrayList;
import java.util.List;

@Service
public class PeliculaSalaCineService {
    @Autowired
    private PeliculaSalaCineRepository repoPS;
    @Autowired
    private PeliculaRepository repoPeli;
    @Autowired
    private SalaCineRepository repoSala;

    //crear
    @Transactional
    public void crearPeliculaSalaCine(Integer idPelicula, Integer idSala, String fechaFin){
        LocalDate localDate = LocalDate.now();
        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        Date dateEnd = null;
        

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try{
            dateEnd = dateFormat.parse(fechaFin);
        }catch(Exception e){
            System.out.println("Error al parsear la fecha");
        }
        

        PeliculaSalaCine peliculaSalaCine = new PeliculaSalaCine();
        peliculaSalaCine.setPelicula(repoPeli.findById(idPelicula).get());
        peliculaSalaCine.setSalaCine(repoSala.findById(idSala).get());
        peliculaSalaCine.setFechaPublicacion(date);
        peliculaSalaCine.setFechaFin(dateEnd);
        repoPS.save(peliculaSalaCine);
    }

    //eliminar
    @Transactional
    public void eliminarPeliculaSalaCine(Integer id){
        Optional<PeliculaSalaCine> peliculaSalaCine = repoPS.findById(id);

        if(peliculaSalaCine.isPresent()){
            repoPS.deleteById(id);
        }
    }

    //modificar
    @Transactional
    public void modificarPeliculaSalaCine(Integer id, Integer idPelicula, Integer idSala, String fechaFin, String fechaInicio){
        Date dateStart = null;
        Date dateEnd = null;
        

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try{
            dateStart = dateFormat.parse(fechaInicio);
            dateEnd = dateFormat.parse(fechaFin);
        }catch(Exception e){
            System.out.println("Error al parsear la fecha");
        }
        

        PeliculaSalaCine peliculaSalaCine = new PeliculaSalaCine();
        Optional<PeliculaSalaCine> peliculaSalaCine2 = repoPS.findById(id);
        if(peliculaSalaCine2.isPresent()){
            peliculaSalaCine.setPelicula(repoPeli.findById(idPelicula).get());
            peliculaSalaCine.setSalaCine(repoSala.findById(idSala).get());
            peliculaSalaCine.setFechaPublicacion(dateStart);
            peliculaSalaCine.setFechaFin(dateEnd);
            repoPS.save(peliculaSalaCine);
        }
    }
    
    //buscar por nombre
    public List<PeliculaSalaCine> buscarPeliPorNombre(String nombre, Integer idSala){
       List<PeliculaSalaCine> listadoGeneral = repoPS.findAll();
       
       List<PeliculaSalaCine> listadoPS = new ArrayList<>();
       
        for (PeliculaSalaCine pelis : listadoGeneral) {
            if (pelis.getPelicula().getNombre().equals(nombre) && pelis.getSalaCine().getIdSala().equals(idSala)) {
                listadoPS.add(pelis);
            }
        }
        
        return listadoPS;
    }
}
