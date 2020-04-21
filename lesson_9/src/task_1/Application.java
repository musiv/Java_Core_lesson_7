/*
 * Logos it Academy
 */
package task_1;

import java.util.Scanner;

/*
 * @since java 1.8
 * @author Mysiv Taras
 * @version 1.1
 */

public class Application {
	enum Seasons{
		WINTER,SPRING,SUMMER,AUTUMN;
	}
	enum Monthes{
		
		January (31,Seasons.WINTER) ,
		February(28,Seasons.WINTER),
		March(31,Seasons.SPRING),
		April(30,Seasons.SPRING),
		May(31,Seasons.SPRING),
		June(30,Seasons.SUMMER),
		Jule(31,Seasons.SUMMER),
		August(31,Seasons.SUMMER),
		September(30,Seasons.AUTUMN),
		October(31,Seasons.AUTUMN),
		November(30,Seasons.AUTUMN),
		December(31,Seasons.WINTER);
		
		private int day;
		private Seasons seasons;
		
		private Monthes(int day, Seasons seasons) {
			this.day = day;
			this.seasons = seasons;
		}
		public int getDay() {
			return day;
		}
		public Seasons getSeasons() {
			return seasons;
		}
	}
	
	static void menu(){
		System.out.println("�������� 1,��� ��������� �� ����� ����� ����");
		System.out.println("�������� 2,��� ������� �� ����� � ��������� ����� ����");
		System.out.println("�������� 3,��� ������� �����,�� ����� �������� ������� ���");
		System.out.println("�������� 4,��� ������� �����,� ��������� ������� ���" );
		System.out.println("�������� 5,��� ������� �����,� ��������� ������� ���");
		System.out.println("�������� 6,��� ������� �� ����� �������� ���� ����");
		System.out.println("�������� 7,��� ������� �� ����� ��������� ���� ����");
		System.out.println("�������� 8,��� ������� �� �����,�� ����� ����� ������� ���");
		System.out.println("�������� 9,��� ������� �� �����,�� ����� ������� ������� ���");
		System.out.println("�������� 10,��� ������� �� �������� ����� � ������");
	}
	
	static boolean isMonth(String str){
        boolean isMonth = false;
        for (Monthes month : Monthes.values()) {
            if (str.equalsIgnoreCase(month.name())) {
                isMonth = true;
                break;
            }
        }
        return isMonth;
    }

    static boolean isSeason(String str){
        boolean isSeason = false;
        for (Seasons seasons : Seasons.values()) {
            if (str.equalsIgnoreCase(seasons.name())) {
                isSeason = true;
                break;
            }
        }
        return isSeason;
    }
	public static void main(String[] args) throws WrongInputConsoleParametersException {
		Monthes [] months = Monthes.values();
		Scanner sc = new Scanner(System.in);
		String str;
		
	
	
	while(true) {
		menu();
		str= sc.nextLine();
		switch(str) {
		case "1":{
			System.out.println("������ �����");
			str=sc.next();
			if (isMonth(str)) 
				System.out.println("����� ����� �");
				else {
					String message = "�� ���� �������� �����";
					System.out.println();
					throw new WrongInputConsoleParametersException(message);
				}break;
		
		}
		case "2":{
			System.out.println("������ �����");
			str=sc.next();
			if (isSeason(str)) {
				for(Monthes month : Monthes.values()) {
					   if (month.getSeasons().name().equalsIgnoreCase(str))
                           System.out.println(month);
                   }
               } else {
            	   String message = "�� ���� �������� �����";
				System.out.println();
				throw new WrongInputConsoleParametersException(message);
               } break;
           }
		case "3":{
			System.out.println("������ �����: ");
            str = sc.next();
            if (isMonth(str)){
                System.out.println("̳���� � �������� ������� ���");
                Monthes month = Monthes.valueOf(str.toUpperCase());
                        for(Monthes m : Monthes.values()){
                            if(m.getDay() == month.getDay())
                                System.out.println(m);
                        }
            }else{
         	   String message = "�� ���� �������� �����";
				System.out.println();
				throw new WrongInputConsoleParametersException(message);
            } break;

        }
		case "4": {
			System.out.println("������ �����");
			str = sc.next();
			if (isMonth(str)) {
				System.out.println("̳���i, � ���� ����� ���");
				Monthes month = Monthes.valueOf(str.toUpperCase());
				for (Monthes m : Monthes.values()) {
					if (m.getDay() < m.getDay())
						System.out.println(m);
				}
				}
			else{
	         	   String message = "�� ���� �������� �����";
					System.out.println();
					throw new WrongInputConsoleParametersException(message);
	            } break;
		}
		case "5": {
			System.out.println("������ �����");
			str = sc.next();
			if (isMonth(str)) {
				System.out.println("̳����, � ���� ����� ���: ");
				Monthes month = Monthes.valueOf(str.toUpperCase());
				for (Monthes m : Monthes.values()) {
					if (m.getDay() > m.getDay())
						System.out.println(m);
				}
			} 
			else{
	         	   String message = "�� ���� �������� �����";
					System.out.println();
					throw new WrongInputConsoleParametersException(message);
	            } break;
		}
		case "6": {
			System.out.println("������ �����");
			str = sc.next();
			if (isSeason(str)) {
				System.out.println(Seasons.values()[(Seasons.valueOf(str.toUpperCase()).ordinal() + 1) % 4]);
			} 
			else{
	         	   String message = "�� ���� �������� �����";
					System.out.println();
					throw new WrongInputConsoleParametersException(message);
	            } break;
		}
		case "7": {
			System.out.println("������ ����� ");
			str = sc.nextLine();
			if (isSeason(str)) {
				int ord = Seasons.valueOf(str.toUpperCase()).ordinal() - 1;
				System.out.println(Seasons.values()[ord < 0 ? 3 : ord]);
			} else{
	         	   String message = "�� ���� �������� �����";
					System.out.println();
					throw new WrongInputConsoleParametersException(message);
	            } break;

		}
		case "8": {
			for (Monthes month : months) {
				if (month.getDay() % 2 == 0)
					System.out.println(month);
			}
			System.out.println(" ");
			break;
		}
		case "9": {
			for (Monthes month : months) {
				if (month.getDay() % 2 != 0)
					System.out.println(month);
			}
			System.out.println(" ");
			break;
		}
		case "10": {
			System.out.println("������ ����");
			str = sc.nextLine();
			if (isMonth(str)) {
				Monthes month = Monthes.valueOf(str.toUpperCase());
				if (month.getDay() % 2 == 0)
					System.out.println("��� ����� �� ����� ������� ���");
				else
					System.out.println("��� ����� �� ������� ������� ���");
			} else
				System.out.println("���� ������ �����");
			System.out.println(" ");
			break;

		}
				}
			}
				
			}
	
}

