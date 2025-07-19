package mx.com.santander.hexagonalmodularmaven.peticiones.adapter.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PeticionesDTO {
    private Long id;
    private String cliente;
    private String unidadOrganizativa;
    private String nombreGestor;
    private String solicitanteMercado;
    private String razonSocial;
    private String prioridad;
    private Integer posiciones;
    private String tipoContratacion;
    private String codigoProyecto;
    private String nombreProyecto;
    private String elementoParaContrataciones;
    private Integer mesesAsignacion;
    private String modalidad;
    private String lugarDefinitivo;
    private String tipoAsignacion;
    private String planCarrera;
    private String rolDesarrollo;
    private String evaluadorPerformanceTalent;
    private Double tasa;
    private Double tasaTope;
    private BigDecimal margenPresupuestado;
    private BigDecimal margenAcumulado;
    private String planRecuperacion;
    private String comentariosGenerales;
    private String perfil;
    private String nivel;
    private String conocimientosTecnicos;
    private String conocimientosFuncionales;
}