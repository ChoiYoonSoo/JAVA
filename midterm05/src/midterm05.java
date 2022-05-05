
public class midterm05 {
	void sound() {
		System.out.println("동물의소리");
	}
	public static void main(String[] args) {
		midterm05 obj[] = new midterm05[2];
		obj[0] = new Dog();
		obj[1] = new Cat();
		for(int i=0; i<2; i++) {
			obj[i].sound();
		}

	}

}
