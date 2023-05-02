package wyl;

import java.util.HashMap;

public class PratoPronto implements Molho {
	HashMap<String, Double> ingredientes;
	
	public PratoPronto(HashMap<String, Double> ingredientes) {
		super();
		this.ingredientes = ingredientes;
	}

	@Override
	public double precoMolho() {
		double valor = 0;
		for(double cada: ingredientes.values()) {
			valor = valor + cada;
		}
		return valor;
	}

}
