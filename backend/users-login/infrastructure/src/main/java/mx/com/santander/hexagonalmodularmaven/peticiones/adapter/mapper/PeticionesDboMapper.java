package mx.com.santander.hexagonalmodularmaven.peticiones.adapter.mapper;

import mx.com.santander.hexagonalmodularmaven.peticiones.adapter.dto.Peticiones;
import mx.com.santander.hexagonalmodularmaven.peticiones.adapter.dto.PeticionesDTO;
import mx.com.santander.hexagonalmodularmaven.peticiones.adapter.entity.PeticionesEntity;
import org.springframework.stereotype.Component;

@Component
public class PeticionesDboMapper {

    public Peticiones toDomain(PeticionesEntity e)
    {

        return new Peticiones(

                e.getId(),
                e.getCliente(),
                e.getUnidadOrganizativa(),
                e.getNombreGestor(),
                e.getSolicitanteMercado(),
                e.getRazonSocial(),
                e.getPrioridad(),
                e.getPosiciones(),
                e.getTipoContratacion(),
                e.getCodigoProyecto(),
                e.getNombreProyecto(),
                e.getElementoParaContrataciones(),
                e.getMesesAsignacion(),
                e.getModalidad(),
                e.getLugarDefinitivo(),
                e.getTipoAsignacion(),
                e.getPlanCarrera(),
                e.getRolDesarrollo(),
                e.getEvaluadorPerformanceTalent(),
                e.getTasa(),
                e.getTasaTope(),
                e.getTipoProyecto(),
                e.getMargenPresupuestado(),
                e.getMargenAcumulado(),
                e.getPlanRecuperacion(),
                e.getComentariosGenerales(),
                e.getPerfil(),
                e.getNivel(),
                e.getConocimientosTecnicos(),
                e.getConocimientosFuncionales()
        );
    }

    public PeticionesEntity toEntity(Peticiones d) {
        var e = new PeticionesEntity();
        e.setId(d.getId());
        e.setCliente(d.getCliente());
        e.setUnidadOrganizativa(d.getUnidadOrganizativa());
        e.setNombreGestor(d.getNombreGestor());
        e.setSolicitanteMercado(d.getSolicitanteMercado());
        e.setRazonSocial(d.getRazonSocial());
        e.setPrioridad(d.getPrioridad());
        e.setPosiciones(d.getPosiciones());
        e.setTipoContratacion(d.getTipoContratacion());
        e.setCodigoProyecto(d.getCodigoProyecto());
        e.setNombreProyecto(d.getNombreProyecto());
        e.setElementoParaContrataciones(d.getElementoParaContrataciones());
        e.setMesesAsignacion(d.getMesesAsignacion());
        e.setModalidad(d.getModalidad());
        e.setLugarDefinitivo(d.getLugarDefinitivo());
        e.setTipoAsignacion(d.getTipoAsignacion());
        e.setPlanCarrera(d.getPlanCarrera());
        e.setRolDesarrollo(d.getRolDesarrollo());
        e.setEvaluadorPerformanceTalent(d.getEvaluadorPerformanceTalent());
        e.setTasa(d.getTasa());
        e.setTasaTope(d.getTasaTope());
        e.setTipoProyecto(d.getTipoProyecto());
        e.setMargenPresupuestado(d.getMargenPresupuestado());
        e.setMargenAcumulado(d.getMargenAcumulado());
        e.setPlanRecuperacion(d.getPlanRecuperacion());
        e.setComentariosGenerales(d.getComentariosGenerales());
        e.setPerfil(d.getPerfil());
        e.setNivel(d.getNivel());
        e.setConocimientosTecnicos(d.getConocimientosTecnicos());
        e.setConocimientosFuncionales(d.getConocimientosFuncionales());
        return e;
    }
}
