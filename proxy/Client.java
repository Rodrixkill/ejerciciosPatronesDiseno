package proxy;

public class Client {

	public static void main(String[] args) {
		Proxy proxy = new Proxy();
		Archivos archivos1= new Archivos("titulo1", "Contenido1");
		Archivos archivos2= new Archivos("titulo2", "Contenido2");
		proxy.cargaArchivos(archivos1);
		proxy.cargaArchivos(archivos2);
		
		System.out.println("Contenido archivo 2: "+proxy.descargaArchivos(1).getContenido());
	}

}
