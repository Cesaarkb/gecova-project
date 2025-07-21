package mx.com.santander.hexagonalmodularmaven.peticion.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PeticionBudgetedMargin {
    private BigDecimal budgetedMargin;
}
