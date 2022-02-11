package zytrust.sa.project.dto;


import java.io.Serializable;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductoDTO implements Serializable {

    private String id;

    private String nombre;

    private String descripcion;

    private String categoria;

    private BigDecimal precio;
}
