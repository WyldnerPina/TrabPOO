package wyl;

public abstract class MolhoDecorator implements Molho {
	Molho molhoDoPrato;

	public MolhoDecorator(Molho m) {
		super();
		molhoDoPrato = m;
	}
}
