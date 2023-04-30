
public class PetroleumType {
	public static final int DIESEL =1;	
	public static final int GASOLINE =2;	
	private double gasolinePrice=5.23;
	private double dieselPrice=4.02;

	public PetroleumType() {}
	
	public PetroleumType(double dis,double gas) {
		dieselPrice= dis;	
		gasolinePrice= gas;
	}
	
	public double getGasolinePrice() {
		return gasolinePrice;
	}
	public void setGasolinePrice(double gas) {
		gasolinePrice = gas;
	}	
	
	public double getDieselPrice() {
		return dieselPrice;
	}
	public void setDieselPrice(double dis) {
		dieselPrice = dis;
	}
	
	// this method from me to calculate the amount of liter of a specific price
	public double getDieselByLiter(double pr) {
		return (pr/dieselPrice);
	}
	public double getGasolineByLiter(double pr) {
		return (pr/dieselPrice);
	}



}
