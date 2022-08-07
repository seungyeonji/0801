import java.util.Scanner;

public class ArrayDemo7 {
	public static void main(String[] args) {
		//학생이 여러명일때 -> 배열 사용
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 몇 명 ? : ");
		int count = sc.nextInt();	//학생수
		sc.nextLine(); //buffer 날리기
		
		Student [] array = new Student[count];
		for(Student std:array) {	//반복의 대상에서 하나씩 끄집어냐서 저장할 변수:반복의 대상
			std = new Student();
			
			System.out.print("Name : ");
			std.name = sc.nextLine();
			
			System.out.print("Hakbun : ");
			std.hakbun = sc.nextLine();
			
			System.out.print("Korean : ");
			std.kor = sc.nextInt();
			
			System.out.print("English : ");
			std.eng = sc.nextInt();
			
			System.out.print("Math : ");
			std.mat = sc.nextInt();
			sc.nextLine();	//buffer날리기(수학점수 다음에 이름 오니까)
			
			std.calcTot();
			std.calcAvg();
			std.calcGrade();
			
			std.display();
		}
		//main을 줄이는게 좋기 때문에 Student클래스에 변수랑 메소드를 다 만들어주면 main이 짧아짐
	}
}
