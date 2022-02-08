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

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Esta clase representa a un cliente y debe ser usada para almacenar
 * datos e intercambiarlos con otros objetos.
 *
 * @author Enzo Huacacolque Toledo
 * @version 1, 07/02/2022
 */


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
    /**Identificador del Cliente*/
    private String id;

    @Column(name = "CLIE_NOMBRE", length = 25)
    /**Nombre del cliente*/
    private String nombre;

    @Column(name = "CLIE_APELLIDO", length = 25)
    /**Apellido del cliente*/
    private String apellido;

    @Column(name = "CLIE_CORREO", length = 40)
    /**Correo electrónico del cliente*/
    private String correo;

    @Column(name = "CLIE_TELEF", length = 15)
    /**Teléfono del cliente*/
    private String telefono;

    @Column(name = "CLIE_TIP_DOC", length = 15)
    /**Tipo de Documento del cliente para identificación*/
    private String tipo_doc;

    @Column(name = "CLIE_NUM_DOC", length = 25)
    /**Número del Documento del cliente para identificación*/
    private String num_doc;

    //Constructores
    /**Constructor con propiedades del cliente
     * @param id
     * @param nombre
     * @param apellido
     * @param correo
     * @param telefono
     * @param tipo_doc
     * @param num_doc
     * */
    public Cliente(String id, String nombre, String apellido, String correo, String telefono, String tipo_doc, String num_doc) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.tipo_doc = tipo_doc;
        this.num_doc = num_doc;
    }

    /**Constructor vacío del cliente*/
    public Cliente() {}


}
