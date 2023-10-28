
package com.irina.cartelera.entities;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
public class PeliculaSalaCine {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idPeliculaSala;
    
    @Temporal(TemporalType.TIMESTAMP) 
    private Date fechaPublicacion;
    @Temporal(TemporalType.TIMESTAMP) 
    private Date fechaFin;
    
}
