package util;

import java.sql.Date;
import entities.Post;

public class Comentario {
	
	private String texto;
	
	public Comentario() {}

	public Comentario(String texto) {
		super();
		this.texto = texto;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
}