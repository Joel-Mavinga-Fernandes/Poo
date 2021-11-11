package Calc_Area;

import static java.lang.Math.PI;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculoArea {
	
	private static final int DOIS = 2;
	
	BigDecimal pi = BigDecimal.valueOf(PI);
	
	public BigDecimal calcularArea(int altura, int base) {
		
		BigDecimal alturaBD = BigDecimal.valueOf(altura);
		BigDecimal baseBD = BigDecimal.valueOf(base);
		
		return baseBD.multiply(alturaBD).divide(BigDecimal.valueOf(DOIS));
	}
	 
	public BigDecimal calcularAreaCircuito(int raio) {
		
		BigDecimal raioBD = BigDecimal.valueOf(raio);
		
		return raioBD.pow(2).multiply(pi.setScale(2,  RoundingMode.HALF_DOWN));
	}
	
	public BigDecimal calcularPerimetroCircuito(int raio) {
		
		BigDecimal raioBD = BigDecimal.valueOf(raio);
		
		return raioBD.multiply(pi.setScale(2,  RoundingMode.HALF_DOWN)).multiply(BigDecimal.valueOf(DOIS));
	}
}

