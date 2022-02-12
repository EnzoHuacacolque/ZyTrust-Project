/*
 * @(#)Detalle.java
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
import java.math.BigInteger;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

/**
 * Esta clase representa al detalle de las facturas al adquirir ciertos productos
 * y debe ser usada para almacenar
 * datos e intercambiarlos con otros objetos.
 *
 * @author Enzo Huacacolque Toledo
 * @version 1, 07/02/2022
 */

@Entity
@Table(name = "FAC_DETALLES")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Detalle implements Serializable {

    /**UID Serializable*/
    private static final long serialVersionUID = 1L;

    //Propiedades
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid2")
    @Column(name = "DET_ID", nullable = false, length = 50)
    /**Identificador de los detalles de una factura*/
    private String id;

    @Column(name = "DET_CANTIDAD", nullable = false, length = 20)
    /**Cantidad de los productos en una factura*/
    private BigInteger cantidad;

    @Column(name = "DET_IMPORTE", nullable = false, scale = 2, precision = 7)
    /**Importe de la factura*/
    private BigDecimal importe;



    //Relaciones

    @ManyToOne
    @JoinColumn(name = "PROD_ID")
    /**Relación con la clase Producto
     * @param producto
     */
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "FACT_ID") //Unión con Factura
    /**Relación con la clase Factura
     * @param factura
     */
    private Factura factura;
}
/*
class DetallesId{

    private String producto_id;
    private String factura_id;

}
*/