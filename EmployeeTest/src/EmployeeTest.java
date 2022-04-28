//직원 클래스 작성하기
public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("김철수",10000);
		Employee e2 = new Employee("홍길동",20000);
		Employee e3 = new Employee("이유리",30000);
		
		int count = Employee.getCount();
		System.out.println(count);

	}

}
