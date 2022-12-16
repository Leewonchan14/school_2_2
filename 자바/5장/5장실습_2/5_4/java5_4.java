package java5_2;
import java.util.Scanner;
	class Person {
		static void print() {
			System.out.println("Person");
		}
	}
	class Student extends Person { 
		static void print() {
			System.out.println("Student");
		}
	}
	class Researcher extends Person { 
		static void print() {
			System.out.println("Researcher");
		}
	}
	class Professor extends Researcher { 
		static void print() {
			System.out.println("Professor");
		}
	}
	
	public class java5_4 {
		static void print(Person p) {
		if(p instanceof Person)
			Person.print();
		if(p instanceof Student)
			Student.print();
		if(p instanceof Researcher)
			Researcher.print();
		if(p instanceof Professor)
			Professor.print();
		}

	public static void main(String[] args) {
		System.out.println("2018212031 이원찬");
		Scanner scanner = new Scanner(System.in);
		System.out.print("하나를 선택하세요\n1. person 2. student 3. researcher 4. professor\n");
		Person p = new Person();
		System.out.print("번호를 입력하세요 : ");
		int num = scanner.nextInt();
		if( num<=4 && num>=1){
		switch(num)
		{
		case 1:
			break;
		case 2:
			p = new Student();
			break;
		case 3:
			p = new Researcher();
			break;
		case 4:
			p = new Professor();
			break;
		}
		
		print(p);
		}
		else {
			System.out.println("잘못입력 하였습니다.");
		}
	}
}
