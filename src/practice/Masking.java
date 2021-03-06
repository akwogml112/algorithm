/*
문제 설명
프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.

제한 조건
s는 길이 4 이상, 20이하인 문자열입니다.
*/
package practice;

import java.util.Scanner;

public class Masking {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("전화번호를 입력해주세요: ");
			String phoneNumber = scanner.next();

			System.out.println(solution(phoneNumber));
		}
	}

	private static String solution(String phoneNumber) {
		StringBuilder sb = new StringBuilder();
		int length = phoneNumber.length();
		for(int i=0; i<length-4; ++i){
			sb.append("*");
		}
		sb.append(phoneNumber.substring(length-4));
		return sb.toString();
	}
}
