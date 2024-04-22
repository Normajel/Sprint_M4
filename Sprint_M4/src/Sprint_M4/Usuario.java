package Sprint_M4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class Usuario implements Asesoria {
    protected String nombres;
    protected Date fechaNacimiento;
    protected int rut;

    // Constructor sin parámetros
    public Usuario() {}

    // Constructor con parámetros
    public Usuario(String nombres, Date fechaNacimiento, int rut) {
        this.nombres = nombres;
        this.fechaNacimiento = fechaNacimiento;
        this.rut = rut;
    }

    public boolean validarNombre() {
        return nombres != null && nombres.length() >= 10 && nombres.length() <= 50;
    }

    public boolean validarFechaNacimiento() {
        return fechaNacimiento != null;
    }

    public boolean validarRUN() {
        return rut < 99999999;
    }

    private Date parseFecha(String fecha) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            return sdf.parse(fecha);
        } catch (ParseException e) {
            return null;
        }
    }
    
    // Método para mostrar la edad del usuario
    public String mostrarEdad() {
        // Calcular la edad
        Calendar fechaNacimientoCal = Calendar.getInstance();
        fechaNacimientoCal.setTime(fechaNacimiento);
        Calendar ahora = Calendar.getInstance();
        int edad = ahora.get(Calendar.YEAR) - fechaNacimientoCal.get(Calendar.YEAR);
        if (ahora.get(Calendar.MONTH) < fechaNacimientoCal.get(Calendar.MONTH) ||
                (ahora.get(Calendar.MONTH) == fechaNacimientoCal.get(Calendar.MONTH) &&
                        ahora.get(Calendar.DAY_OF_MONTH) < fechaNacimientoCal.get(Calendar.DAY_OF_MONTH))) {
            edad--;
        }
        return "El usuario tiene " + edad + " años";
    }

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombres + ", fechaNacimiento=" + fechaNacimiento + ", run=" + rut + "]";
	}
	
    // Implementación del método analizarUsuario de la interfaz Asesoria
    @Override
    public void analizarUsuario() {
        System.out.println("Nombre: " + nombres);
        System.out.println("RUT: " + rut);
    }

	public String getNombre() {
		return nombres;
	}

	public void setNombre(String nombre) {
		this.nombres = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}   
    
}