import java.util.Scanner;

//성적관리프로그램
public class ArrayDemo6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//학생이 한명일 때
		Student jimin = new Student();
		System.out.print("Name : ");
		jimin.name = sc.nextLine();
		
		System.out.print("Hakbun : ");
		jimin.hakbun = sc.nextLine();
		
		System.out.print("Korean : ");
		jimin.kor = sc.nextInt();
		
		System.out.print("English : ");
		jimin.eng = sc.nextInt();

		System.out.print("Math : ");
		jimin.mat = sc.nextInt();
		
//		jimin.tot = jimin.kor + jimin.eng + jimin.mat;
//		jimin.avg = jimin.tot/3.;
//		
//		jimin.grade = (jimin.avg<=100 && jimin.avg>=90) ? 'A' :
//						(jimin.avg >=80) ? 'B' :
//							(jimin.avg >=70) ? 'C' :
//								(jimin.avg >=60) ? 'D' : 'F';
//		
//		System.out.printf("%s(%s)\t%d\t%d\t%d\t%d\t%.2f\t%c\n", 
//				jimin.name, jimin.hakbun, jimin.kor, jimin.eng, jimin.mat, jimin.tot, jimin.avg, jimin.grade);
//		
		
		//Student클래스에서 멤버메소드 만들어 불러오기
		jimin.calcTot();
		jimin.calcAvg();
		jimin.calcGrade();
//		
//		System.out.printf("%s(%s)\t%d\t%d\t%d\t%d\t%.2f\t%c\n", 
//				jimin.name, jimin.hakbun, jimin.kor, jimin.eng, jimin.mat, jimin.tot, jimin.avg, jimin.grade);
		
		//Student클래스에서 출력메소드까지 만들어서 불러오기
		jimin.display();
	}
}
