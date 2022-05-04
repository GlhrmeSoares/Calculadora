import java.lang.Math;

public class Calculadora { 
	private double x;
	private double y;
	private String entrada; // entrada bruta do usuario
	
	// divide a formula escrita entre o X e o Y
	public void filtroEntrada(String caracter) {
		int indexOf = entrada.indexOf(caracter);
		String x="";
		String y="0";
		String[] listaFormula = entrada.split("");
		for(int i = 0; i < indexOf; i++) {
			x += listaFormula[i];
		}
		for (int i = indexOf+1; i < listaFormula.length; i++) {
			y += listaFormula[i];
		}
		setX(Double.parseDouble(x));
		setY(Double.parseDouble(y));
	}
	
	// calcula a soma dos valores
	public double getSoma() {
		return x + y;
	}
	
	// calcula a subtração dos valores
	public double getSubtracao() {
		return x - y;
	}
	
	// calcula a multiplicação dos valores
	public double getMultiplicacao() {
		return x * y;
	}
	
	// calcula a divisão dos valores
	public double getDivisao() {
		if(y!=0) {
			return x / y;
		} else {
			throw new IllegalArgumentException("Não é possivel dividir por zero!");
		}
	}
	
	// calcula a raiz quadrada do primeiro valor
	public double getRaizQuadrada() {
		return Math.sqrt(x);
	}

	// calcula a potencia quadrada do primeiro valor
	public double getPotenciaQuadrada() {
		return Math.pow(x, 2);
	}
	
	// getters e setters
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		if (y != 0) {
			this.y = y;
		}
		
	}
	
	public String getEntrada() {
		return entrada;
	}


	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}

}
