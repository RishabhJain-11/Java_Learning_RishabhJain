
package com.company;

abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String ssn) {
        this.socialSecurityNumber = ssn;
    }

    // abstract method overridden by concrete subclasses
    public abstract double earnings(); // no implementation here
    // end abstract class Employee

    @Override
    public String toString() {
        return String.format("%s %s ssn: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
    }
}



class HourlyEmployee extends Employee{
    private double wage; //wage per hour
    private double hours;// hours worked for week

    public HourlyEmployee(String firstName, String lastName, String ssn, double hours, double  wage) {
        super(firstName, lastName, ssn);
        this.setHours(hours);
        this.setWage(wage);

    }

    public double getWage() {
        return wage;
    }

    public void setWage(double hourlyWage) {
        if(hourlyWage >= 0.0){
            this.wage = hourlyWage;
        }else
            throw  new IllegalArgumentException("HourLY Wage must be >=0.0");
    }


    public double getHours() {
        return hours;
    }

    public void setHours(double hourWorked) {
        if(hourWorked >= 0.0){
            this.hours = hourWorked;
        }else
            throw new IllegalArgumentException("Hour must be >=0.0 and <=168"); //work hour per week 7*24hrs
    }

    @Override
    public double earnings() {
        if(getHours() <= 40){
            return getWage()*getHours();
        }else{
            return getWage()*getHours()+(getHours()-40)*getWage()*1.5;
        }
    }

    @Override
    public String toString()
    {
        return String.format( "hourly employee: %s\n%s: $%,.2f; %s: %,.2f", super.toString(), "hourly wage" , getWage(), "hours worked", getHours() );
    }
}

class SalariedEmployee extends Employee{

    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String ssn, double salary) {
        super(firstName, lastName, ssn);

        this.setWeeklySalary(salary);
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double salary) {
        if(salary >= 0.0){
            this.weeklySalary = salary;
        }else
            throw new IllegalArgumentException("Weekly Salary Must be >= 0.0");
    }

    @Override
    public double earnings() {
        return  getWeeklySalary();
    }

    @Override
    public String toString(){
        return String.format("salaried employee: %s\n%s: $%,.2f", super.toString(), "weekly salary" , getWeeklySalary());
    }
}

class CommissionEmployee extends Employee{
    private double grossSales;
    private double  commissionRate;

    public CommissionEmployee(String firstName, String lastName, String ssn, double sales, double rate) {
        super(firstName, lastName, ssn);
        this.setCommissionRate(rate);
        this.setGrossSales(sales);
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double sales) {
        if(sales >= 0.0){
            this.grossSales = sales;
        }else
            throw new IllegalArgumentException("gross sales must be > 0.0");
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double rate) {
        if(rate > 0.0 && rate < 1.0){
            this.commissionRate = rate;
        }else
            throw  new IllegalArgumentException("Commission rate must be > 0 and < 1.0");
    }

    @Override
    public double earnings() {
        return getGrossSales()*getCommissionRate();
    }

    @Override
    public String toString(){
        return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f","commission employee", super.toString(), "gross sales", getGrossSales(), "commission rate", getCommissionRate() );
    }
}

class BasePlusCommissionEmployee extends CommissionEmployee{

    private double baseSalary;
    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn, double sales, double rate, double salary) {
        super(firstName, lastName, ssn, sales, rate);
        this.setBaseSalary(salary);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double salary) {
        if(salary >= 0.0){
            this.baseSalary = salary;
        }else
            throw new IllegalArgumentException("Base salary must be >0.0");
    }

    // calculate earnings; override method earnings in CommissionEmployee
    @Override
    public double earnings()                                                   {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString()
    {
        return String.format( "%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary() );
    }

}

class TestClass {

    public static SalariedEmployee salariedEmployee;
    public static HourlyEmployee hourlyEmployee;
    public static CommissionEmployee commissionEmployee;
    public static BasePlusCommissionEmployee basePlusCommissionEmployee;

    public static void main(String[] args) {

        // create four-element Employee array
        Employee[] employees = new Employee[4];

        // initialize array with Employees
        employees[0] =  new SalariedEmployee("Archangel", "Macsika", "A001", 680000.00);
        employees[1] = new HourlyEmployee("Nsikak", "Imoh", "A002", 17.00, 9000);
        employees[2] =  new CommissionEmployee("John", "Doe", "A003", 9100000, 0.04);
        employees[3] = new BasePlusCommissionEmployee("Rose", "Maryland", "A004", 2120000, .03, 590000);

        System.out.println("Employees processed polymorphically:\n");

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee); // invokes toString

            if (currentEmployee instanceof BasePlusCommissionEmployee employee) {

                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf( "new base salary with 10%% increase is: $%,.2f\n",  employee.getBaseSalary());
            }

            System.out.printf( "earned $%,.2f\n\n", currentEmployee.earnings());
        }

    }

}