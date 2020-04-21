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
		System.out.println("Ќатисн≥ть 1,щоб перев≥рити чи такий м≥с€ць ≥снуЇ");
		System.out.println("Ќатисн≥ть 2,щоб вивести вс≥ м≥с€ц≥ з одинаковоњ порою року");
		System.out.println("Ќатисн≥ть 3,щоб вивести м≥с€ц≥,€к≥ мають однакову к≥льк≥сть дн≥в");
		System.out.println("Ќатисн≥ть 4,щоб вивести м≥с€ць,з найменшою к≥льк≥стю дн≥в" );
		System.out.println("Ќатисн≥ть 5,щоб вивести м≥с€ць,з найб≥льшою к≥льк≥стю дн≥в");
		System.out.println("Ќатисн≥ть 6,щоб вивести на екран наступну пору року");
		System.out.println("Ќатисн≥ть 7,щоб вивести на екран попередню пору року");
		System.out.println("Ќатисн≥ть 8,щоб вивести вс≥ м≥с€ц≥,€к≥ мають парну к≥льк≥сть дн≥в");
		System.out.println("Ќатисн≥ть 9,щоб вивести вс≥ м≥с€ц≥,€к≥ мають непарну к≥льк≥сть дн≥в");
		System.out.println("Ќатисн≥ть 10,щоб вивести чи введений м≥с€ць Ї парним");
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
			System.out.println("¬вед≥ть м≥с€ць");
			str=sc.next();
			if (isMonth(str)) 
				System.out.println("“акий м≥с€ць Ї");
				else {
					String message = "не в≥рно введений м≥с€ць";
					System.out.println();
					throw new WrongInputConsoleParametersException(message);
				}break;
		
		}
		case "2":{
			System.out.println("¬вед≥ть сезон");
			str=sc.next();
			if (isSeason(str)) {
				for(Monthes month : Monthes.values()) {
					   if (month.getSeasons().name().equalsIgnoreCase(str))
                           System.out.println(month);
                   }
               } else {
            	   String message = "не в≥рно введений сезон";
				System.out.println();
				throw new WrongInputConsoleParametersException(message);
               } break;
           }
		case "3":{
			System.out.println("¬вед≥ть м≥с€ць: ");
            str = sc.next();
            if (isMonth(str)){
                System.out.println("ћ≥с€ц≥ з однаковоњ к≥лькост≥ дн≥в");
                Monthes month = Monthes.valueOf(str.toUpperCase());
                        for(Monthes m : Monthes.values()){
                            if(m.getDay() == month.getDay())
                                System.out.println(m);
                        }
            }else{
         	   String message = "не в≥рно введений м≥с€ць";
				System.out.println();
				throw new WrongInputConsoleParametersException(message);
            } break;

        }
		case "4": {
			System.out.println("¬вед≥ть м≥с€ць");
			str = sc.next();
			if (isMonth(str)) {
				System.out.println("ћ≥с€цi, у €ких менше дн≥в");
				Monthes month = Monthes.valueOf(str.toUpperCase());
				for (Monthes m : Monthes.values()) {
					if (m.getDay() < m.getDay())
						System.out.println(m);
				}
				}
			else{
	         	   String message = "не в≥рно введений м≥с€ць";
					System.out.println();
					throw new WrongInputConsoleParametersException(message);
	            } break;
		}
		case "5": {
			System.out.println("¬вед≥ть м≥с€ць");
			str = sc.next();
			if (isMonth(str)) {
				System.out.println("ћ≥с€ц≥, у €ких б≥льше дн≥в: ");
				Monthes month = Monthes.valueOf(str.toUpperCase());
				for (Monthes m : Monthes.values()) {
					if (m.getDay() > m.getDay())
						System.out.println(m);
				}
			} 
			else{
	         	   String message = "не в≥рно введений м≥с€ць";
					System.out.println();
					throw new WrongInputConsoleParametersException(message);
	            } break;
		}
		case "6": {
			System.out.println("¬вед≥ть м≥с€ць");
			str = sc.next();
			if (isSeason(str)) {
				System.out.println(Seasons.values()[(Seasons.valueOf(str.toUpperCase()).ordinal() + 1) % 4]);
			} 
			else{
	         	   String message = "не в≥рно введений м≥с€ць";
					System.out.println();
					throw new WrongInputConsoleParametersException(message);
	            } break;
		}
		case "7": {
			System.out.println("¬вед≥ть сезон ");
			str = sc.nextLine();
			if (isSeason(str)) {
				int ord = Seasons.valueOf(str.toUpperCase()).ordinal() - 1;
				System.out.println(Seasons.values()[ord < 0 ? 3 : ord]);
			} else{
	         	   String message = "не в≥рно введений м≥с€ць";
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
			System.out.println("¬вед≥ть м≥с€у");
			str = sc.nextLine();
			if (isMonth(str)) {
				Monthes month = Monthes.valueOf(str.toUpperCase());
				if (month.getDay() % 2 == 0)
					System.out.println("¬аш м≥с€ць маЇ парну к≥льк≥сть дн≥в");
				else
					System.out.println("¬аш м≥с€ць маЇ непарну к≥льк≥сть дн≥в");
			} else
				System.out.println("ЌемаЇ такого м≥с€ц€");
			System.out.println(" ");
			break;

		}
				}
			}
				
			}
	
}

