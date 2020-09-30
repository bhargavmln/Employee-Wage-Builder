public class CompanyEmpWage{
	
	public final String company;
	public final int empRatePerHour;
	public final int noOfWorkingDays;
	public final int maxHoursPerMonth;
	public int totalEmpWage;
	
	public CompanyEmpWage(String company, int empRatePerHour, int noOfWorkingDays, int maxHoursPerMonth){
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.noOfWorkingDays = noOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
		totalEmpWage = 0;
	}
	
	public void setTotalEmpWage(int totalEmpWage){
		this.totalEmpWage = totalEmpWage;
	}
	
	@override
	public String toString(){
		return "Total Employee Wage for Company: "+ company + " is: " + totalEmpWage;
	}
}