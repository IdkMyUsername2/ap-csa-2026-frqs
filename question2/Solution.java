public class bottle{
	private double startAmount
	private double amount;
	private double minAmount;

	public bottle(double startAmount){
		this.startAmount = startAmount;
		amount = a;
		minAmount = 0.25 * a;
	}

	public double updateAmount(double remove){
		amount - remove;
		if(amount < minAmount){
			amount = startAmount;
		}
		return startAmount;
	}
	
}
