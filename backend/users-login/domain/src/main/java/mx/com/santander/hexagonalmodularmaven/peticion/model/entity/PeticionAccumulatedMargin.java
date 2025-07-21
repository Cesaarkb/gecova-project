package mx.com.santander.hexagonalmodularmaven.peticion.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PeticionAccumulatedMargin {
    private BigDecimal accumulatedMargin;
}
