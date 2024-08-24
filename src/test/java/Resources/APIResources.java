package Resources;

public enum APIResources {
	
	AddPlaceAPI("/maps/api/place/add/json"),
	GetPlaceAPI("/maps/api/place/get/json");
	
	private String resources;
	
	APIResources(String resources){
		this.resources=resources;
	}
	
	public String getResources() {
		return resources;
	}

}
