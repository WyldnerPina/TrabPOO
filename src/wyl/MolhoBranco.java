package wyl;

public class MolhoBranco extends MolhoDecorator{
	
	public MolhoBranco(Molho m) {
		super(m);
	}

	@Override
	public double precoMolho() {
		return molhoDoPrato.precoMolho() + 4.0;
	}

}