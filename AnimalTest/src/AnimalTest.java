//동적 메소드호출 실습
public class AnimalTest {

	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		
		a1.sound();
		a2.sound();
		
		Animal a = new Animal();
		Dog d = new Dog();
		Cat c = new Cat();
		
		Animal obj;
		
		obj =a;
		obj.sound();
		
		obj=d;
		obj.sound();
		
		obj=c;
		obj.sound();
	}

}
