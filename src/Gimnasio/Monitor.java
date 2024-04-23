package Gimnasio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class Monitor {
	public int Codigo;
	public String nombre;
	public String apellidos;
	public String email;
	public ArrayList<ActividadReservada> Actividades;

	public Monitor(int codigo, String nombre, String apellidos, String email,
			ArrayList<ActividadReservada> actividades) {
		super();
		Codigo = codigo;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		Actividades = actividades;
	}

	public Monitor(ArrayList<ActividadReservada> arrayList) {
		// TODO Auto-generated constructor stub
	}

	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<ActividadReservada> getActividades() {
		return Actividades;
	}

	public void setActividades(ArrayList<ActividadReservada> actividades) {
		Actividades = actividades;
	}

	@Override
	public String toString() {
		return "Monitor [Codigo=" + Codigo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email
				+ ", Actividades=" + Actividades + "]";
	}

	public void cargaActividades(String filename, int codigoMonitor) {
		Actividades=new ArrayList<>();
		File fichero = new File(filename);
		try {
			String cadena = "";
			String[] linea;
			Scanner entrada = new Scanner(fichero);

			// En caso de que queramos saltar la primera linea
			cadena = entrada.nextLine();
			while (entrada.hasNext()) {
				cadena = entrada.nextLine();
				
				linea = cadena.split(";");
				
				
					if(linea[2].equals(String.valueOf(codigoMonitor))) {
						Actividades.add(new ActividadReservada(linea[0], Double.parseDouble(linea[1]),Integer.parseInt(linea[2]),
						Integer.parseInt(linea[3]),Integer.parseInt(linea[4])));
						
					}
			
			}

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	public void leerActividades() {
		
		System.out.println(Actividades);
	}
	
	
}
