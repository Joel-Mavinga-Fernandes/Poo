package Calc_Area;

public class CalculoAreaMain {

	public static void main(String[] args) {
		
		CalculoArea calculoArea = new CalculoArea();
		
		System.out.println(" A �rea �: " + calculoArea.calcularArea(2,2));
		
		System.out.println(" A �ra do circulo �: " + calculoArea.calcularAreaCircuito(3));
		
		System.out.println(" O perimetro do circuito �: " + calculoArea.calcularPerimetroCircuito(6));

	}

}
