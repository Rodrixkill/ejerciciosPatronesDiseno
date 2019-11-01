package visitor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConcreteVisitor implements IVisitor {

	@Override
	public double visit(Perro perro) {
		Date date = new Date();
		DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
		String enf1=perro.enfermedad1();
		String enf2=perro.enfermedad2();
		if (!enf1.equals("esta sano")) {
			System.out.println("El doctor logra curar la "+enf1+" del perro a fecha y hora "+hourdateFormat.format(date));
		}else {
			System.out.println("El perro esta sano");
		}
		
		if (!enf2.equals("esta sano")) {
			System.out.println("El doctor logra curar la "+enf2+" del perro a fecha y hora "+hourdateFormat.format(date));
		}else {
			System.out.println("El perro esta sano");
		}
		return 0;
	}

	@Override
	public double visit(Gato gato) {
		Date date = new Date();
		DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
		String enf1=gato.enfermedad1();
		String enf2=gato.enfermedad2();
		if (!enf1.equals("esta sano")) {
			System.out.println("El doctor logra curar la "+enf1+" del gato a fecha y hora "+hourdateFormat.format(date));
		}else {
			System.out.println("El gato esta sano");
		}
		
		if (!enf2.equals("esta sano")) {
			System.out.println("El doctor logra curar la "+enf2+" del gato a fecha y hora "+hourdateFormat.format(date));
		}else {
			System.out.println("El gato esta sano");
		}
		return 0;
	}

	@Override
	public double visit(Caballo caballo) {
		Date date = new Date();
		DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
		String enf1=caballo.enfermedad1();
		String enf2=caballo.enfermedad2();
		if (!enf1.equals("esta sano")) {
			System.out.println("El doctor logra curar la "+enf1+" del caballo a fecha y hora "+hourdateFormat.format(date));
		}else {
			System.out.println("El caballo esta sano");
		}
		
		if (!enf2.equals("esta sano")) {
			System.out.println("El doctor logra curar la "+enf2+" del caballo a fecha y hora "+hourdateFormat.format(date));
		}else {
			System.out.println("El caballo esta sano");
		}
		return 0;
	}

	

}
