
public class Student {
	String name,hakbun;	//멤버변수=인스턴스변수
	int kor, eng, mat, tot;
	int age;
	double avg;
	char grade;
	
	void calcTot() {
		tot = kor + eng + mat;
	}
	void calcAvg() {
		avg = tot/3.;
	}
	void calcGrade() {
		grade = (avg<=100 && avg>=90) ? 'A':
					(avg>=80) ? 'B':
						(avg>=70) ? 'C':
							(avg>=60) ? 'D':'F';
	}
	void display() {
		System.out.printf("%s(%s)\t%d\t%d\t%d\t%d\t%.2f\t%c\n", 
				name, hakbun, kor, eng, mat, tot, avg, grade);
	}
	//위 메소드들은 멤버 메소드=인스턴스 메소드
	//-> 주소로 접근해야하니까 주소가 나오는 new를 해줄때 접근 가능
	//cf. local변수는 주소없이 접근
}
