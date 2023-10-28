
package com.irina.cartelera.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author irina
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pelicula {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idPelicula;
    
    private String nombre;
    private Integer duracion;

}
