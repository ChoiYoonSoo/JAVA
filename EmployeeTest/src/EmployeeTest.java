//���� Ŭ���� �ۼ��ϱ�
public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("��ö��",10000);
		Employee e2 = new Employee("ȫ�浿",20000);
		Employee e3 = new Employee("������",30000);
		
		int count = Employee.getCount();
		System.out.println(count);

	}

}
