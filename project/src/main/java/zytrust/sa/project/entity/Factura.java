package zytrust.sa.project.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

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
    private String id;

    @Column(name = "FACT_ESTADO", nullable = false, length = 10)
    private String estado;

    @Column(name = "FACT_DESCRIP", length = 100)
    private String descripcion;

    @Column(name = "FACT_COD_NUM", nullable = false, length = 10)
    private String codigonumerico;

    @Column(name = "FACT_FECHA_EMISION")
    private LocalDate fechaemision;

    @Column(name = "FACT_FECHA_PAGO")
    private LocalDate fechapago;

    //Constructores
    public Factura() {
    }

    public Factura(String id, String estado, String descripcion, String codigonumerico, LocalDate fechaemision, LocalDate fechapago) {
        this.id = id;
        this.estado = estado;
        this.descripcion = descripcion;
        this.codigonumerico = codigonumerico;
        this.fechaemision = fechaemision;
        this.fechapago = fechapago;
    }
}
