package com.inventario.exceptions;

/**
 * @author jonatan.velasco
 */

public class ExceptionHandler extends RuntimeException {

    String message;
    Object objets;

    public ExceptionHandler(String message, Object... objets) {
        this.message = message;
        this.objets = objets;
    }

    private static final long serialVersionUID = 1L;

}
