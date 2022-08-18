package P343;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/19 - 12 - 19 - 14:17
 * @Description:
 * @version:1.0
 */
public class Employee {

   //属性
    private String name;

    private double daySalary;

    private int workDays;

    private double gra;//等级

    public Employee(String name, double daySalary, int workDays, double gra) {
        this.name = name;
        this.daySalary = daySalary;
        this.workDays = workDays;
        this.gra = gra;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public double getGra() {
        return gra;
    }

    public void setGra(double gra) {
        this.gra = gra;
    }

    public void printlnsalary(){

        System.out.println(name + "工资="  + daySalary * workDays * gra);
    }
}

