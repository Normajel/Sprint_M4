package Sprint_M4;

import java.util.Date;

public class Profesional extends Usuario {
    private String titulo;
    private Date fechaIngreso;

    // Constructor sin parámetros
    public Profesional() {}

    // Constructor con parámetros
    public Profesional(String nombre, Date fechaNacimiento, int run, String titulo, Date fechaIngreso) {
        super(nombre, fechaNacimiento, run);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }
 // Constructor con parámetros
    public Profesional(String nombreProfesional, String apellidosProfesional, Date fechaNacimientoProfesional,
        int runProfesional, String tituloProfesional, Date fechaIngresoProfesional) {
        super(nombreProfesional, fechaNacimientoProfesional, runProfesional);
        this.titulo = tituloProfesional;
        this.fechaIngreso = fechaIngresoProfesional;
    }


	public boolean validarTitulo() {
        return titulo != null && titulo.length() >= 10 && titulo.length() <= 50;
    }

    public boolean validarFechaIngreso() {
        return fechaIngreso != null;
    }

    @Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
	}
	
	// Implementación del método analizarUsuario de la interfaz Asesoria
    @Override
    public void analizarUsuario() {
        super.analizarUsuario(); // Llama al método de la clase padre
        System.out.println("Título: " + titulo);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
    }

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public int getRun() {
		// TODO Auto-generated method stub
		return 0;
	}
}