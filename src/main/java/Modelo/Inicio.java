package Modelo;

import java.util.ArrayList;
import java.util.Scanner;
import Modelo.Persona;
public class Inicio {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList <Persona> personas = new ArrayList<Persona>();
	Persona p = new Persona();
	
	//loop para agregar personas
	while (true) {
		System.out.println("Ingrese nombre");
		String nombre = sc.nextLine();
		System.out.println("Ingrese Apellido");
		String apellido = sc.nextLine();
		System.out.println("Ingrese fechaNac");
		String fechaNac = sc.nextLine();
	
		
		p.setName(nombre);
		p.setAp(apellido);
		p.setfNac(fechaNac);
		personaas.add(p);
		System.out.println("Desea salir?");
		String resp = sc.next();
		if (resp.equals("n")) {
			break;
		}
}
	}
}

