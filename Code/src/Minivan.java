
public class Minivan extends Vehicle{

	private int NumberOfSeats;
	private boolean airConditionON;
	private boolean hasAutoDoors;

	
	PetroleumType p=new PetroleumType();

	public Minivan() {}
	public Minivan(int NOS,boolean AC,boolean HAD) {
		NumberOfSeats= NOS;
		airConditionON= AC;
		hasAutoDoors= HAD;
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
	
	public void setHasAutoDoors(boolean HAD) {
		hasAutoDoors=HAD;
	}
	
	public boolean getHasAutoDoors() {
		return hasAutoDoors;
	}
	
	@Override
	public double costFor100Km(PetroleumType p) {
		if (engineType.equalsIgnoreCase("Diesel"))
		return (p.getDieselPrice()*(100/super.fuelConsumption));
		else
			return (p.getGasolinePrice()*(100/super.fuelConsumption));

	}
	
	@Override
	public  double priceForFullTank(PetroleumType p) {
		if (engineType.equalsIgnoreCase("Diesel"))
		return (p.getDieselPrice()*tunkSize);
		else
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
		return ("Minivan"+" "+super.toString()+"\n "+",NumberOfSeats: "+NumberOfSeats+" "
	+",AirCondition: "+airConditionON+" "+",HasAutoDoors: "+hasAutoDoors+" "+",CostFor100Km: "+costFor100Km(p));
	}
	
}
