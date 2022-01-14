package Java_assignments;
class Employee_Details{
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}
}

public class DefConstructorDemo {
	public static void main(String[] args) {

		Employee_Details e1=new Employee_Details();
		Employee_Details e2=new Employee_Details();

		e1.display();
		e2.display();
	}
}
