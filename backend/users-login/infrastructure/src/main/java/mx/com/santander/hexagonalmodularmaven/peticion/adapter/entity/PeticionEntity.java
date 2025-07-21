package mx.com.santander.hexagonalmodularmaven.peticion.adapter.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import java.math.BigDecimal;

@Entity
@Table(name = "peticiones")
@Data
@NoArgsConstructor

public class PeticionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cliente", nullable = false)
    private String cliente;

    @Column(name = "unidad_organizativa")
    private String unidadOrganizativa;

    @Column(name = "nombre_gestor")
    private String nombreGestor;

    @Column(name = "solicitante_mercado")
    private String solicitanteMercado;

    @Column(name = "razon_social")
    private String razonSocial;

    @Column(name = "prioridad")
    private String prioridad;

    @Column(name = "posiciones")
    private Integer posiciones;

    @Column(name = "tipo_contratacion")
    private String tipoContratacion;

    @Column(name = "codigo_proyecto")
    private String codigoProyecto;

    @Column(name = "nombre_proyecto")
    private String nombreProyecto;

    @Column(name = "elemento_contrataciones")
    private String elementoParaContrataciones;

    @Column(name = "meses_asignacion")
    private Integer mesesAsignacion;

    @Column(name = "modalidad")
    private String modalidad;

    @Column(name = "lugar_definitivo")
    private String lugarDefinitivo;

    @Column(name = "tipo_asignacion")
    private String tipoAsignacion;

    @Column(name = "plan_carrera")
    private String planCarrera;

    @Column(name = "rol_desarrollo")
    private String rolDesarrollo;

    @Column(name = "evaluador_performance")
    private String evaluadorPerformanceTalent;

    @Column(name = "tasa")
    private double tasa;

    @Column(name = "tasa_tope")
    private Double tasaTope;

    @Column(name = "tipo_proyecto")
    private String tipoProyecto;

    @Column(name = "margen_presupuestado")
    private BigDecimal margenPresupuestado;

    @Column(name = "margen_acumulado")
    private BigDecimal margenAcumulado;

    @Column(name = "plan_recuperacion")
    private String planRecuperacion;

    @Column(name = "comentarios_generales")
    private String comentariosGenerales;

    @Column(name = "perfil")
    private String perfil;

    @Column(name = "nivel")
    private String nivel;

    @Column(name = "conocimientos_tecnicos")
    private String conocimientosTecnicos;

    @Column(name = "conocimientos_funcionales")
    private String conocimientosFuncionales;
}
