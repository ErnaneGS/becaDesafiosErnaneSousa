package io.github.becaErnaneSousa.desafios.exceptions.handle;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.transaction.TransactionSystemException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;
import java.time.LocalDateTime;
import java.util.NoSuchElementException;

@ControllerAdvice
public class EzceptionHandle {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<DefaultException> handlde( MethodArgumentNotValidException e ) {
        DefaultException defaultException = new DefaultException();

        defaultException.setMensagem( e.getBindingResult().getAllErrors().stream().findFirst().get().getDefaultMessage() );
        defaultException.setStatus(HttpStatus.BAD_GATEWAY.value());
        defaultException.setDataHoraAtual( LocalDateTime.now() );

        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<DefaultException> handlde( NoSuchElementException e ) {
        DefaultException defaultException = new DefaultException();

        defaultException.setMensagem( "Objeto não encontrado com o id informado" );
        defaultException.setStatus(HttpStatus.NOT_FOUND.value());
        defaultException.setDataHoraAtual( LocalDateTime.now() );

        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResponseEntity<DefaultException> handlde( HttpRequestMethodNotSupportedException e ) {
        DefaultException defaultException = new DefaultException();

        defaultException.setMensagem( e.getLocalizedMessage() );
        defaultException.setStatus(HttpStatus.METHOD_NOT_ALLOWED.value());
        defaultException.setDataHoraAtual( LocalDateTime.now() );

        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }

    @ExceptionHandler(EmptyResultDataAccessException.class)
    public ResponseEntity<DefaultException> handlde( EmptyResultDataAccessException e ) {
        DefaultException defaultException = new DefaultException();

        defaultException.setMensagem( e.getLocalizedMessage() );
        defaultException.setStatus(HttpStatus.NOT_FOUND.value());
        defaultException.setDataHoraAtual( LocalDateTime.now() );

        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<DefaultException> handlde( DataIntegrityViolationException e ) {
        DefaultException defaultException = new DefaultException();

        defaultException.setMensagem( e.getLocalizedMessage() );
        defaultException.setStatus(HttpStatus.NOT_FOUND.value());
        defaultException.setDataHoraAtual( LocalDateTime.now() );

        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }

    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<DefaultException> handlde( ResponseStatusException  e ) {
        DefaultException defaultException = new DefaultException();

        defaultException.setMensagem( e.getLocalizedMessage() );
        defaultException.setStatus(HttpStatus.NOT_FOUND.value());
        defaultException.setDataHoraAtual( LocalDateTime.now() );

        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }

    @ExceptionHandler(TransactionSystemException.class)
    public ResponseEntity<DefaultException> handlde( TransactionSystemException  e ) {
        DefaultException defaultException = new DefaultException();

        defaultException.setMensagem( e.getLocalizedMessage() );
        defaultException.setStatus(HttpStatus.NOT_FOUND.value());
        defaultException.setDataHoraAtual( LocalDateTime.now() );

        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }


    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<DefaultException> handlde( HttpMessageNotReadableException  e ) {
        DefaultException defaultException = new DefaultException();

        defaultException.setMensagem( e.getLocalizedMessage() );
        defaultException.setStatus(HttpStatus.NOT_FOUND.value());
        defaultException.setDataHoraAtual( LocalDateTime.now() );

        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }

}
