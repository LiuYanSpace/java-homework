package P343;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/19 - 12 - 19 - 14:24
 * @Description:
 * @version:1.0
 */
public class XiaoEmployee extends Employee {
    public XiaoEmployee(String name, double daySalary, int workDays, double gra) {
        super(name, daySalary, workDays, gra);
    }

    @Override
    public void printlnsalary() {//因为普通员工的工资和父类一样
        super.printlnsalary();
    }
}
