package bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class demo {

	public static void main (String[] args){
		
		ApplicationContext appContext = (ApplicationContext) new FileSystemXmlApplicationContext("src/main/resources/beandef.xml");
		
		SoftwareCompany company = (SoftwareCompany)appContext.getBean("setterCompany");
		
		System.out.println("Injection by setter:");
		System.out.println(company.getBossDeveloper().getName() + "<->"+company.getBossDeveloper().getYearsOfExperience());
		System.out.println(company.getDeveloper().getName() + "<->"+company.getDeveloper().getYearsOfExperience());
		
		
		System.out.println("Injection by constructor:");
		SoftwareCompany constructorCompany = (SoftwareCompany)appContext.getBean("setterCompany");
		System.out.println(constructorCompany.getBossDeveloper().getName() + "<->"+constructorCompany.getBossDeveloper().getYearsOfExperience());
		System.out.println(constructorCompany.getDeveloper().getName() + "<->"+constructorCompany.getDeveloper().getYearsOfExperience());

		System.out.println("Autowired");
		SoftwareCompanyAutowired companyAutowired = (SoftwareCompanyAutowired)appContext.getBean("companyAutowired");
		companyAutowired.getDeveloper().setName("Antoine");
		System.out.println(companyAutowired.getDeveloper().getName());
		System.out.println(companyAutowired.getDeveloper().getYearsOfExperience());
		
		
		
	}
	
}
