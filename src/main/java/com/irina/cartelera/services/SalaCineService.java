package com.irina.cartelera.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irina.cartelera.entities.SalaCine;
import com.irina.cartelera.repositories.SalaCineRepository;

@Service
public class SalaCineService {
    @Autowired
    private SalaCineRepository repoSala;

    //crear sala
    @Transactional
    public void crearSala(String nombre, Integer estado){
        SalaCine sala = new SalaCine();
        sala.setNombre(nombre);
        sala.setEstado(estado);
        repoSala.save(sala);
    }

    //eliminar sala
    @Transactional
    public void eliminarSala(Integer id){
        Optional<SalaCine> sala = repoSala.findById(id);
        if(sala.isPresent()){
            repoSala.deleteById(id);
        }
    }

    //modificar sala
    @Transactional
    public void modificarSala(Integer id, String nombre, Integer estado){
        SalaCine sala = new SalaCine();
        Optional<SalaCine> salaCine = repoSala.findById(id);
        if(salaCine.isPresent()){
            sala.setNombre(nombre);
            sala.setEstado(estado);
            repoSala.save(sala);
        }
    }

    //listar la sala
    public List<SalaCine> listarLasSalas(){
        return repoSala.findAll();
    }
}
