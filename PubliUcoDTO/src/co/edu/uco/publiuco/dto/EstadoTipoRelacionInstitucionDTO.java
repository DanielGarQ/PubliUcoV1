package co.edu.uco.publiuco.dto;

import java.util.UUID;

public class EstadoTipoRelacionInstitucionDTO {
	
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	public EstadoTipoRelacionInstitucionDTO() {
		super();
	}
	public EstadoTipoRelacionInstitucionDTO(UUID identificador, String nombre, String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre("");
		setDescripcion("");
	}
	public final UUID getIdentificador() {
		return identificador;
	}
	public final void setIdentificador(UUID identificador) {
		this.identificador = identificador;
	}
	public final String getNombre() {
		return nombre;
	}
	public final  void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public final String getDescripcion() {
		return descripcion;
	}
	public final void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	

}
