
public class Truck extends Vehicle {

	private int NumberOfSeats;
	private boolean airConditionON;
	private int power;

	
	PetroleumType p=new PetroleumType();

	public Truck() {}
	public Truck(int NOS,boolean AC,int pow) {
		NumberOfSeats= NOS;
		airConditionON= AC;
		power= pow;
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
		fuelConsumption=fuelConsDefValue+(fuelConsDefValue*0.2);
		airConditionON=true;
	}
	
	@Override
	public void setAirConditionOff() {
		fuelConsumption=fuelConsDefValue;
		airConditionON=false;
	}
	
	public boolean getAirConditionON() {
		return airConditionON;
	}
	
	public void setPower(int pow) {
		power=pow;
	}
	
	public int getPower() {
		return power;
	}
	
	@Override
	public double costFor100Km(PetroleumType p) {
		
		return (p.getDieselPrice()*(100/super.fuelConsumption));
	}
	
	@Override
	public double priceForFullTank(PetroleumType p) {
		return (p.getDieselPrice()*tunkSize);
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
		return ("Truck"+" "+super.toString()+"\n "+",NumberOfSeats: "+NumberOfSeats+" "
				+",AirCondition: "+airConditionON+" "+",Power: "+power+" "+",CostFor100Km: "+costFor100Km(p));
				}
	}