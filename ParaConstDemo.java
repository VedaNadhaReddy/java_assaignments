package Java_assignments;
class Student_Details{
	int id;
	String name;

	Student_Details(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class ParaConstDemo {
	public static void main(String[] args) {

		Student_Details std1=new Student_Details(453,"veda nadha reddy");
		Student_Details std2=new Student_Details(413,"Dharani");
		std1.display();
		std2.display();
			}

}
