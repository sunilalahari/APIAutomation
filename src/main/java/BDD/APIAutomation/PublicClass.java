
package BDD.APIAutomation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PublicClass {
	List<String> strs = new ArrayList<String>();
	public List<String> m1() {
		strs.add("Alahari");
		strs.add("Alahari");
		strs.add("Kumar");
	Iterator<String> ite=	strs.iterator();
	while(ite.hasNext()) {
		System.out.println(ite.next());
	}
	return strs;
	}

}
