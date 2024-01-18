package hibernate.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.OneToOne;

public class Hospital {
	@OneToOne
	private String name;
	private String founders;
	private double gst;
	private List<Branch> bran;
	public List<Branch> getBran() {
		return bran;
	}
	public void setBran(List<Branch> bran) {
		this.bran = bran;
	}
	public String getName() {
		return name;
	}
	public void setName1(String name) {
		this.name = name;
	}
	public String getFounders() {
		return founders;
	}
	public void setFounders(String founders) {
		this.founders = founders;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public void setBran(ArrayList<Branch> bran2) {
		// TODO Auto-generated method stub
		
	}
	public void setName(String name2) {
		// TODO Auto-generated method stub
		
	}

}
