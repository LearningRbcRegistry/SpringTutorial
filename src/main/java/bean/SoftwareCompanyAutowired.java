package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SoftwareCompanyAutowired {

	@Autowired
	private DeveloperAutowired developer;
	@Autowired
	private DeveloperAutowired bossDeveloper;
	
	
	public DeveloperAutowired getDeveloper() {
		return developer;
	}
	

	public DeveloperAutowired getBossDeveloper() {
		return bossDeveloper;
	}
	
		
}
