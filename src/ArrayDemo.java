//변수와 배열의 차이점
public class ArrayDemo {
	public static void main(String[] args) {
		//1st way
		int [] array;	//배열로 선언
		array = new int[4];		//방 4개짜리 배열의 생성
//		System.out.println(array[0]); 	//0출력 -> 0 넣은적 없지만 heap에 집 지을때는 데이터 타입에 따라 자동 초기화된 값 출력
		
//		array[0] = 6;
//		array[1] = 9;
//		array[2] = 12;
//		array[3] = 15;	//할당(assignment)
//		
//		//각 방에 뭐가 들어있는지 출력
//		for(int i = 0; i<4; i++) {
//			System.out.println("array[" + i + "] = " +  array[i] + "\t");
//		}
		
		//위 방법의 단점은 배열의 개수가 늘어날수록 비효율적
		//그래서 생성과 할당을 한번에
		//2nd way
//		double [] weights;	//여러명의 몸무게 받기위한 배열 선언
//		weights = new double[] {67.3, 78.9, 52.3};	//생성 및 할당
//													//-> 개수 지정안해줘도 값 개수에 따라 자동으로 생성
//		for(int i=0; i<3; i++) {
//			System.out.printf("weights[%d] = %.1f\t", i, weights[i]);
//		}
		
		//3rd way : 선언, 생성, 할당을 한번에
		char [] grades = {'A', 'C', 'B', 'B', 'C'};	//초기화
		//간단해 보이지만 치명적인 단점은 꼭 한줄에 넣어야한다는거, 줄을 바꾸면 안됨
		
		int i = 0;	//초기값
		while(i<5) {	//조건
			System.out.print("grades[" + i + "] = " + grades[i] + "\t");
			i++;	//증감
			
		}
	}
}
