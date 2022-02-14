package zytrust.sa.project.dto;

import java.math.BigInteger;
import java.time.LocalDate;

public interface FacturaDTO {


    String getEstado();

    String getDescripcion();

    BigInteger getCodigoNumerico();

    LocalDate getFechaEmision();

    LocalDate getFechaPago();

    String getClienteId();

    String getDetallesId();

    String getNumProductos();


}
