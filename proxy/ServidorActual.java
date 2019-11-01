package proxy;

import java.util.ArrayList;

public class ServidorActual implements ISubject {
	ArrayList<Archivos> archivos= new ArrayList<>();
	int value=0;

	@Override
	public void cargaArchivos(Archivos archivo) {
		archivos.add(archivo);
		System.out.println("archivo numero "+value+" ingresado");
		value++;
	}



	@Override
	public Archivos descargaArchivos(int key) {
		return archivos.get(key);
	}
	

}
