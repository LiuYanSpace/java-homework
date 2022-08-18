package P343;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/19 - 12 - 19 - 14:11
 * @Description:
 * @version:1.0
 */
public class Teacher {

 private String name;
 private int age;
 private String post;
 private double salary;

 //这里我们增加一个工资级别

 private double grade;

 public Teacher(String name, int age, String post, double salar, double grade) {
  this.name = name;
  this.age = age;
  this.post = post;
  this.salary = salar;
  this.grade = grade;
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

 public String getPost() {
  return post;
 }

 public void setPost(String post) {
  this.post = post;
 }

 public double getSalary() {
  return salary;
 }

 public void setSalar(double salary) {
  this.salary = salary;
 }

 public double getGrade() {
  return grade;
 }

 public void setGrade(double grade) {
  this.grade = grade;
 }

 public void introduce(){
  System.out.println("name: " + name + "age:" + age + "post:" + post +"salary: " + salary + "grade: " + grade );
 }
}
