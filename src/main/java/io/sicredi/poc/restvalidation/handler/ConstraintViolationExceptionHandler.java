package io.sicredi.poc.restvalidation.handler;

import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@ControllerAdvice
public class ConstraintViolationExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<Error> handleConstraintViolationException(ConstraintViolationException ex){
        List<ErrorDetail> details =
                ex.getConstraintViolations().stream()
                        .map(e -> new ErrorDetail(e.getPropertyPath().toString(), e.getMessage()))
                        .toList();
        return new ResponseEntity<>(new Error(ex.getMessage(), details), BAD_REQUEST);
    }

}
