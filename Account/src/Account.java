//접근자와 설정자 예제(1)
public class Account {

	public static void main(String[] args) {
		AccountTest obj = new AccountTest();
		obj.setName("Tom");
		obj.setBalance(100000);
		System.out.println("이름은 "+obj.getName()+ " 통장 잔고는 "+obj.getBalance()+"원입니다.");

	}

}