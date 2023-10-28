/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.irina.cartelera.repositories;

import com.irina.cartelera.entities.SalaCine;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author irina
 */
public interface SalaCineRepository extends JpaRepository<SalaCine, Integer>{
    
}