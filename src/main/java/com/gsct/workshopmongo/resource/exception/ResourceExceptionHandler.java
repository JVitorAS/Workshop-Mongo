package com.gsct.workshopmongo.resource.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.gsct.workshopmongo.services.exception.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, WebRequest request) {
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(
            System.currentTimeMillis(),
            status.value(),
            "Not Found",
            e.getMessage(),
            request.getDescription(false)
        );
        
        return ResponseEntity.status(status).body(err);
    }
}
