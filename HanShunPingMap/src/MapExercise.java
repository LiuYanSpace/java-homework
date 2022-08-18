import java.util.HashMap;
import java.util.Map;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/23 - 12 - 23 - 15:54
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class MapExercise {
    public static void main(String[] args) {

        Map hashMap = new HashMap();
        hashMap.put("01", new Employee("Tom", 1000, 01));
        hashMap.put("02", new Employee("May", 19000, 02));
        hashMap.put("03", new Employee("Jake", 20000, 03));
        System.out.println();
    }

//遍历显示工资大于18000

    /*
    Set keySet = hashMap.keySet();

    for( Object key :keySet) {
//先获取value
        Employee employee = hashMap.get(key);
        if (employee.getPay() > 18000) {
            System.out.println(employee);
        }

    }

     */

  /*  Set set = hashMap.entrySet();

   */
}

class Employee {
    private String name;
    private double pay;
    private int ID;

    public Employee(String name, double pay, int ID) {
        this.name = name;
        this.pay = pay;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", pay=" + pay +
                ", ID=" + ID +
                '}';
    }
}
