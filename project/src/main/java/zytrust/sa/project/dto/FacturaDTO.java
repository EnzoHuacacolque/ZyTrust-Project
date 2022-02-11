package zytrust.sa.project.dto;

import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FacturaDTO implements Serializable {

    private String id;

    private String estado;

    private String descripcion;

    private BigInteger codigoNumerico;

    private LocalDate fechaEmision;

    private LocalDate fechaPago;

    private String cliente_id;

}
