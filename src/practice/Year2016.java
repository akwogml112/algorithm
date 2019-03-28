/*
 * 2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 
 * 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT입니다. 
 * 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.
 * 2016년은 윤년입니다.
 */
package practice;

public class Year2016 {

	public static void main(String[] args) {
		Year2016 theYear2016 = new Year2016();
		int a = 5;
		int b = 24;
		System.out.println(theYear2016.solution(a, b));
	}

	public String solution(int a, int b) {
	      int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	      String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
	      int total = 0;
	      for(int i=0; i<a-1; ++i) {
	          total += days[i];
	      }
	      total += b;
	      
	      String answer = day[total%7];
	      return answer;
	  }
}
