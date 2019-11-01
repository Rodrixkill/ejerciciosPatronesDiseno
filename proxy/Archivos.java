package proxy;

public class Archivos {
	private String titulo;
	private String contenido;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public Archivos(String titulo, String contenido) {
		this.titulo = titulo;
		this.contenido = contenido;
	}
	

}
