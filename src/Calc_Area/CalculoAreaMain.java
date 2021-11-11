package Calc_Area;

public class CalculoAreaMain {

	public static void main(String[] args) {
		
		CalculoArea calculoArea = new CalculoArea();
		
		System.out.println(" A área é: " + calculoArea.calcularArea(2,2));
		
		System.out.println(" A ára do circulo é: " + calculoArea.calcularAreaCircuito(3));
		
		System.out.println(" O perimetro do circuito é: " + calculoArea.calcularPerimetroCircuito(6));

	}

}
