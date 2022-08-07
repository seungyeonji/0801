
public class Product {
	String name;
	int price;
	String color;
	
	void display() {
		System.out.printf("이름 = %s, 가격 = %d, 색상 = %s\n", name, price, color);
	}//멤버메소드 -> 반드시 주소로 접근(주소는 new할때 생성됨)
}
