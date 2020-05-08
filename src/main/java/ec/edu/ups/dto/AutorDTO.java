package ec.edu.ups.dto;

import java.io.Serializable;
import ec.edu.ups.common.GeneralDTO;
import ec.edu.ups.common.Genero;


public class AutorDTO extends GeneralDTO implements Serializable {

	private static final long serialVersionUID = 2192746806740216557L;
	
	private String nombre;
	
	private Genero genero;
	
	@Override
	public String toString() {
		return nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

   
}
