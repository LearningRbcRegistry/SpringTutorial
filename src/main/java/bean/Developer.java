package bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Developer {

	private String name;
	private int yearsOfExperience;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	
}
