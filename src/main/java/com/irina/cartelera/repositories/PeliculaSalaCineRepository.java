/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.irina.cartelera.repositories;

import com.irina.cartelera.entities.PeliculaSalaCine;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author irina
 */
@Repository
public interface PeliculaSalaCineRepository extends JpaRepository<PeliculaSalaCine, Integer>{
    @Query(value = "SELECT ps FROM PeliculaSalaCine ps WHERE ps.pelicula.nombre = :nombre AND ps.salaCine.idSala = :idSala")
        List<PeliculaSalaCine> buscarNombre(@Param("nombre") String nombre,@Param("idSala") Long idSala);
        
        
    @Query(value="SELECT ps FROM PeliculaSalaCine ps WHERE ps.salaCine.nombre = :nombre")
    List<PeliculaSalaCine> buscarPeliPorSala(@Param("nombre") String nombre);
}
