package entities;

public class TaxPayer {

private double salaryIncone;
private double servicesIncone;
private double capitalIncome;
private double healthSpending;
private double educationSpending;

private final double  TAX_5000 = 20;
private final double  TAX_3000 = 10;
private final double  TAX_SERV = 15;

public TaxPayer() {
}

public TaxPayer(double salaryIncone, double servicesIncone, double capitalIncome, double healthSpending,
		double educationSpending) {
	this.salaryIncone = salaryIncone;
	this.servicesIncone = servicesIncone;
	this.capitalIncome = capitalIncome;
	this.healthSpending = healthSpending;
	this.educationSpending = educationSpending;
}

public double getSalaryIncone() {
	return salaryIncone;
}

public void setSalaryIncone(double salaryIncone) {
	this.salaryIncone = salaryIncone;
}

public double getServicesIncone() {
	return servicesIncone;
}

public void setServicesIncone(double servicesIncone) {
	this.servicesIncone = servicesIncone;
}

public double getCapitalIncome() {
	return capitalIncome;
}

public void setCapitalIncome(double capitalIncome) {
	this.capitalIncome = capitalIncome;
}

public double getHealthSpending() {
	return healthSpending;
}

public void setHealthSpending(double healthSpending) {
	this.healthSpending = healthSpending;
}

public double getEducationSpending() {
	return educationSpending;
}

public void setEducationSpending(double educationSpending) {
	this.educationSpending = educationSpending;
}

public double salaryTax () {
	
	if (salaryIncone >= 5000) {
		
		return salaryIncone * ((100 + TAX_5000)/100);
	}
	else if  (salaryIncone >= 3000) {
		
		return salaryIncone * ((100 + TAX_3000)/100);
	}
	else {
		return salaryIncone;
	}
	
}

public double servicesTax () {
	
	return servicesIncone * (TAX_SERV+100)/100;
}


}
