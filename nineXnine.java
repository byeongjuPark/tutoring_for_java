import java.util.Scanner;
public class nineXnine {
	public static void main(String[] args) {
		int a,b,input = 0,count = 0, bestCount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �н� ���α׷�!");
		System.out.println("�н��� �����Ϸ��� 999�� �Է��ϼ���.");
		while(true) {
			a = (int)(1+9*Math.random()); b = (int)(1+9*Math.random());
			System.out.println(a+"X" + b+" ?");
			input = sc.nextInt();
			if(input == (a*b)) {
				count++;
				System.out.println("�����Դϴ�!"+ count + "���� ����!");
			}else if(input == 999) {
				if(count > bestCount) {bestCount = count;}
				System.out.println("�н��� �����մϴ�. ��ϵ� �ְ� ���� ������ "+bestCount+"ȸ �Դϴ�.");
				break;
			}else if(input != (a*b)) {
				if(count > bestCount) {bestCount = count;}
				count = 0;
				System.out.println("�����Դϴ�! ������~"+(a*b));
				}
			}
		}
	}
