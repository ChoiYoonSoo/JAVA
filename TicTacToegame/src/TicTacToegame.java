// TicTacToe Game 
import java.util.Scanner;
public class TicTacToegame {
	public static void main(String[] args) {
		
		char[][] board = new char[3][3];
		int x,y;
		Scanner pos = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++)
				board[i][j] = ' ';
		}
		
		while(true) {
			
			for(int i=0; i<3; i++) {
				System.out.println("   "+board[i][0]+"|   "+board[i][1]+"|  "+board[i][2]);
				if(i!=2)
					System.out.println(" ---|----|---");
			}
			
			System.out.println("���� ���� ��ǥ�� �Է��Ͻÿ�: ");
			x = pos.nextInt();
			y = pos.nextInt();
			
			if(x > 2 || y > 2 || x < 0 || y < 0) {
				System.out.println("0~2������ ��ǥ�� �Է��ϼ���.");
				continue;
			}
			
			if(board[x][y]==' ')
				board[x][y] = 'X';
			
			else {
				System.out.println("�ٸ� ������ �Է��ϼ���.");
				continue;
			}
			
			int i=0, j=0;
			for(i=0; i<3; i++) {
				for(j=0; j<3; j++)
					if(board[i][j]==' ')
						break;
				if(board[i][j]==' ')
					break;
			}
			
			board[i][j]='O';
		}
	}
}
