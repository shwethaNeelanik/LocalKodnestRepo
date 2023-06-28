class Student
{
String name;
int id;
int age;

void eat()
{
System.out.println("student is eating");
}

void sleep()
{
System.out.println("student is sleeping");
}

void study()
{
System.out.println("student is studying");
}
}
class StudentApp
{
public static void main(String[] args)
{
Student s1=new Student();
Student s2=new Student();
Student s3=new Student();
s1.eat();
s1.sleep();
s1.study();
s2.eat();
s2.sleep();
s2.study();
s3.eat();
s3.sleep();
s3.study();
new Student().study();
}
}
