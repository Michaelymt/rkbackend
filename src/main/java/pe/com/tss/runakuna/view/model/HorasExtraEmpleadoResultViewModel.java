package pe.com.tss.runakuna.view.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import pe.com.tss.runakuna.json.JsonDateSimpleDeserializer;
import pe.com.tss.runakuna.json.JsonDateSimpleSerializer;

import java.math.BigDecimal;
import java.util.Date;

public class HorasExtraEmpleadoResultViewModel extends PageableFilter {

    private Long idEmpleado;
    private Long idHorasExtra;
    private String motivo;
    private String horaSalidaSolicitado;
    private String horaSalidaHorario;
    private String nombreJefeInmediato;
    private String nombreEmpleado;
    @JsonSerialize(using=JsonDateSimpleSerializer.class)
	@JsonDeserialize(using=JsonDateSimpleDeserializer.class)
	private Date fecha;
	private String horas;
	private String estado;
    private String estadoString;
    private Long horasNoCompensables;
    
    private String horaInicioSolicitado;
    
	private BigDecimal horasSolicitadas;
	private BigDecimal horasExtra;
    
	public Long getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(Long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public Long getIdHorasExtra() {
		return idHorasExtra;
	}
	public void setIdHorasExtra(Long idHorasExtra) {
		this.idHorasExtra = idHorasExtra;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getHoraSalidaSolicitado() {
		return horaSalidaSolicitado;
	}
	public void setHoraSalidaSolicitado(String horaSalidaSolicitado) {
		this.horaSalidaSolicitado = horaSalidaSolicitado;
	}
	public String getHoraSalidaHorario() {
		return horaSalidaHorario;
	}
	public void setHoraSalidaHorario(String horaSalidaHorario) {
		this.horaSalidaHorario = horaSalidaHorario;
	}
	public String getNombreJefeInmediato() {
		return nombreJefeInmediato;
	}
	public void setNombreJefeInmediato(String nombreJefeInmediato) {
		this.nombreJefeInmediato = nombreJefeInmediato;
	}
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getHoras() {
		return horas;
	}
	public void setHoras(String horas) {
		this.horas = horas;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getEstadoString() {
		return estadoString;
	}
	public void setEstadoString(String estadoString) {
		this.estadoString = estadoString;
	}
	public Long getHorasNoCompensables() {
		return horasNoCompensables;
	}
	public void setHorasNoCompensables(Long horasNoCompensables) {
		this.horasNoCompensables = horasNoCompensables;
	}
	public String getHoraInicioSolicitado() {
		return horaInicioSolicitado;
	}
	public void setHoraInicioSolicitado(String horaInicioSolicitado) {
		this.horaInicioSolicitado = horaInicioSolicitado;
	}
	public BigDecimal getHorasSolicitadas() {
		return horasSolicitadas;
	}
	public void setHorasSolicitadas(BigDecimal horasSolicitadas) {
		this.horasSolicitadas = horasSolicitadas;
	}
	public BigDecimal getHorasExtra() {
		return horasExtra;
	}
	public void setHorasExtra(BigDecimal horasExtra) {
		this.horasExtra = horasExtra;
	}
    
}
