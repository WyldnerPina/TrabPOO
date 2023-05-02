package wyl;

public class MolhoBolonhesa extends MolhoDecorator{
	
	public MolhoBolonhesa(Molho m) {
		super(m);
	}

	@Override
	public double precoMolho() {
		return molhoDoPrato.precoMolho() + 3.5;
	}

}
