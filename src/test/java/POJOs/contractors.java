package POJOs;

public class contractors {

	private String firstName;
	private String lastName;
	private String contractFrom;
	private String contractTo;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getContractFrom() {
		return contractFrom;
	}
	public void setContractFrom(String contractFrom) {
		this.contractFrom = contractFrom;
	}
	public String getContractTo() {
		return contractTo;
	}
	public void setContractTo(String contractTo) {
		this.contractTo = contractTo;
	}
	@Override
	public String toString() {
		return "contractors [firstName=" + firstName + ", lastName=" + lastName + ", contractFrom=" + contractFrom
				+ ", contractTo=" + contractTo + "]";
	}
	public contractors() {
		super();
	}
	

}
