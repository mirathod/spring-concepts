package org.milan.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception Handler
 */
@ControllerAdvice
public class GenericExceptionHandler {

    /**
     * Handle Null Pointer Exception
     * @return
     */
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = NullPointerException.class)
    public String handleNullPointerException() {
        return "NullPointerException";
    }
}
