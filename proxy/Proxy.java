package proxy;

public class Proxy implements ISubject {

	private ServidorActual real=null;
	private ServidorRespaldo respaldo=null;
	public Proxy() {
		
		
	}
	
	@Override
	public void cargaArchivos(Archivos archivo) {
		if (real == null) {
			real= new ServidorActual();
		}
		if (respaldo == null) {
			respaldo= new ServidorRespaldo();
		}
		real.cargaArchivos(archivo);
		respaldo.cargaArchivos(archivo);
		
	}
	@Override
	public Archivos descargaArchivos(int key) {
		if (real == null) {
			real= new ServidorActual();
		}
		if (respaldo == null) {
			respaldo= new ServidorRespaldo();
		}
		
		return real.descargaArchivos(key);
	}

}
