package zytrust.sa.project.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Table(name = "FAC_DETALLES")
@Getter
@Setter
@ToString
public class Detalle {

    //Propiedades
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "DET_ID", length = 20)
    private String id;

    @Column(name = "DET_CANTIDAD", length = 20)
    private String cantidad;

    @Column(name = "DET_IMPORTE", scale = 2, precision = 7)
    private BigDecimal importe;

    //Constructores
    public Detalle() {
    }

    public Detalle(String id, String cantidad, BigDecimal importe) {
        this.id = id;
        this.cantidad = cantidad;
        this.importe = importe;
    }


    //Relaciones
    @ManyToOne
    @JoinColumn(name = "PROD_ID") //Unión con Producto
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "FACT_ID") //Unión con Factura
    private Factura factura;
}
