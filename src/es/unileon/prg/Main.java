package es.unileon.prg.date;
public class Main
{
	public static void main(String[] args) throws DateException
	{
		int dia, mes, ano;
		System.out.println("\nIntroduce el dia: ");	
		dia=Teclado.readInteger();
		System.out.println("\nIntroduce el mes: ");	
		mes=Teclado.readInteger();
		System.out.println("\nIntroduce el año: ");	
		ano=Teclado.readInteger();
		Date date = new Date(dia,mes,ano);
	}


}