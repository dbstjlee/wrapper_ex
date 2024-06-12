package ch01;

public class MainTest1 {

	public static void main(String[] args) {

		// 1단계 - 박싱, 언박싱 이라는 용어를 이해하자.
		int num1 = 3; // 기본 데이터 타입 --> wrapper 클래스 = integer
		Integer num2 = new Integer(3); // 박싱(int -> Integer)
		// @Deprecated => Integer : 앞으로 유지보수하지 않는 언어
		// JDK 17버전 -> 20버전으로 올라갈수록 사라질 수도 있다는 가능성이 있음

		// int num3 = num2; // 자동으로 들어감.
		int num3 = num2.intValue(); // 언박싱(Integer -> int)

		System.out.println(num2); // => 3
		System.out.println(num3); // => 3

		// 2단계 - 자동 박싱, 자동 언박싱 용어를 이해하자.
		Integer num4 = 17; // 자동 박싱 int <-- Wrapper --> Integer 변환된 것!
		// 원래는 박싱해서 넣어야 했으나 값이 들어가도록 내부적으로 허용해줌.
		int num5 = num4; // 자동 언박싱(Integer -> int)
		// 원래는 형변환해야 했음 => int num5 = (int)num4;
		
		System.out.println(num4); // => 17
		System.out.println(num5); // => 17

	}

}
