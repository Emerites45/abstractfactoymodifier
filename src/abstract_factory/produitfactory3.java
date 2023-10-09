package abstract_factory;

public class produitfactory3 implements ipproduitfactory {

	@Override
	public produitA getproduitA() {
		
		return new produitA3();
	}

	@Override
	public produitB getproduitB() {
		
		return new produitB3();
	}

	
	
}
