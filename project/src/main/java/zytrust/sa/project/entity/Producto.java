package zytrust.sa.project.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "FAC_PRODUCTOS")
@Getter
@Setter
@ToString
public class Producto {

    //Propiedades
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "PROD_ID", length = 20)
    private String id;

    @Column(name = "PROD_NOMBRE", length = 25)
    private String nombre;

    @Column(name = "PROD_DESCRIP", length = 100)
    private String descripcion;

    @Column(name = "PROD_CATEG", length = 20)
    private String categoria;

    @Column(name = "PROD_PRECIO", scale = 2, precision = 7)
    private BigDecimal precio;

    //Constructores
    public Producto() {
    }

    public Producto(String id, String nombre, String descripcion, String categoria, BigDecimal precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
    }
}
