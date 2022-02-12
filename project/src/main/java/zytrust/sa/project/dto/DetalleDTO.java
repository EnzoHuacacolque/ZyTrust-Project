package zytrust.sa.project.dto;

import java.math.BigDecimal;
import java.math.BigInteger;



public interface DetalleDTO {


    BigInteger getCantidad();

    BigDecimal getImporte();

    String getFacturaID();

    String getProductoId();

}
