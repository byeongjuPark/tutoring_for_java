import java.util.Scanner;
public class RPS {
	public static void main(String[] args) {//�ָ� = 1, ���� = 2, �� =3 
		int User, Computer, UserMoney = 3000;
		Scanner sc = new Scanner(System.in); 
		System.out.println("�ų��� ���������� ����~ �ǵ� 1000��!");
		System.out.println("*������ ���� '10' �Է�");
		while(true) {
			Computer =(int)(1+3*Math.random());
			System.out.println("�ָ� = 1, ���� = 2, �� =3 �� �Ѱ��� �Է��ϼ���! ���� ��� : "+UserMoney);
			User = sc.nextInt();
			if(User == 10) {System.out.println("������ �����մϴ�.");break;}
			if(UserMoney == 0) {System.out.println("����� ��� ���� �ϼ̱���! ������ �����մϴ�.");break;}
			if(UserMoney == 6000) {System.out.println("��ǻ�Ͱ� �Ļ��߾��! ������ �����մϴ�.");break;}
			switch(User) {
			case 1:
				if(Computer == 1) {
					System.out.println("��ǻ�� : �ָ� ");
					System.out.println("���̽��ϴ�.");
				}else if(Computer == 2) {
					UserMoney = UserMoney + 1000;
					System.out.println("��ǻ�� : ���� ");
					System.out.println("�¸��ϼ̽��ϴ�!!");
				}else if(Computer == 3) {
					UserMoney = UserMoney - 1000;
					System.out.println("��ǻ�� : �� ");
					System.out.println("�й��ϼ̽��ϴ�.");
				}
				break;
			case 2:
				if(Computer == 1) {
					UserMoney = UserMoney - 1000;
					System.out.println("��ǻ�� : �ָ� ");
					System.out.println("�й��ϼ̽��ϴ�.");
				}else if(Computer == 2) {
					System.out.println("��ǻ�� : ���� ");
					System.out.println("���̽��ϴ�.");
				}else if(Computer == 3) {
					UserMoney = UserMoney + 1000;
					System.out.println("��ǻ�� : �� ");
					System.out.println("�¸��ϼ̽��ϴ�!!!");
				}
				break;
			case 3:
				if(Computer == 1) {
					UserMoney = UserMoney + 1000;
					System.out.println("��ǻ�� : �ָ� ");
					System.out.println("�¸��ϼ̽��ϴ�!!!");
				}else if(Computer == 2) {
					UserMoney = UserMoney - 1000;
					System.out.println("��ǻ�� : ���� ");
					System.out.println("�й��ϼ̽��ϴ�.");
				}else if(Computer == 3) {
					System.out.println("��ǻ�� : �� ");
					System.out.println("���̽��ϴ�.");
				}
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			}}}}
