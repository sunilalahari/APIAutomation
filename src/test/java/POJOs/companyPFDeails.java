package POJOs;

public class companyPFDeails {
private String pfName;
private String pfCity;
private String pfYear;
private String noOfEmployees;


public companyPFDeails() {
	super();
}
@Override
public String toString() {
	return "companyPFDeails [pfName=" + pfName + ", pfCity=" + pfCity + ", pfYear=" + pfYear + ", noOfEmployees="
			+ noOfEmployees + "]";
}
public String getPfName() {
	return pfName;
}
public void setPfName(String pfName) {
	this.pfName = pfName;
}
public String getPfCity() {
	return pfCity;
}
public void setPfCity(String pfCity) {
	this.pfCity = pfCity;
}
public String getPfYear() {
	return pfYear;
}
public void setPfYear(String pfYear) {
	this.pfYear = pfYear;
}
public String getNoOfEmployees() {
	return noOfEmployees;
}
public void setNoOfEmployees(String noOfEmployees) {
	this.noOfEmployees = noOfEmployees;
}


}
