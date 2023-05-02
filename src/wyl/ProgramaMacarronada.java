package wyl;

import java.util.HashMap;

public class ProgramaMacarronada {
	public static void main (String[]args) {
		HashMap<String, Double> componentesPrato = new HashMap<>();
		componentesPrato.put("macorrão", 10.0);
		componentesPrato.put("Queixo", 5.0);
		
		Molho macarronada = new PratoPronto(componentesPrato);
		
		Molho meuPrato = new MolhoNormal(new MolhoBolonhesa(new MolhoTartaro(macarronada)));
		
		System.out.println("Meu prato custará: " + meuPrato.precoMolho());
	}
}
