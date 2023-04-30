import java.util.Calendar;
public class Owner {
	
	String Name;
	String RegistrationNo;
	String Address;
	String Tel;
	Calendar dateOfRegistration = Calendar.getInstance();

	public Owner() {}
	
	public Owner(String name,String pin,String address,String mobileNO,Calendar c) {
		Name=name;
		RegistrationNo=pin;
		Address=address;
		Tel=mobileNO;
		Calendar dateOfRegistration = c;
	}
	public String getName() {
		return Name;
	}
	public void seteName(String name) {
		Name = name;
	}

	public String getRegistrationNo() {
		return RegistrationNo;
	}
	public void setRegistrationNo(String pin) {
		RegistrationNo = pin;
	}

	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	public String getMobileNumber() {
		return Tel;
	}
	public void setMobileNumber(String mobileNO) {
		Tel = mobileNO;
	}
	
	public Calendar getDate() {
		return dateOfRegistration;
	}
	public void setDate(Calendar c) {
		dateOfRegistration = c;
	}
	
	// this method from me to check the type of sim card of mobile
	public String MobileType() {
		
		if( Tel.charAt(2)=='9' )
		return ("jawwal");
		else if( Tel.charAt(2)=='6' )
			return ("Oreedo");
		else
			return("unknown");

	}
	
	
	@Override
	public String toString() {
		return (Name+" "+RegistrationNo+" "+Address+" "+Tel+" "+dateOfRegistration.toString());
	}
	

}
