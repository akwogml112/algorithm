/*
�Լ� solution�� ���� n�� �Ű������� �Է¹޽��ϴ�. n�� �� �ڸ����� ū�ͺ��� ���� ������ ������ ���ο� ������ �������ּ���. ������� n�� 118372�� 873211�� �����ϸ� �˴ϴ�.

���� ����
n�� 1�̻� 8000000000 ������ �ڿ����Դϴ�.
*/
package practice;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingOrder {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("������ �Է����ּ���: ");
			long num = scanner.nextLong();

			System.out.println(solution(num));
		}
	}

	private static long solution(long num) {
		char[] cArray = String.valueOf(num).toCharArray();
		Arrays.sort(cArray);
		StringBuilder sb = new StringBuilder(new String(cArray, 0, cArray.length));
		return Long.parseLong(sb.reverse().toString());
	}

}