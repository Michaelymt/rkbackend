package pe.com.tss.runakuna.service;

import java.util.List;

import pe.com.tss.runakuna.view.model.AlertaViewModel;
import pe.com.tss.runakuna.view.model.AlertaEmpleadoViewModel;
import pe.com.tss.runakuna.view.model.AlertaFilterViewModel;
import pe.com.tss.runakuna.view.model.AlertaResultViewModel;
import pe.com.tss.runakuna.view.model.GeneraMsjeAlertaEmpleadoViewModel;
import pe.com.tss.runakuna.view.model.NotificacionViewModel;

/**
 * Created by josediaz on 14/12/2016.
 */
public interface AlertaService extends MaintenanceService<AlertaFilterViewModel, AlertaResultViewModel, AlertaViewModel, NotificacionViewModel, Long> {

    public AlertaViewModel obtenerAlerta(String codigo);
    //NotificacionViewModel registrarAlerta(AlertaViewModel alertaDto);
    //NotificacionViewModel actualizarAlerta(AlertaViewModel alertaDto);
    
    //List<AlertaViewModel> obtenerAlertas(AlertaViewModel alertaDto);
    //AlertaViewModel obtenerAlertaDetalle(Long idAlerta);
    List<AlertaEmpleadoViewModel> obtenerMensajeAlerta(Long idEmpleado);
    NotificacionViewModel generarMensajeAlerta(GeneraMsjeAlertaEmpleadoViewModel msjeAlertaDto);
	//public List<AlertaViewModel> obtenerSubscriptoresAlertas(AlertaViewModel dto);
}
