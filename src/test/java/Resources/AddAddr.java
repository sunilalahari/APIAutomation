package Resources;

import java.util.Arrays;
import java.util.List;

import POJOs.AddPlace;
import POJOs.location;

public class AddAddr {
	public AddPlace a;
	public AddPlace addr(String name, String language, String addr) {
		AddPlace a = new AddPlace();
		a.setAccuracy("60");
		a.setAddress(addr);
		a.setLanguage(language);
		location loc = new location();
		loc.setLat(76878);
		loc.setLng(-567787.34);
		loc.setLat(677887.54);
		a.setLocation(loc);
		a.setPhone_number("9963657896");
		a.setName(name);
		List<String> lis = Arrays.asList("ABC", "BCD");
		a.setTypes(lis);
		a.setWebsite("https://www.ongole.com");
		return a;


	}

}
