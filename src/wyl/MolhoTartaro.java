package wyl;

public class MolhoTartaro extends MolhoDecorator{
	
	public MolhoTartaro(Molho m) {
		super(m);
	}

	@Override
	public double precoMolho() {
		return molhoDoPrato.precoMolho() + 5.0;
	}

}