package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SoftwareCompany {

	private Developer developer;
	private Developer bossDeveloper;
	
	public SoftwareCompany( Developer developer, Developer bossDeveloper)
	{
		this.developer = developer;
		this.bossDeveloper = bossDeveloper;
	}
	
	public SoftwareCompany(){
		
	}
	
	
	public Developer getDeveloper() {
		return developer;
	}
	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}
	public Developer getBossDeveloper() {
		return bossDeveloper;
	}
	
	
	public void setBossDeveloper(Developer bossDeveloper) {
		this.bossDeveloper = bossDeveloper;
	}
	
	
}
