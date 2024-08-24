package POJOs;

import java.util.List;

public class EmployerDetails {

	private String companyName;
	private String companyHOCity;
	private String companyCEO;
	private List<String> supportedSalaryBanks;
	private List<String> pincodesOfCityOffice;
	private List<Employee> employee;
	private List<contractors> contractors;
	private companyPFDeails companyPFDeails;
	public companyPFDeails getCompanyPFDeails() {
		return companyPFDeails;
	}
	public void setCompanyPFDeails(companyPFDeails companyPFDeails) {
		this.companyPFDeails = companyPFDeails;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyHOCity() {
		return companyHOCity;
	}
	public void setCompanyHOCity(String companyHOCity) {
		this.companyHOCity = companyHOCity;
	}
	public String getCompanyCEO() {
		return companyCEO;
	}
	public void setCompanyCEO(String companyCEO) {
		this.companyCEO = companyCEO;
	}
	public List<String> getSupportedSalaryBanks() {
		return supportedSalaryBanks;
	}
	public void setSupportedSalaryBanks(List<String> supportedSalaryBanks) {
		this.supportedSalaryBanks = supportedSalaryBanks;
	}
	public List<String> getPincodesOfCityOffice() {
		return pincodesOfCityOffice;
	}
	public void setPincodesOfCityOffice(List<String> pincodesOfCityOffice) {
		this.pincodesOfCityOffice = pincodesOfCityOffice;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	public List<contractors> getContractors() {
		return contractors;
	}
	public void setContractors(List<contractors> contractors) {
		this.contractors = contractors;
	}
	@Override
	public String toString() {
		return "EmployerDetails [companyName=" + companyName + ", companyHOCity=" + companyHOCity + ", companyCEO="
				+ companyCEO + ", supportedSalaryBanks=" + supportedSalaryBanks + ", pincodesOfCityOffice="
				+ pincodesOfCityOffice + ", employee=" + employee + ", contractors=" + contractors + "]";
	}
	public EmployerDetails() {
		super();
	}
	
	
}
