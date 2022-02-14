package zytrust.sa.project.exceptions;

public enum CodigoError {

    CLIENTE_NO_EXISTE("El cliente con el " +
            "identificador indicado no existe"),

    ID_UTILIZADO("El identificador indicado" +
            " ya tiene uso"),

    FACTURA_NO_EXISTE("La factura con el " +
            "identificador indicado no existe"),

    PRODUCTO_NO_EXISTE("El producto con el " +
            "identificador indicado no existe"),

    PROBLEMAS_ALMACENAR_CLIENTE("El cliente con el " +
            "identificador indicado no existe"),

    PROBLEMAS_ALMACENAR_FACTURA("La factura con el " +
            "identificador indicado no existe");



    private final String description;

    CodigoError(String description) {
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
}
