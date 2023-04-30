import java.io.IOException;
import java.util.*;

public class Test {

	public static void main(String[] args) throws IllegalArgumentException {	
		try {

		java.io.File file = new java.io.File("inputdata.txt");
		Scanner input  = new Scanner(file);
		PetroleumType P = new PetroleumType(5,4);
	    ArrayList<String> list = new ArrayList<String>();
		ArrayList<Vehicle> test= new ArrayList<Vehicle>();
		while (input.hasNext()) {
			list.add(input.next());
			}

		for(int i=0;i<list.size();i++) {
			String[] a = list.get(i).split(",");
			StringBuilder[] s = new StringBuilder[a.length];
			for(int j =0; j<a.length;j++)
				s[j]=new StringBuilder(a[j]);
			if(s[0].toString().equalsIgnoreCase("Car")) {
				test.add(new Car(Integer.parseInt(s[8].toString()),false));
				test.get(i).setModelName(s[1].toString());
				test.get(i).setVehicleModelNumber(s[2].toString());
				test.get(i).setBrand(s[3].toString());
				test.get(i).owner.seteName(s[4].toString());
				test.get(i).setEngineType(s[5].toString());
				test.get(i).setTunkSize(Double.parseDouble(s[6].toString()));
				test.get(i).setFuelConsumption(Double.parseDouble(s[7].toString()));	
				((Car)test.get(i)).setPetroleumType(P);
			}
			else if(s[0].toString().equalsIgnoreCase("Minivan")) {
				test.add(new Minivan(Integer.parseInt(s[8].toString()),false,Boolean.parseBoolean(s[9].toString())));
				test.get(i).setModelName(s[1].toString());
				test.get(i).setVehicleModelNumber(s[2].toString());
				test.get(i).setBrand(s[3].toString());
				test.get(i).owner.seteName(s[4].toString());
				test.get(i).setEngineType(s[5].toString());
				test.get(i).setTunkSize(Double.parseDouble(s[6].toString()));
				test.get(i).setFuelConsumption(Double.parseDouble(s[7].toString()));
				((Minivan)test.get(i)).setPetroleumType(P);

			}
			else if(s[0].toString().equalsIgnoreCase("Truck")) {
				test.add(new Truck(Integer.parseInt(s[8].toString()),false,Integer.parseInt(s[9].toString())));
				test.get(i).setModelName(s[1].toString());
				test.get(i).setVehicleModelNumber(s[2].toString());
				test.get(i).setBrand(s[3].toString());
				test.get(i).owner.seteName(s[4].toString());
				test.get(i).setEngineType(s[5].toString());
				test.get(i).setTunkSize(Double.parseDouble(s[6].toString()));
				test.get(i).setFuelConsumption(Double.parseDouble(s[7].toString()));
				((Truck)test.get(i)).setPetroleumType(P);
			}
			else 
				throw new IllegalArgumentException("engine type of object "+(i+1)+" is not valid");
		}

		Collections.sort(test);
		System.out.println("sort by Cost ascending:");
		for (int i=0;i<test.size();i++) {
			System.out.println(test.get(i).toString());
		}
		
		System.out.println("sort by name ascending:");
		Vehicle temp;
		for (int i= 0;i < test.size();i++) {
			   	   for (int j= i + 1; j <test.size(); j++) {
					if (test.get(j).owner.getName().compareTo(test.get(i).owner.getName())< 0) {
						temp = test.get(i);
						test.set(i,test.get(j));
						test.set(j,temp);
					}
				   }
			System.out.println(test.get(i).toString());
		}		
		
		System.out.println("sort by Brand descending:");
		Vehicle temp1;
		for (int i= 0;i < test.size();i++) {
			   	   for (int j= i + 1; j <test.size(); j++) {
					if (test.get(j).getBrand().compareTo(test.get(i).getBrand())> 0) {
						temp1 = test.get(i);
						test.set(i,test.get(j));
						test.set(j,temp1);
					}
				   }
			System.out.println(test.get(i).toString());
		}
		
		System.out.println("put AC on:");
		for (int i=0;i<test.size();i++) {
			test.get(i).setAirConditionON();
			System.out.println(test.get(i).toString());
		}
		

		java.io.File file1 = new java.io.File("output.txt");
		java.io.PrintWriter output  = new java.io.PrintWriter(file1);
		for (int i=0;i<test.size();i++) {
			output.println(test.get(i).toString());
		}
		output.close();
		
		Scanner choose  = new Scanner(System.in);
		int x=0;
		System.out.println("choose one object to clone:");
		x=choose.nextInt()-1;
		Vehicle c= (Vehicle)test.get(x).clone();
		System.out.println(c.toString());
		System.exit(0);
		}
		catch (IOException e){
			System.out.println("error didnt find file");
			
		}

	}

}