
public class ArrayDemo1 {
	public static void main(String[] args) {
		Student [] array;	//배열 선언
		array = new Student[3];	//배열 생성 -> Student를 만든게 아니라 배열을 만든것 = 학생 3명이 들어갈 방을 만든것
		
		array[0] = new Student(); //주소 생성
		array[0].name = "한지민";
		array[0].age = 26;
		
		array[1] = new Student(); //주소 생성
		array[1].name = "김철수";
		array[1].age = 36;
		
		array[2] = new Student(); //주소 생성
		array[2].name = "이영희";
		array[2].age = 46;
		
		for(int i=0;i<3;i++) {
			System.out.printf("이름 = %s, 나이 = %d\n", array[i].name, array[i].age);
		}
		
		//평균 나이 계산
//		int sum = array[0].age + array[1].age + array[2].age;
		
		//위에꺼 대신 반복문 사용해서 출력
		int sum=0;
		for(int i=0;i<3;i++) {
			sum +=array[i].age;
		}
		System.out.println("평균나이는 " + sum/3);
		
		
	}
}
