package java5_2;
import java.util.Scanner;
class Shape { // 슈퍼 클래스
	public Shape next;
	public Shape() { next = null; }
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape {
	public void draw() { // 메소드 오버라이딩
		System.out.println("Line");
	}
}
class Rect extends Shape {
	public void draw() { // 메소드 오버라이딩
		System.out.println("Rect");
	}
}
class Circle extends Shape {
	public void draw() { // 메소드 오버라이딩
		System.out.println("Circle");
	}
}
public class UssingOverride {

	public static void main(String[] args) {
		System.out.println("2018212031 이원찬");
		Shape start, last, obj;
		// 모든 도형 출력
		start = new Shape();
		last = new Shape();
		obj = new Shape();
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int i = 4;
		while (i>0)
		{
	
			System.out.print("하나를 선택하세요\n1. line 2. circle 3. rect\n");
			System.out.print("번호를 입력하세요 : ");
			int num = scanner.nextInt();
			if(num<=3&&num>=1) {
				switch(num)
				{
				case 1:
					obj = new Line();
					break;
				case 2:
					obj = new Circle();
					break;
				case 3:
					obj = new Rect();
					break;
				}
				if(i==4) {
					start = obj;
					last = obj;
				}
				else {
					last.next = obj;
					last = obj;
				}
			}
			else {
				System.out.println("잘못입력했습니다.");
				i++;}
			i--;
		}
		while(start != null) {
			start.draw();
			start = start.next;
		}
		
	}

}
