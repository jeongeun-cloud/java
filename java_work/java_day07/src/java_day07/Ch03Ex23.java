package java_day07;

import java.util.Scanner;

public class Ch03Ex23 {
	static Scanner scan = new Scanner(System.in);
	static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
	static int month = 0;
	static int day = 0;
	static int total = 0;	
	
	
	public static void main(String[] args) {
		// 입력받은 ~월 ~일 부터 100일 후의 날짜 출력
		// 100일이 될 때까지 누적 - 100이 넘으면 계산한 달에서 넘치는 만큼 빼준다.
		
		System.out.print("월 입력 : ");
		month = scan.nextInt();
		System.out.print("일 입력 : ");
		day = scan.nextInt();
		
		total = days[month-1] - day; // 해당 월의 남은 날짜 누적
		int i = 0;
		for(i=month; total<100; i++){
			i = i % 12;
			total += days[i];			
		}
		
		int nextMonth = i;
		int nextDay = days[i-1] - (total - 100);
		System.out.printf("%d월 %d일로 부터 100일 후는 %d월 %d일입니다.", month, day, nextMonth, nextDay);
		
	}
	
	
	
	public static void test04(String[] args) {
		// 입력받은 ~월 ~일 부터 100일 후의 날짜 출력
		// total에 100일 넣고 빼나가기
		
		System.out.print("월 입력 : ");
		month = scan.nextInt();
		System.out.print("일 입력 : ");
		day = scan.nextInt();
		
		total = 100 - (days[month-1] - day);
		int i = month % 12;
		while(days[i] < total){
			total -= days[i++];
			i = i % 12;
		}
		
		int nextDay = total;
		int nextMonth = i+1;
				
		System.out.printf("%d월 %d일로 부터 100일 후는 %d월 %d일입니다.", month, day, nextMonth, nextDay);
		
	}
	
	
	
	public static void test03(String[] args) {
		// 입력하신 ~월 ~일 부터 1년은 total일 남았습니다.
		
		System.out.print("월 입력 : ");
		month = scan.nextInt();
		System.out.print("일 입력 : ");
		day = scan.nextInt();
		
		total = days[month-1] - day;
		
		for(int i=month; i<days.length; i++){
			total += days[i];
		}
		System.out.printf("%d월 %d일부터 1년의 남은 날짜는 %d일입니다.", month, day, total);
	}
	
	
	
	public static void test02(String[] args) {
		// 월, 일 입력 -> 1월 1일 부터 ~월 ~일 까지는 총 total입니다.

		System.out.print("월 입력 : ");
		month = scan.nextInt();
		System.out.print("일 입력 : ");
		day = scan.nextInt();
		
		total = day; // 입력 받은 월의 날짜 입력
		
		for(int i=0; i<month-1; i++){
			total += days[i];
		}
		System.out.printf("1월 1일부터 %d월 %d일까지의 날짜는 총 %d일 입니다.",month, day, total);
	}
		
	
	
	public static void test01(String[] args) {
		// 월을 입력 받아서 해당 월의 날짜 수를 출력한다.
		
		System.out.print("월 입력 : ");
		month = scan.nextInt();
		
		System.out.printf("입력하신 %d월의 날짜 수는 %d일입니다",month,days[month-1]);
	}
}
