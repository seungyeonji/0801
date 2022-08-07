import java.util.Scanner;

public class ArrayDemo2 {
	public static void main(String[] args) {
//		int [] array = new int[4];
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("첫번째 숫자 : ");
//		sc.nextInt();
		//이런식으로 하면 네번 반복해야함 -> 배열로 묶어서 해결
//		
//		for(int i=0;i<4;i++) {
//			System.out.print(i + "번째 방의 값 : ");
//			array[i] = sc.nextInt();
//		}
//		System.out.println(array);
		//출력결과 제대로 안나오고 주소가 나옴 -> 입력한 숫자가 나오는게 아니라 주소가 출력됨
		//->array는 주소를 받는 변수이기 때문
		
//		for(int i=0;i<4;i++) {
//			System.out.printf("array[%d] = %d\t", i, array[i]);
//		}
		
		Student [] array = new Student[2];	//학생 2명의 시작주소를 갖고 있따
//		for(int i=0; i<2; i++) {
//			System.out.printf("array[" + i + "] = " + array[i] + "\t");
//		}	//출력결과 null(번지)이 나옴 -> 아무것도 들어있지 않기 떄문에
		
		array[0] = new Student();
		array[1] = new Student();	//주소 생성
		
//		System.out.println();
//		for(int i=0; i<2; i++) {
//			System.out.print("array[" + i + "] = " + array[i] + "\t");
//		}	//출력결과 주소가 나옴
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<2; i++) {
			System.out.print(i + "번째 학생의 이름 : ");
			array[i].name = sc.nextLine();
			System.out.print(i + "번째 학생의 나이 : ");
			array[i].age = sc.nextInt();
			sc.nextLine();	//buffer 날리기
		}
		for(int j=0; j<2; j++) {
			System.out.print("array[" + j + "]의 이름 : " + array[j].name + "\t");
			System.out.print("array[" + j + "]의 나이 : " + array[j].age + "\t");
		}
	}
}
