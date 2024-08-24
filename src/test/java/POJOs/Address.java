package POJOs;

public class Address {
String streetName;
int dNo;
public Address(String streetName, int dNo) {
	super();
	this.streetName = streetName;
	this.dNo = dNo;
}
public String getStreetName() {
	return streetName;
}
public void setStreetName(String streetName) {
	this.streetName = streetName;
}
public int getdNo() {
	return dNo;
}
public void setdNo(int dNo) {
	this.dNo = dNo;
}
@Override
public String toString() {
	return "Address [streetName=" + streetName + ", dNo=" + dNo + "]";
}

}
