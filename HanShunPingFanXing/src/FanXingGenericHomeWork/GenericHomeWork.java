package FanXingGenericHomeWork;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/27 - 12 - 27 - 14:12
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class GenericHomeWork {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom",2000.0,new MyDate(2000,11,11) ));
        employees.add(new Employee("jake",12000.0,new MyDate(2000,12,12) ));
        employees.add(new Employee("hsp",50000.0,new MyDate(1980,10,10) ));
        System.out.println(employees);

        System.out.println("-----排序---------");

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                if(!(emp1 instanceof Employee && emp2 instanceof Employee)){
                    System.out.println("类型不正确");
                    return 0;
                }
                return 0;
            }
        });
    }
}
