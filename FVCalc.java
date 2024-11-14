// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int numberOfYears = Integer.parseInt(args[2]);

		double futureValue = currentValue * Math.pow(1 + (rate / 100), numberOfYears);

		System.out.println("After " + numberOfYears + " years, a $" + currentValue + " saved at " + rate + 
						   "% will yield $" + (int) Math.floor(futureValue));
	}
}