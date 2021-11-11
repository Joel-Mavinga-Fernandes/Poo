package Calc_Area;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculoAreaTest {

	
		CalculoArea calculoarea = new CalculoArea();
		
		@Test
		public void calcularAreaTest() {
			
			BigDecimal area= calculoarea.calcularArea(3, 2);
			
		Assertions.assertEquals(BigDecimal.valueOf(3), area);	
			
		}
		
		@Test 
		public void calcularAreaCirculoTest() {
			
			BigDecimal areaCirculo = calculoarea.calcularAreaCircuito(2);
			
			Assertions.assertEquals(BigDecimal.valueOf(12.56), areaCirculo);
		}
		
		@Test
		public void calcularPerimetroCirculo() {
			
			BigDecimal perimetroCirculo = calculoarea.calcularPerimetroCircuito(4);
			
			Assertions.assertEquals(BigDecimal.valueOf(25.12), perimetroCirculo);
		}

}
