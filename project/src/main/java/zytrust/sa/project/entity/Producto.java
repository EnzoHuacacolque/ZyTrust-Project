/*
 * @(#)Producto.java
 *
 * Copyright 2022 ZyTrust SA, Todos los derechos reservados.
 * ZT PROPRIETARIO/CONFIDENTIALIDAD. Su uso está sujeto a los
 * términos de la licencia adquirida a ZyTrust SA.
 * No se permite modificar, copiar ni difundir sin autorización
 * expresa de ZyTrust SA.
 */
package zytrust.sa.project.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

/**
 * Esta clase representa a los productos registrados y debe ser usada para
 * intercambiarlos con otros objetos.
 *
 * @author Enzo Huacacolque Toledo
 * @version 1, 07/02/2022
 */


@Entity
@Table(name = "FAC_PRODUCTOS")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Producto implements Serializable {

    /**UID Serializable*/
    private static final long serialVersionUID = 1L;

    //Propiedades
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid2")
    @Column(name = "PROD_ID", length = 50)
    /**Identificador del producto*/
    private String id;

    @Column(name = "PROD_NOMBRE", length = 25)
    /**Nombre del producto*/
    private String nombre;

    @Column(name = "PROD_DESCRIP", length = 100)
    /**Descripción del producto*/
    private String descripcion;

    @Column(name = "PROD_CATEG", length = 20)
    /**Categoria perteneciente a producto*/
    private String categoria;

    @Column(name = "PROD_PRECIO", scale = 2, precision = 7)
    /**Precio unitario del producto*/
    private BigDecimal precio;

}
