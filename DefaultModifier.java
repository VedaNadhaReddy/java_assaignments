package Java_assignments;
class Default_
{ 
  void display() 
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
} 
public class DefaultModifier {
	public static void main(String[] args) {
		//default
		System.out.println("Dafault Access Specifier");
		Default_ obj = new Default_(); 		  
        obj.display(); 
	}
}

