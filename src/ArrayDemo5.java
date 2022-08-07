
public class ArrayDemo5 {
	public static void main(String[] args) {
		int [] array = {4,5,8,1,3};
		for(int i=0; i<array.length; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}
		
		//새로운 for -> 배열과 컬렉션에서만 사용
		for(int su:array) {	//; 아니라 : 사용
			System.out.println(su);
		}//출력결과 인덱스가 없음

		//처음 for는 시작과 끝이 명료할 때 사용
		//두번째 for는 처음부터 끝까지 전부다 출력할때 -> 인덱스 생각x
	}
}
