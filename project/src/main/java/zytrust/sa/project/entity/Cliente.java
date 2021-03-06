/*
 * @(#)Cliente.java
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
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;



/**
 * Esta clase representa a un cliente y debe ser usada para almacenar
 * datos e intercambiarlos con otros objetos.
 *
 * @author Enzo Huacacolque Toledo
 * @version 1, 07/02/2022
 */


@Entity
@Table(name = "FAC_CLIENTES")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cliente implements Serializable {

    /**UID Serializable*/
    private static final long serialVersionUID = 1L;

    //Propiedades
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid2")
    @Column(name = "CLIE_ID", length = 50)
    /**Identificador del Cliente*/
    private String id;

    @Column(name = "CLIE_NOMBRE", nullable = false, length = 25)
    /**Nombre del cliente*/
    private String nombre;

    @Column(name = "CLIE_APELLIDO", nullable = false, length = 25)
    /**Apellido del cliente*/
    private String apellido;

    @Column(name = "CLIE_CORREO", nullable = false, length = 40)
    /**Correo electrónico del cliente*/
    private String correo;

    @Column(name = "CLIE_TELEF", nullable = false, length = 15)
    /**Teléfono del cliente*/
    private String telefono;

    @Column(name = "CLIE_TIP_DOC", nullable = false, length = 15)
    /**Tipo de Documento del cliente para identificación*/
    private String tipoDoc;

    @Column(name = "CLIE_NUM_DOC", nullable = false, length = 25)
    /**Número del Documento del cliente para identificación*/
    private String numDoc;

    //Relaciones
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "CLIE_ID")
    @JsonIgnore
    /**Relación con la clase Facturas*/
    private List<Factura> facturas;
}
