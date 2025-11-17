package application;

import model.device.ComboDevice;
import model.device.ConcretPrinter;
import model.device.ConcretScanner;

public class Program {

	public static void main(String[] args) {
		//Implementa somente uma interface e herda Device
		ConcretPrinter p = new ConcretPrinter("1999");
		p.processDoc("My latter");
		p.print("My latter");
		System.out.println();
		
		//Implementa somente uma interface e herda Device
		ConcretScanner s = new ConcretScanner("1995");
		s.processDoc("Email");
		System.out.println(s.scan());
		System.out.println();

		/*
		 * Aqui e implementado duas interfaces Print e Scan em uma unica classe ComboDevice.
		 * ComboDevice herda de Device seus atributos e metodos e cumpre o contrato com as interfaces
		 * Na linguagem java não permite Herança multipla pois pode causar ambiquidade entre metodos.
		 */
		ComboDevice c = new ComboDevice("1900");
		c.processDoc("My dissertation");
		c.print("My dissertation");
		System.out.println(c.scan());

	}

}
