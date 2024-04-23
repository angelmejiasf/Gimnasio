package Gimnasio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AppGimnasio {

	public static void main(String[] args) {
		String usuario;
		int contraseña;

		Scanner sc = new Scanner(System.in);

		System.out.println("---INICIO DE SESION---");
		System.out.println("Usuario: ");
		usuario = sc.next();
		if (usuario.equals("monitor")) {
			System.out.println("Contraseña: ");
			contraseña = sc.nextInt();

			Monitor Monitor = new Monitor(new ArrayList<ActividadReservada>());

			Monitor.cargaActividades("reservaPendientes.csv", contraseña);
			System.out.println("Monitor " + contraseña + ": ");
			Monitor.leerActividades();

		} else {
			System.out.println("USUARIO NO VALIDO");
		}

	}
}
