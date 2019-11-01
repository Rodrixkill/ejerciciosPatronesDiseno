package adapter;

public class Client {

	public static void main(String[] args) {
		Celular celular= new Celular();
		Computadora computadora= new Computadora();
		Tablet tablet= new Tablet();
		//needed to adapt
		
		Lavadora lavadora= new Lavadora();
		Refrigeradores refrigeradores= new Refrigeradores();		
		Televisor televisor= new Televisor();
		ConcreteAdapter lavadoraAdapted = new ConcreteAdapter(lavadora);
		ConcreteAdapter refrigeradoresAdapted = new ConcreteAdapter(refrigeradores);
		ConcreteAdapter televisorAdapted = new ConcreteAdapter(televisor);
		
		ArtefactosElectronicos[] array= new ArtefactosElectronicos[6];
		array[0]=celular;
		array[1]=computadora;
		array[2]=tablet;
		array[3]=lavadoraAdapted;
		array[4]=refrigeradoresAdapted;
		array[5]=televisorAdapted;
		
		for (ArtefactosElectronicos artefactosElectronicos : array) {
			artefactosElectronicos.precio();
			artefactosElectronicos.tiempoDeVida();
			System.out.println();
		}
		
	}

}
