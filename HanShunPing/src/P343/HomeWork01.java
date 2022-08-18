package P343;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/18 - 12 - 18 - 22:34
 * @Description:
 * @version:1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {

// 初始化person对象数组，有3个person对象，
        Person[] persons = new Person[3];
        persons[0] = new Person("smith", 10, "javaEE工程师");
        persons[1] = new Person("tom", 50, "Date工程师");
        persons[2] = new Person("mary", 30, "PHP工程师");


//输出当前对象数组
        for (int i = 0; i < persons.length; i++) {

            System.out.println(persons[i]);

        }

        //提示使用冒泡排序
        Person tmp = null;//临时变量,用于交换
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {

                //并按照age从大到小进行排序：如果前面人的age< 后面人的年龄，就交换
                if (persons[j].getAge() < persons[j + 1].getAge()) {
                    tmp = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = tmp;

                }
            }
        }

        System.out.println("排序后的效果");
        for (int i = 0; i < persons.length; i++) {

            System.out.println(persons[i]);

        }

        //age从小到大排列

        Person tmp2 = null;//临时变量,用于交换
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {

                //并按照age从大到小进行排序：如果前面人的age> 后面人的年龄，就交换
                if (persons[j].getAge() > persons[j + 1].getAge()) {
                    tmp2 = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = tmp2;

                }
            }
        }

        System.out.println("排序后的效果");
        for (int i = 0; i < persons.length; i++) {

            System.out.println(persons[i]);

        }

        // 按照名字的长度从小到大排列

        Person tmp3 = null;//临时变量,用于交换
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {

                //并按照age从小到大进行排序：如果前面人的名字长度> 后面人的年龄，就交换
                if (persons[j].getName().length() > persons[j + 1].getName().length()) {
                    tmp3 = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = tmp3;

                }
            }
        }

        System.out.println("排序后的效果");
        for (int i = 0; i < persons.length; i++) {

            System.out.println(persons[i]);

        }


    }

    /*
    定义一个person类{name,age,job}，
    初始化person对象数组，有3个person对象，
    并按照age从大到小进行排序：提示使用冒泡排序

     */
}

class Person {
    //属性
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
