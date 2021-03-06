package pe.com.tss.runakuna.service;

import java.util.List;

import pe.com.tss.runakuna.view.model.ReporteMarcacionFilterViewModel;
import pe.com.tss.runakuna.view.model.ReporteMarcacionResultViewModel;
import pe.com.tss.runakuna.view.model.NotificacionViewModel;
import pe.com.tss.runakuna.view.model.ReporteMarcacionViewModel;

/**
 * Created by josediaz on 14/12/2016.
 */
public interface ReporteMarcacionService extends MaintenanceService<ReporteMarcacionFilterViewModel, ReporteMarcacionResultViewModel, ReporteMarcacionViewModel, NotificacionViewModel, Long>{

    //NotificacionViewModel registrarReporteMarcacion(ReporteMarcacionViewModel reporteMarcacionDto);
    //NotificacionViewModel actualizarReporteMarcacion(ReporteMarcacionViewModel reporteMarcacionDto);
    //List<ReporteMarcacionViewModel> obtenerReportes(ReporteMarcacionFilterViewModel reporteMarcacionDto);
    ReporteMarcacionViewModel obtenerReporteMarcacionDetalle(Long idReporteMarcacion);
	
	List<ReporteMarcacionViewModel> obtenerReportesJob(ReporteMarcacionFilterViewModel reporteMarcacionDto);
	//List<ReporteMarcacionViewModel> obtenerSubscriptores(ReporteMarcacionFilterViewModel dto);
	NotificacionViewModel eliminarReporteMarcacion(Long idReporteMarcacion);
    
}
