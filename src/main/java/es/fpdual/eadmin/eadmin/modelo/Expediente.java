package es.fpdual.eadmin.eadmin.modelo;

import java.util.Date;
import java.util.List;

public class Expediente {

	private Integer codigo;
	private String nombre;
	private Date fechaCreacion;
	private Date fechaArchivado;
	private Boolean publico;
	private EstadoExpediente estado;

	private List<Documento> documentos;

	public Expediente(Integer codigo, String nombre, Date fechaCreacion, Date fechaArchivado, Boolean publico,
			EstadoExpediente estado) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
		this.fechaArchivado = fechaArchivado;
		this.publico = publico;
		this.estado = estado;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public Date getFechaArchivado() {
		return fechaArchivado;
	}

	public Boolean getPublico() {
		return publico;
	}

	public EstadoExpediente getEstado() {
		return estado;
	}

	public List<Documento> getDocumentos() {
		return documentos;
	}

	@Override
	public int hashCode() {
		return codigo.hashCode() + nombre.hashCode() + fechaCreacion.hashCode() + fechaArchivado.hashCode()
				+ publico.hashCode() + estado.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Expediente) {
			return codigo.equals(((Expediente) obj).getCodigo()) && nombre.equals(((Expediente) obj).getNombre())
					&& fechaCreacion.equals(((Expediente) obj).getFechaCreacion())
					&& fechaArchivado.equals(((Expediente) obj).getFechaArchivado())
					&& publico.equals(((Expediente) obj).getPublico()) && estado.equals(((Expediente) obj).getEstado());
		}
		return false;
	}
}
