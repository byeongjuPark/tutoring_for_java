import java.util.Scanner;
public class RPS {
	public static void main(String[] args) {//주먹 = 1, 가위 = 2, 보 =3 
		int User, Computer, UserMoney = 3000;
		Scanner sc = new Scanner(System.in); 
		System.out.println("신나는 가위바위보 게임~ 판돈 1000원!");
		System.out.println("*게임을 종료 '10' 입력");
		while(true) {
			Computer =(int)(1+3*Math.random());
			System.out.println("주먹 = 1, 가위 = 2, 보 =3 중 한개를 입력하세요! 남은 재산 : "+UserMoney);
			User = sc.nextInt();
			if(User == 10) {System.out.println("게임을 종료합니다.");break;}
			if(UserMoney == 0) {System.out.println("재산을 모두 탕진 하셨군요! 게임을 종료합니다.");break;}
			if(UserMoney == 6000) {System.out.println("컴퓨터가 파산했어요! 게임을 종료합니다.");break;}
			switch(User) {
			case 1:
				if(Computer == 1) {
					System.out.println("컴퓨터 : 주먹 ");
					System.out.println("비기셨습니다.");
				}else if(Computer == 2) {
					UserMoney = UserMoney + 1000;
					System.out.println("컴퓨터 : 가위 ");
					System.out.println("승리하셨습니다!!");
				}else if(Computer == 3) {
					UserMoney = UserMoney - 1000;
					System.out.println("컴퓨터 : 보 ");
					System.out.println("패배하셨습니다.");
				}
				break;
			case 2:
				if(Computer == 1) {
					UserMoney = UserMoney - 1000;
					System.out.println("컴퓨터 : 주먹 ");
					System.out.println("패배하셨습니다.");
				}else if(Computer == 2) {
					System.out.println("컴퓨터 : 가위 ");
					System.out.println("비기셨습니다.");
				}else if(Computer == 3) {
					UserMoney = UserMoney + 1000;
					System.out.println("컴퓨터 : 보 ");
					System.out.println("승리하셨습니다!!!");
				}
				break;
			case 3:
				if(Computer == 1) {
					UserMoney = UserMoney + 1000;
					System.out.println("컴퓨터 : 주먹 ");
					System.out.println("승리하셨습니다!!!");
				}else if(Computer == 2) {
					UserMoney = UserMoney - 1000;
					System.out.println("컴퓨터 : 가위 ");
					System.out.println("패배하셨습니다.");
				}else if(Computer == 3) {
					System.out.println("컴퓨터 : 보 ");
					System.out.println("비기셨습니다.");
				}
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}}}}
