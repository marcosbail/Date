package es.unileon.prg.Date;
public class Date
{
	private int _day;
	private int _month;
	private int _year;

//Constructor Auxiliar
	public Date()
	{
		this._day = 1;
		this._month = 1;
		this._year = 2016;
	
	}

	
//Constructor Auxiliar

//Constructor
	public Date(int day, int month, int year) throws DateException
	{
	StringBuffer buff = new StringBuffer();
	if((day>31)||(day<1))
	{
		buff.append("El dia esta fuera de rango (mas de 31 o menos de 1)");
			
	}

	if((month>12)||(month<1))
	{
		buff.append("El mes esta fuera de rango (mas de 12 o menos de 1)");
	}

	if(year<0)
	{
		buff.append("El año es negativo (fuera de rango)");
	}
	if (isvalidDayRange(day))
	{
	
	}
	
	if(buff.length()!=0)
	{
		throw new DateException(buff);
	}
	else
	{
		_day = day;
		_month = month;
		_year = year;
	}
	}
//Fin Constructor
	
	public void setDay(int day)
	{
		
		_day=day;
	}

	public void setMonth(int month)
	{

		_month=month;
	}

	public void setYear(int year)
	{
		_year=year;
	}

	/*public int getDate()
	{

	}*/

	public int getDay()
	{
		return _day;
	}

	public int getMonth()
	{
		return _month;
	}

	public int getYear()
	{
		return _year;
	}

	private 


	private boolean isValidDayRange(int day, int month)
	{
		boolean r = false;
		switch(month)
		{
			case (1): 
			case(3): 
			case(5): 
			case(7): 
			case(8): 
			case(10): 
			case(12): 
				if((day<1)||(day>31))
				{
					r=true;
				} 
				break;
			case (2): 
				if((day<1)||(day>28))
				{
					r=true;
				} 
				break;
			case (4): 
			case(6): 
			case(9): 
			case(11):
				if((day<1)||(day>30))
				{
					r=true;
				} 
				break;
		}
		return r;
	}

	public String getMonthName(int month)
	{
		String name = "";
		switch(month)
		{
			case (1): name = "Enero";
				break;
			case (2): name = "Febrero";
				break;
			case (3): name = "Marzo";
				break;
			case (4): name = "Abril";
				break;
			case (5): name = "Mayo";
				break;
			case (6): name = "Junio";
				break;
			case (7): name = "Julio";
				break;
			case (8): name = "Agosto";
				break;
			case (9): name = "Septiembre";
				break;
			case (10): name = "Octubre";
				break;
			case (11): name = "Noviembre";
				break;
			case (12): name = "Diciembre";
				break;
		}
		return (name);
	}

	public boolean isSameDate(){}

 /* La primavera (equinoccio de primavera) comienza el 21 de marzo, el solsticio de verano comienza el 21 de junio, el equinoccio de otoño comienza el 23 de septiembre y el solsticio de invierno el 21 de diciembre. */

	public String getSeasonName(int month)
	{
	String season = "";
	switch(month)
	{
		case(1): case(2): season="Invierno"; 
		break;
			case(3): season="Invierno hasta el 21 luego equinoccio de primavera"; 
			break;
		case(4): 
		case(5): season="Primavera";
		 break;
			case(6): season="Primavera hasta el 21 luego solsticio de verano"; 
			break;
		case(7):
		case(8): season="Verano"; 
		break;
			case(9): season="Verano hasta el 23 luego equinoccio de otoño"; 
			break;
		case(10):
		case(11): season="Otoño"; 
		break;
			case(12): season="Otoño hasta el 21 luego solsticio de invierno"; 
			break;
	}
	return (season);

	}

	public int getMonthDays(int month)
	{
		int left=0;
		switch(month)
		{
			case (1): 
			case(3): 
			case(5): 
			case(7): 
			case(8): 
			case(10): 
			case(12): 
				left=31;
				break;
			case (2): 
				left=28;
				break;
			case (4): 
			case(6): 
			case(9): 
			case(11):
				left=30;
				break;
		}
		return (left);
	}

	public string getMonthsLeft()
	{
		Date aux = new Date(this);
		StringBuffer left = new StringBuffer();
		try{
			for(int i=this.month+1; i<=12; i++)
			{
				aux.setMonth(i);
				left.append(aux.getMonthName()+" ");
			}
		}catch(DateException exc){
			System.err.print("Date.getMonthsLeft:"+exc.getMessage());
		}
		return left.toString();
	}
//	Write a method in Date class that prints a date. 
	public String toString() {

		StringBuffer salida = new StringBuffer();
		
		salida.append(_day+"/"+_month+"/"+_year);
		
		return salida.toString();
		
	}

//For a date, print the months left until the end of  the year. 
	public getDaysLeft()
	{
		Date aux = new Date(this);
		StringBuffer left = new StringBuffer();
		try{
			for(int i=this.day+1; i<=aux.getMonthDays(this.month); i++)
			{
				aux.setMonth(i);
				left.append(aux.getMonthName()+" ");
			}
		}catch(DateException exc){
			System.err.print("Date.getMonthsLeft:"+exc.getMessage());
		}
		return left.toString();
	}
//For a date, print all dates until the end of  the month. 
	public getDaysLeftInMonth()
	{
		Date aux = new Date(this);
		StringBuffer left = new StringBuffer();
		try{
			for(int i=this.day+1; i<=12; i++)
			{
				aux.setMonth(i);
				left.append(aux.getMonthName()+" ");
			}
		}catch(DateException exc){
			System.err.print("Date.getMonthsLeft:"+exc.getMessage());
		}
		return left.toString();
	}
	//For a date, print the months with the same number 
	//of  days as the month of  this date. 
	public getMonthsWithSameDays()
	{
		Date aux = new Date(this);
		StringBuffer left = new StringBuffer();
		try{
			for(int i=this.day+1; i<=12; i++)
			{
				aux.setMonth(i);
				left.append(aux.getMonthName()+" ");
			}
		}catch(DateException exc){
			System.err.print("Date.getMonthsLeft:"+exc.getMessage());
		}
		return left.toString();
	}
	/*For a date, count the number of  days since the first 
	day of  the year (do not consider leap years) */
	public getDaysSinceYear()
	{
		Date aux = new Date(this);
		StringBuffer left = new StringBuffer();
		try{
			for(int i=this.day+1; i<=12; i++)
			{
				aux.setMonth(i);
				left.append(aux.getMonthName()+" ");
			}
		}catch(DateException exc){
			System.err.print("Date.getMonthsLeft:"+exc.getMessage());
		}
		return left.toString();
	}






























}
