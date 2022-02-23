package zytrust.sa.project.dto.request;

import lombok.Data;

import javax.persistence.Column;
import java.time.LocalDate;

@Data
public class FacturaReq {

    /**Identificador de la factura*/
    private String factura_id;

    /**Identificador del cliente*/
    private String cliente_id;

    /**Fecha de emisión de la factura*/
    private LocalDate fechaEmision;

    /**Fecha de pago de la factura*/
    private LocalDate fechaPago;

}
