package Gimnasio;

public class ActividadReservada {
	public String nombreActividad;
	public double hora;
	public int codigoMonitor;
	public int numMaxParticipantes;
	public int numParticipantes;
	
	

	public ActividadReservada(String nombreActividad, double hora, int codigoMonitor, int numMaxParticipantes,
			int numParticipantes) {
		super();
		this.nombreActividad = nombreActividad;
		this.hora = hora;
		this.codigoMonitor = codigoMonitor;
		this.numMaxParticipantes = numMaxParticipantes;
		this.numParticipantes = numParticipantes;
	}

	public String getNombreActividad() {
		return nombreActividad;
	}

	public void setNombreActividad(String nombreActividad) {
		this.nombreActividad = nombreActividad;
	}

	public double getHora() {
		return hora;
	}

	public void setHora(double hora) {
		this.hora = hora;
	}

	public int getCodigoMonitor() {
		return codigoMonitor;
	}

	public void setCodigoMonitor(int codigoMonitor) {
		this.codigoMonitor = codigoMonitor;
	}

	public int getNumMaxParticipantes() {
		return numMaxParticipantes;
	}

	public void setNumMaxParticipantes(int numMaxParticipantes) {
		this.numMaxParticipantes = numMaxParticipantes;
	}

	public int getNumParticipantes() {
		return numParticipantes;
	}

	public void setNumParticipantes(int numParticipantes) {
		this.numParticipantes = numParticipantes;
	}

	public int getPlazasDisponibles() {
        return numMaxParticipantes - numParticipantes;
    }
	@Override
	public String toString() {
		return getPlazasDisponibles()+" plazas disponibles "+nombreActividad+ " a las "+hora;
	}

}
