package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return this.grossSalary - this.tax;
    }
    public void increaseSalary(double percentage){
        double increase = this.grossSalary * (percentage/100);
        this.grossSalary = increase + this.netSalary();
    }

}
