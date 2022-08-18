package P343;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/19 - 12 - 19 - 14:25
 * @Description:
 * @version:1.0
 */
public class Manager extends Employee {

    //经理有奖金这个特殊的属性
    private double bonus;

    //创建Manager对象时，奖金并不是确定的，因此在构造器中不给bonus
    //可以通过setBonus
    public Manager(String name, double daySalary, int workDays, double gra) {
        super(name, daySalary, workDays, gra);
    }

    @Override
    public void printlnsalary() {
        //因为经理的工资计算方式和员工的不一样，所以我们重写
        System.out.println("经理 "+ getName() +"工资 = " + (bonus + getDaySalary() * getWorkDays() * getGra()));
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
