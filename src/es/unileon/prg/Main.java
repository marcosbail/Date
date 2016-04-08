package es.unileon.prg.date;
public class Main
{
	public static void main(String[] args) 
	{
		int dia, mes, ano;
		
		System.out.println("\nIntroduce el dia: ");	
		dia=Teclado.readInteger();
		System.out.println("\nIntroduce el mes: ");	
		mes=Teclado.readInteger();
		System.out.println("\nIntroduce el año: ");	
		ano=Teclado.readInteger();

//Variables de prueba para comparacion de fechas quitar comentarios para probar comparaciones
		/*int dia2, mes2, ano2;
		System.out.println("\nIntroduce el dia 2: ");	
		dia2=Teclado.readInteger();
		System.out.println("\nIntroduce el mes 2: ");	
		mes2=Teclado.readInteger();
		System.out.println("\nIntroduce el año 2: ");	
		ano2=Teclado.readInteger();*/
	
		
		try{
		Date date = new Date(dia,mes,ano);
/*		Date date2 = new Date(dia2,mes2,ano2);   quitar comentarios para probar comparaciones*/
		System.out.println("\ntoString(): ");
		System.out.println(date.toString());

//quitar comentarios para probar comparaciones
		/*System.out.println("\nCompare Dates, day, month, year: ");
		System.out.println("\n");
		System.out.println(date.sameDate(date2));
		System.out.println("\n");
		System.out.println(date.sameDay(date2));
		System.out.println("\n");
		System.out.println(date.sameMonth(date2));
		System.out.println("\n");
		System.out.println(date.sameYear(date2));*/

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
//Hay que pasarle el numero del dia de la semana en el que comienza el año
		System.out.println(date.getWeekDay(5));
		
		}catch(DateException exp){
			System.err.print(exp.getMessage());
		}
		
	}


}
