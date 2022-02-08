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
import java.math.BigDecimal;
import java.math.BigInteger;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.util.Lazy;

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
@Getter
@Setter
@ToString
public class Detalle {

    //Propiedades
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "DET_ID", length = 20)
    /**Identificador de los detalles de una factura*/
    private String id;

    @Column(name = "DET_CANTIDAD", length = 20)
    /**Cantidad de los productos en una factura*/
    private BigInteger cantidad;

    @Column(name = "DET_IMPORTE", scale = 2, precision = 7)
    /**Importe de la factura*/
    private BigDecimal importe;

    //Constructores

    /**Constructor vacío del detalle*/
    public Detalle() {
    }

    /**Constructor con propiedades del detalle
     * @param id
     * @param cantidad
     * @param importe
     * */
    public Detalle(String id, BigInteger cantidad, BigDecimal importe) {
        this.id = id;
        this.cantidad = cantidad;
        this.importe = importe;
    }


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