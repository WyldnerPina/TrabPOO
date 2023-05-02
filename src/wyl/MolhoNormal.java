package wyl;

public class MolhoNormal extends MolhoDecorator{
	
	public MolhoNormal(Molho m) {
		super(m);
	}

	@Override
	public double precoMolho() {
		return molhoDoPrato.precoMolho() + 3.0;
	}

}
