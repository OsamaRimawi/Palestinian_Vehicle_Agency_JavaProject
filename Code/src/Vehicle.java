
public abstract class Vehicle implements Comparable<Vehicle>,Cloneable {

	protected String modelName;
	protected String ModelNo;
	protected String Brand;
	protected String engineType;
	protected double tunkSize;
	protected double fuelConsumption;
	
	double fuelConsDefValue=fuelConsumption;

	public Vehicle() {}
	
	public Vehicle(String Name,String num,String brand,String eng,double TS,double FC) {
		modelName= Name;
		ModelNo= num;
		Brand= brand;
		engineType= eng;
		tunkSize= TS;
		fuelConsumption= FC;
		fuelConsDefValue=fuelConsumption;

	}
	
	Owner owner = new Owner();
	
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String Name) {
		modelName = Name;
	}

	public String getModelNumber() {
		return ModelNo;
	}
	public void setVehicleModelNumber(String num) {
		ModelNo = num;
	}

	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String eng) {
		engineType = eng;
	}
	
	public double getTunkSize() {
		return tunkSize;
	}
	public void setTunkSize(double TS) {
		tunkSize = TS;
	}
	
	public double getFuelConsumption() {
		return fuelConsumption;
	}
	public void setFuelConsumption(double FC) {
		fuelConsumption = FC;
		 fuelConsDefValue=fuelConsumption;
	}
	
	public double MovableDistance() {
		
		return (tunkSize*fuelConsumption);
	}

	public abstract double costFor100Km(PetroleumType p);
	public abstract void setAirConditionON();
	public abstract void setAirConditionOff();
	// this method from me to calculate the price of full tank
	public abstract double priceForFullTank(PetroleumType p);

	
	@Override
	public String toString() {
		return (",ModelName: "+modelName +" "+",ModelNumber: "+ModelNo + " "+",Brand: "+Brand
				+" "+",Owner: "+owner.Name+" "+",EngineType: "+engineType+" "+",TankSize: "
				+tunkSize+" "+",FuelConsumption: "+fuelConsumption+" "+",MovableDistance: "+MovableDistance());
	} 	
	
	@Override
	public int compareTo(Vehicle v) {
			return 0;
	}
	
	@Override
	public Object clone() {
		Vehicle clone;
		try {
			clone= (Vehicle)super.clone();
			clone.owner=new Owner();
			return clone;
		}
		catch(CloneNotSupportedException ex) {
			return null;
		}
	}
}