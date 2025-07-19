package mx.com.santander.hexagonalmodularmaven.peticiones.adapter.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter

@NoArgsConstructor
@Builder
public class Peticiones {
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
    private String tipoProyecto;
    private BigDecimal margenPresupuestado;
    private BigDecimal margenAcumulado;
    private String planRecuperacion;
    private String comentariosGenerales;
    private String perfil;
    private String nivel;
    private String conocimientosTecnicos;
    private String conocimientosFuncionales;


    public Peticiones(
            Long id,
            String cliente,
            String unidadOrganizativa,
            String nombreGestor,
            String solicitanteMercado,
            String razonSocial,
            String prioridad,
            Integer posiciones,
            String tipoContratacion,
            String codigoProyecto,
            String nombreProyecto,
            String elementoParaContrataciones,
            Integer mesesAsignacion,
            String modalidad,
            String lugarDefinitivo,
            String tipoAsignacion,
            String planCarrera,
            String rolDesarrollo,
            String evaluadorPerformanceTalent,
            Double tasa,
            Double tasaTope,
            String tipoProyecto,
            BigDecimal margenPresupuestado,
            BigDecimal margenAcumulado,
            String planRecuperacion,
            String comentariosGenerales,
            String perfil,
            String nivel,
            String conocimientosTecnicos,
            String conocimientosFuncionales
    ) {
        this.id = id;
        this.cliente = cliente;
        this.unidadOrganizativa = unidadOrganizativa;
        this.nombreGestor = nombreGestor;
        this.solicitanteMercado = solicitanteMercado;
        this.razonSocial = razonSocial;
        this.prioridad = prioridad;
        this.posiciones = posiciones;
        this.tipoContratacion = tipoContratacion;
        this.codigoProyecto = codigoProyecto;
        this.nombreProyecto = nombreProyecto;
        this.elementoParaContrataciones = elementoParaContrataciones;
        this.mesesAsignacion = mesesAsignacion;
        this.modalidad = modalidad;
        this.lugarDefinitivo = lugarDefinitivo;
        this.tipoAsignacion = tipoAsignacion;
        this.planCarrera = planCarrera;
        this.rolDesarrollo = rolDesarrollo;
        this.evaluadorPerformanceTalent = evaluadorPerformanceTalent;
        this.tasa = tasa;
        this.tasaTope = tasaTope;
        this.tipoProyecto = tipoProyecto;
        this.margenPresupuestado = margenPresupuestado;
        this.margenAcumulado = margenAcumulado;
        this.planRecuperacion = planRecuperacion;
        this.comentariosGenerales = comentariosGenerales;
        this.perfil = perfil;
        this.nivel = nivel;
        this.conocimientosTecnicos = conocimientosTecnicos;
        this.conocimientosFuncionales = conocimientosFuncionales;
    }
}
