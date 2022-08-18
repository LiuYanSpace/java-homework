package FanXingGenericHomeWork;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/27 - 12 - 27 - 14:13
 * @Description:
 * @version:1.0
 */
public class Employee {
    private String name;
    private Double sal;
    private MyDate birthday;

    public Employee(String name, Double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}
