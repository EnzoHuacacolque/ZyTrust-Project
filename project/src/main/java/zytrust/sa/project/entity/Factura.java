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
import java.math.BigInteger;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

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
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "FACT_ID", length = 20)
    /**Identificador de la factura*/
    private String id;

    @Column(name = "FACT_ESTADO", nullable = false, length = 10)
    /**Estado de emision de la factura*/
    private String estado;

    @Column(name = "FACT_DESCRIP", length = 100)
    /**Descripcion de la factura*/
    private String descripcion;

    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "FACT_COD_NUM", nullable = false, length = 10)
    /**Codigo numerico de la factura*/
    private BigInteger codigoNumerico;

    @Column(name = "FACT_FECHA_EMISION")
    /**Fecha de emisión de la factura*/
    private LocalDate fechaEmision;

    @Column(name = "FACT_FECHA_PAGO")
    /**Fecha de pago de la factura*/
    private LocalDate fechaPago;

    //Constructores

    /**Constructor vacío de Factura*/
    public Factura() {
    }

    /**Constructor con parámetros de Factura
     * @param id
     * @param estado
     * @param descripcion
     * @param codigoNumerico
     * @param fechaEmision
     * @param fechaPago
     * */
    public Factura(String id, String estado, String descripcion, BigInteger codigoNumerico,
                   LocalDate fechaEmision, LocalDate fechaPago) {
        this.id = id;
        this.estado = estado;
        this.descripcion = descripcion;
        this.codigoNumerico = codigoNumerico;
        this.fechaEmision = fechaEmision;
        this.fechaPago = fechaPago;
    }

    //Relaciones

    @ManyToOne
    @JoinColumn(name ="CLIE_ID")
    /**Relación con la clase Cliente*/
    private Cliente cliente;

}
