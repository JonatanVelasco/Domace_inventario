package com.inventario.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Tabla con la información de las encuestas del sistema
 * @author jonatan.velasco
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "products")
public class ProductoEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "stock")
    private Integer stock;

    @Column(name = "price")
    private String price;

    @Column(name = "id_subcategory")
    private String id_subcategory;

    @Column(name = "create_at")
    private Date create_at;

    @Column(name = "update_at")
    private Date update_at;


}


