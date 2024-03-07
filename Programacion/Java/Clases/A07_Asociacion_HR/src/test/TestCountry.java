package test;

import modelo.javabeans.Country;
import modelo.javabeans.Region;

public class TestCountry {
	public static void main(String[] args) {
		Region reg1 = new Region(1, "Europa");
		Region reg2 = new Region(2, "LATAM");
		
		Country pais1 = new Country("SP", "España", reg1);
		
		Country pais2 = new Country("AR", "Aregntina", reg2);
		
		//System.out.println(pais2);
		System.out.println("Nombre de la region del pais 2 -> " + pais2.getRegion().getRegionName());
		
	}
}
