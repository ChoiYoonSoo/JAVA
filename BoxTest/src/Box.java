//2개의 박스가 같은 치수인지 확인하는 프로그램
public class Box {
	int width;
	int length;
	int height;
	
	Box(int w, int l, int h){
		width = w;
		length = l;
		height = h;
	}
	boolean isSameBox(Box obj){
		if(width == obj.width && length == obj.length && height == obj.height )
			return true;
		else
			return false;
	}
}
