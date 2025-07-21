package mx.com.santander.hexagonalmodularmaven.peticion.adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class PeticionErrorResponse {
    private LocalDateTime timestamp;
    private int status;
    private String error;
    private String message;
}
