package es.unileon.prg.date;
public class Main
{
	public static void main(String[] args) 
	{
		int dia, mes, ano;
		//try{
		System.out.println("\nIntroduce el dia: ");	
		dia=Teclado.readInteger();
		System.out.println("\nIntroduce el mes: ");	
		mes=Teclado.readInteger();
		System.out.println("\nIntroduce el año: ");	
		ano=Teclado.readInteger();
		//}catch(DateException exp){


		//}
		
		try{
		Date date = new Date(dia,mes,ano);

		System.out.println("\ntoString(): ");
		System.out.println(date.toString());

		System.out.println("\nEjercicios Switch: ");
		System.out.println("\n");
		System.out.println(date.getMonthName());
		System.out.println("\n");
		System.out.println(date.getSeasonName());
		System.out.println("\n");
		System.out.println(date.getMonthDays());

		System.out.println("\nEjercicios For: ");
		System.out.println("\n");
		System.out.println(date.getMonthsLeft());
		System.out.println("\n");
		System.out.println(date.getDaysLeft());
		System.out.println("\n");
		System.out.println(date.getDatesLeftInMonth());
		System.out.println("\n");
		System.out.println(date.getMonthsWithSameDays());
		System.out.println("\n");
		System.out.println(date.getDaysSinceYear());
		System.out.println("\n");

		System.out.println("\nEjercicios Looping (do-while): ");
		System.out.println("\n");
		System.out.println(date.numberOfAttempts());
		System.out.println("\n");
		System.out.println(date.getWeekDay(5));
		
		}catch(DateException exp){
			System.err.print(exp.getMessage());
		}
		
	}


}
