import java.util.Scanner;
public class nineXnine {
	public static void main(String[] args) {
		int a,b,input = 0,count = 0, bestCount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 학습 프로그램!");
		System.out.println("학습을 종료하려면 999를 입력하세요.");
		while(true) {
			a = (int)(1+9*Math.random()); b = (int)(1+9*Math.random());
			System.out.println(a+"X" + b+" ?");
			input = sc.nextInt();
			if(input == (a*b)) {
				count++;
				System.out.println("정답입니다!"+ count + "연속 정답!");
			}else if(input == 999) {
				if(count > bestCount) {bestCount = count;}
				System.out.println("학습을 종료합니다. 기록된 최고 연속 정답은 "+bestCount+"회 입니다.");
				break;
			}else if(input != (a*b)) {
				if(count > bestCount) {bestCount = count;}
				count = 0;
				System.out.println("오답입니다! 정답은~"+(a*b));
				}
			}
		}
	}
