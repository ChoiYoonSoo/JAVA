import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ��ȣ {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j)=='(')
					stack.push(str.charAt(j));
				else {
					if(stack.empty()) {
						stack.push(str.charAt(j));
						break;
					}
					else {
						stack.pop();
					}
				}
			}
			if(stack.empty()) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		
	}

}
