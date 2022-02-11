package zytrust.sa.project.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DetalleDTO implements Serializable {

    private String id;

    private BigInteger cantidad;

    private BigDecimal importe;

    private String factura_id;

    private String producto_id;

}
