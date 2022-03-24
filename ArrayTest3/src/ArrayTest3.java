//배열 피보나치수열
public class ArrayTest3 {

	public static void main(String[] args) {
		int[] s = new int[10];
		int p=0;
		int pp=1;
		
		System.out.print(p+" "+pp+" ");
		for(int i=2; i<s.length; i++) {
			s[i] = p+pp;
			p=pp;
			pp=s[i];
			System.out.print(s[i]+" ");
		}

	}

}
