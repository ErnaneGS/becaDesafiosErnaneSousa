package io.github.becaErnaneSousa.desafios.exceptions.handle;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class DefaultException {

    private Integer status;
    private String mensagem;
    private LocalDateTime dataHoraAtual;

}
