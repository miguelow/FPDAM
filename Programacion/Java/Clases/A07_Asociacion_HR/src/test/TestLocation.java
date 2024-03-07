package test;

import modelo.javabeans.Country;
import modelo.javabeans.Location;
import modelo.javabeans.Region;

public class TestLocation {
	public static void main(String[] args) {
		Region reg1 = new Region(1, "Europa");
		Region reg2 = new Region(2, "LATAM");
		
		Country pais1 = new Country("SP", "España", reg1);
		
		Country pais2 = new Country("AR", "Aregntina", reg2);
		
		Location loc1 = new Location(1700, "Salamanca 12", pais1);
		
		//System.out.println(loc1);
		System.out.println("El pais de esta localizacion -> " 
		+ loc1.getCountry().getRegion().getRegionName());
		
	}
}
