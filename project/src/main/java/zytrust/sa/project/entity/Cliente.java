package zytrust.sa.project.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "FAC_CLIENTES")
@Getter
@Setter
@ToString
public class Cliente {

    //Propiedades
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "CLIE_ID", length = 20)
    private String id;

    @Column(name = "CLIE_NOMBRE", length = 25)
    private String nombre;

    @Column(name = "CLIE_APELLIDO", length = 25)
    private String apellido;

    @Column(name = "CLIE_CORREO", length = 40)
    private String correo;

    @Column(name = "CLIE_TELEF", length = 15)
    private String teléfono;

    @Column(name = "CLIE_TIP_DOC", length = 15)
    private String tipo_doc;

    @Column(name = "CLIE_NUM_DOC", length = 25)
    private String num_doc;

    //Constructores
    public Cliente(String id, String nombre, String apellido, String correo, String teléfono, String tipo_doc, String num_doc) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.teléfono = teléfono;
        this.tipo_doc = tipo_doc;
        this.num_doc = num_doc;
    }

    public Cliente() {}

    //Relaciones

}
