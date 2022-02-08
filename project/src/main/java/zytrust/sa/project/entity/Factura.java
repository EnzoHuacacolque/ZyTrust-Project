/*
 * @(#)Factura.java
 *
 * Copyright 2022 ZyTrust SA, Todos los derechos reservados.
 * ZT PROPRIETARIO/CONFIDENTIALIDAD. Su uso está sujeto a los
 * términos de la licencia adquirida a ZyTrust SA.
 * No se permite modificar, copiar ni difundir sin autorización
 * expresa de ZyTrust SA.
 */
package zytrust.sa.project.entity;

import javax.persistence.*;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Esta clase representa a la factura y debe ser usada para almacenar
 * datos e intercambiarlos con otros objetos.
 *
 * @author Enzo Huacacolque Toledo
 * @version 1, 07/02/2022
 */

@Entity
@Table(name = "FAC_FACTURAS")
@Getter
@Setter
@ToString
public class Factura {

    //Propiedades
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "FACT_ID", length = 20)
    /**Identificador de la factura*/
    private String id;

    @Column(name = "FACT_ESTADO", nullable = false, length = 10)
    /**Estado de emisión de la factura*/
    private String estado;

    @Column(name = "FACT_DESCRIP", length = 100)
    /**Descripción de la factura*/
    private String descripcion;

    @Column(name = "FACT_COD_NUM", nullable = false, length = 10)
    /**Código numérico de la factura*/
    private String codigonumerico;

    @Column(name = "FACT_FECHA_EMISION")
    /**Fecha de emisión de la factura*/
    private LocalDate fechaemision;

    @Column(name = "FACT_FECHA_PAGO")
    /**Fecha de pago de la factura*/
    private LocalDate fechapago;

    //Constructores

    /**Constructor vacío de Factura*/
    public Factura() {
    }

    /**Constructor con parámetros de Factura
     * @param id
     * @param estado
     * @param descripcion
     * @param codigonumerico
     * @param fechaemision
     * @param fechapago
     * */
    public Factura(String id, String estado, String descripcion, String codigonumerico, LocalDate fechaemision, LocalDate fechapago) {
        this.id = id;
        this.estado = estado;
        this.descripcion = descripcion;
        this.codigonumerico = codigonumerico;
        this.fechaemision = fechaemision;
        this.fechapago = fechapago;
    }

    //Relaciones

    @ManyToOne
    @JoinColumn(name ="CLIE_ID")
    /**Relación con la clase Cliente*/
    private Cliente cliente;

}
