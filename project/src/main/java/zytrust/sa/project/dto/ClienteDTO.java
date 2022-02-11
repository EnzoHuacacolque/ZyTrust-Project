package zytrust.sa.project.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClienteDTO implements Serializable {

    private String id;

    private String nombre;

    private String apellido;

    private String correo;

    private String telefono;

    private String tipoDoc;

    private String numDoc;

}
