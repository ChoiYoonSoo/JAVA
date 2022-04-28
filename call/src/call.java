class Animal{
	void sound(Animal obj) {
		System.out.println("애니멀사운드");
	}
}

class Dog extends Animal{
	void sound(Animal obj) {
		System.out.println("Dog");
	}
}

class Cat extends Animal{
	void sound(Animal obj) {
		System.out.println("Cat");
	}
}

public class call {

	public static void main(String[] args) {
		Animal obj = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound(obj);

	}

}
