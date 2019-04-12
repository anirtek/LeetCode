public class Invest {
    public static void main(String[] args) {
    	double amount = 20000.00;
	double roi = 8.00;
	int interval = 50;
	for (int i = 0; i < interval; i++) {
	    amount += (amount * (roi / 100)); 
	}
	System.out.println("Return after 50 years on 20,000 USD inverstment is "+ amount);
    }
}
