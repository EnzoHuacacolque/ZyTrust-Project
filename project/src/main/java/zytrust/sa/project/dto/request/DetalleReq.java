package zytrust.sa.project.dto.request;

import java.math.BigDecimal;
import java.math.BigInteger;

public class DetalleReq {

    /**Identificador de Detalle*/
    private String detalle_id;

    /**Identificador de Factura*/
    private String factura_id;

    /**Identificador de Producto*/
    private String producto_id;

    /**Cantidad de producto*/
    private BigInteger cantidad;

    /**Importe del producto*/
    private BigDecimal importe;
}
