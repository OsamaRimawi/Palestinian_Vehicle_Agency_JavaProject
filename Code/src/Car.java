
public class Car extends Vehicle{
	private int NumberOfSeats;
	private boolean airConditionON;
	
	PetroleumType p=new PetroleumType();

	public Car() {}
	public Car(int NOS,boolean AC) {
		NumberOfSeats= NOS;
		airConditionON= AC;
	}
	
	public void setPetroleumType(PetroleumType P) {
		p = P;
	}
	public PetroleumType getPetroleumType() {
		return p;
	}
	
	public int getNumberOfSeats() {
		return NumberOfSeats;
	}
	public void setNumberOfSeats(int NOS) {
		NumberOfSeats = NOS;
	}
	@Override
	public void setAirConditionON() {
		fuelConsumption=fuelConsDefValue+(fuelConsDefValue*0.1);
		airConditionON=true;
	}
	
	@Override
	public void setAirConditionOff() {
		fuelConsumption=fuelConsDefValue;
		airConditionON=false;
	}
	
	public boolean getAirCondition() {
		return airConditionON;
	}
	
	@Override
	public double costFor100Km(PetroleumType p) {
		return (p.getGasolinePrice()*(100/fuelConsumption));
	}
	
	@Override
	public  double priceForFullTank(PetroleumType p) {
		return (p.getGasolinePrice()*tunkSize);
	}

	
	@Override
	public int compareTo(Vehicle v) {
		
		if (costFor100Km(p)> v.costFor100Km(p))
		return 1;
		if (costFor100Km(p)< v.costFor100Km(p))
			return -1;
		else
			return 0;
	}
	
	@Override
	public String toString() {
		return ("Car"+" "+super.toString()+"\n "+",NumberOfSeats: "+NumberOfSeats+" "+",AirCondition: "+airConditionON
				+" "+",CostFor100Km: "+costFor100Km(p));
	}
	
}
