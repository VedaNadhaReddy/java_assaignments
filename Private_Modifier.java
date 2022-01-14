package Java_assignments;
class Private_A
{ 
   void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
} 

public class Private_Modifier {
	public static void main(String[] args) {
		//private
		System.out.println("Private Access Specifier");
		Private_A  obj = new Private_A();
		obj.display();
	}
}
	
	
