package org.tnsif.autowireannotation;

public class MunicipalCorporation {

	private String area;
	private String MayorName;
	
	//getters and setters
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getMayorName() {
		return MayorName;
	}
	public void setMayorName(String MayorName) {
		this.MayorName = MayorName;
	}
	
	public void corporate()
	{
		System.out.println("Municipal Corporation...");
	}
	
}
