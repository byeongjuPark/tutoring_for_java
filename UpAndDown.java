import java.util.Scanner;

public class UpAndDown {

	public static void main(String[] args) {
		int GuessNum = (int)(1+100*Math.random());
		int Num;
		int Point=100;
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			if(Point == 0) {
				System.out.println("Game Over!");
				break;
			}
			System.out.println("1~100까지의 예상 숫자를 입력하세요:");
			Num = sc.nextInt();
			if(Num == GuessNum) {
				System.out.println("정답입니다. 당신의 점수는 :"+Point);
				break;
			}else if(Num!= GuessNum) {
				Point= Point -5;
				if(Num>GuessNum) {
					System.out.println("Down!");
				}else if(Num < GuessNum) {
					System.out.println("Up!");
				}
			}
		}
	}

}
