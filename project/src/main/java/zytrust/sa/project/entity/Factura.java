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
import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Factura implements Serializable {

    /**UID Serializable*/
    private static final long serialVersionUID = 1L;

    //Propiedades
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid2")
    @Column(name = "FACT_ID", nullable = false, length = 50)
    /**Identificador de la factura*/
    private String id;

    @Column(name = "FACT_ESTADO", nullable = false, length = 10)
    /**Estado de emision de la factura*/
    private String estado;

    @Column(name = "FACT_DESCRIP", length = 100)
    /**Descripcion de la factura*/
    private String descripcion;

    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "FACT_COD_NUM", nullable = false, length = 50)
    /**Codigo numerico de la factura*/
    private BigInteger codigoNumerico;

    @Column(name = "FACT_FECHA_EMISION", nullable = false)
    /**Fecha de emisión de la factura*/
    private LocalDate fechaEmision;

    @Column(name = "FACT_FECHA_PAGO", nullable = false)
    /**Fecha de pago de la factura*/
    private LocalDate fechaPago;

    //Relaciones

    @ManyToOne
    @JoinColumn(name ="CLIE_ID")
    /**Relación con la clase Cliente*/
    private Cliente cliente;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "FACT_ID")
    @JsonIgnore
    /**Relación con la clase Detalles*/
    private List<Detalle> detalles;

}
