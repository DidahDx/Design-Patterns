package CreationPatterns.AbstractFactoryPattern.exampleOne;

public class AmexGoldValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		
		return false;
	}

}
