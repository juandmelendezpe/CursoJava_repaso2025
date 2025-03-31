package Daw2.Repaso_Curso_Java2025.Ejercicio3_3_persona;

public class Persona {

	private String nombre;
    private int edad;
    private String dni;
    private String sexo;
    private double peso;
    private double altura;
    
    private static final int BAJO_PESO = -1;
    private static final int PESO_NORMAL = 0;
    private static final int SOBREPESO = 1;
    
	public Persona(String nombre, int edad, String sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public Persona(String nombre ,int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	public Persona(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	// Método para calcular el IMC
    public int calcularIMC() {
    	
        double imc = peso / (altura * altura);

        if (imc < 20) {
            return BAJO_PESO;
        } else if (imc >= 20 && imc <= 25) {
            return PESO_NORMAL;
        } else {
            return SOBREPESO;
        }
    }
    // metodo esMayorEdad
    
    public boolean esMayorEdad(int edad){
    	String Mayor = "Mayor";
    	String Menor = "Menor";

    	if(edad >= 18) {
    		return true;
    	}else {
			return false;
		}
    }
	
}
