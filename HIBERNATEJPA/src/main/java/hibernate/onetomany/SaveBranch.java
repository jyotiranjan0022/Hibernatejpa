package hibernate.onetomany;

import java.util.ArrayList;
import java.util.Arrays;

public class SaveBranch {public static void main(String[] args) {
	Hospital h=new Hospital();
	h.setName("pinku");
	h.setFounders("satich sir");
	h.setGst(546.75);
	Branch b1=new Branch();
	b1.setName("pinku");
	b1.setPhone(5457689);
	b1.setPlace("dubai");
	Branch b2=new Branch();
	b2.setName("sonu");
	b2.setPhone(5457689);
	b2.setPlace("america");
	h.setBran(new ArrayList<Branch>(Arrays.asList(b1,b2)));
	System.out.println(b1.getName());
}

}
