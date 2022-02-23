package zytrust.sa.project.exceptions;

public class ZyTrustException extends RuntimeException{

    public CodigoError codigoError;

    public ZyTrustException(CodigoError codigoError){
        this.codigoError = codigoError;
    }
}
