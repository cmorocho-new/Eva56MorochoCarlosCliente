package ec.edu.ups.Igestor;

import java.util.List;

import ec.edu.ups.common.GeneralExeption;
import ec.edu.ups.dto.AutorDTO;
import ec.edu.ups.dto.LibroDTO;


public interface ILibreriaONR {
	
	public void guardarLibro(LibroDTO libro) throws GeneralExeption;
	
	public List<AutorDTO> listarAutores() throws GeneralExeption;
	
}
