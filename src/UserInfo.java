import java.util.*;

public class UserInfo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("귀하의 이름은 ? : ");
		String name = sc.nextLine();
		
//		sc.nextLine();
		
		System.out.print("귀하의 나이는 ? : ");
		int age = sc.nextInt();
		sc.nextLine();	// 나이와 함께 들어온 엔터를 없애기 위해 버퍼를 날려버린다.
		
		System.out.print("귀하의 전화번호는 ? : ");
		String tel = sc.nextLine();
		
		
		System.out.print("귀하의 신장은 ? : ");
		double tall = sc.nextDouble();
		
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 전화번호 : " + tel + ", 키는 : "+ tall +"cm");
	}
}
