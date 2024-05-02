//Can we override the static method? No
//Can we override the instance method? Yes 

//Java program to demonstrate overriding of an instance method

class Super{
	void display() {
		System.out.println("display method from Super class");
	}
}
class Sub extends Super{
	void display() {
		System.out.println("display method from Sub class");
		
	}
}
public class canoverride {
	public static void main(String[] args) {
		Super s1 = new Sub();
		
		s1.display();
		
	}
	

}
