package es.unileon.prg.date;
public class Date
{
	private int _day;
	private int _month;
	private int _year;

//Constructor VAcio
	public Date()
	{
		this._day = 1;
		this._month = 1;
		this._year = 2016;
	
	}
//Constructor Vacio

//Constructor Aux
	public Date(Date aux)
	{
			this._day = aux.getDay();
			this._month = aux.getMonth();
			this._year = aux.getYear();
	}

//Constructor Aux
//Constructor
	public Date(int day, int month, int year) throws DateException
	{
	StringBuffer buff = new StringBuffer();
	if((day>31)||(day<1))
	{
		buff.append("\nEl dia esta fuera de rango (mas de 31 o menos de 1)");
	}

	if((month>12)||(month<1))
	{
		buff.append("\nEl mes esta fuera de rango (mas de 12 o menos de 1)");
	}

	if(year<0)
	{
		buff.append("\nEl año es negativo (fuera de rango)");
	}
	
	if(buff.length()!=0)
	{
		throw new DateException(buff.toString());
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



	public boolean isValidDayRange()
	{
		boolean r = false;
		switch(this._month)
		{
			case (1): 
			case(3): 
			case(5): 
			case(7): 
			case(8): 
			case(10): 
			case(12): 
				if((this._day<1)||(this._day>31))
				{
					r=true;
				} 
				break;
			case (2): 
				if((this._day<1)||(this._day>28))
				{
					r=true;
				} 
				break;
			case (4): 
			case(6): 
			case(9): 
			case(11):
				if((this._day<1)||(this._day>30))
				{
					r=true;
				} 
				break;
		}
		return r;
	}

	public String getMonthName()
	{
		String name = "";
		switch(this._month)
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
		return name;
	}

 /* La primavera (equinoccio de primavera) comienza el 21 de marzo, el solsticio de verano comienza el 21 de junio, el equinoccio de otoño comienza el 23 de septiembre y el solsticio de invierno el 21 de diciembre. */

	public String getSeasonName()
	{
	String season = "";
	switch(this._month)
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

	public int getMonthDays()
	{
		int left=0;
		switch(this._month)
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

	public String getMonthsLeft()
	{
		Date aux = new Date(this);
		StringBuffer left = new StringBuffer();
		try{
			for(int i=this._month+1; i<=12; i++)
			{
				aux.setMonth(i);
				left.append(aux.getMonthName()+" ");
			}
			return left.toString();
		}catch(DateException exc){
			System.err.print("Date.getMonthsLeft:"+exc.getMessage());
		}

	}
//Write a method in Date class that prints a date. 
	public String toString()
	{
		StringBuffer salida = new StringBuffer();
		
		salida.append(_day+"/"+_month+"/"+_year);
		
		return salida.toString();
	}

//For a date, print the months left until the end of  the year. 
	public String getDaysLeft()
	{
		Date aux = new Date(this);
		StringBuffer left = new StringBuffer();
		//try{
			for(int i=this._day+1; i<=aux.getMonthDays(); i++)
			{
				left.append(i+" ");
			}
		//}catch(DateException exc){
			//System.err.print("Date.getDaysLeft:"+exc.getMessage());
		//}
		return left.toString();
	}


//For a date, print all dates until the end of  the month. 

	public String getDatesLeftInMonth()
	{
		Date aux = new Date(this);
		StringBuffer left = new StringBuffer();
		int j=0;
	//try{
		for(int i=this._day;i<=getMonthDays();i++)
		{
		    setDay(aux.getDay()+j++);
		    left.append(" "+this._day+"/"+this._month+"/"+this._year);
		}
	//}catch(DateException exc){
		//System.err.print("Date.getDaysLeftInMonth:"+exc.getMessage());
	//}

        	return left.toString();
	}

	//For a date, print the months with the same number 
	//of  days as the month of  this date. 
	public String getMonthsWithSameDays()
	{

		StringBuffer equal = new StringBuffer();
		int dias = getMonthDays();
		int otrosDias = 0;

		Date fecha1 = new Date(this);

		Date fecha2 = new Date(this);

		for(int i=1;i<=12;i++){

		fecha2.setMonth(i);

			if(dias==fecha2.getMonthDays())
			{

				    equal.append(" "+fecha2.getMonthName());

			}
		}
		return equal.toString();
	}
	/*For a date, count the number of  days since the first 
	day of  the year (do not consider leap years) */
	public int getDaysSinceYear()
	{
		int dias = 0;

		Date fecha1 = new Date(this);
		Date fecha2 = new Date(this);

		for(int i = 1; i < fecha2.getMonth(); i++)
		{

		    fecha1.setMonth(i);
		    dias += fecha1.getMonthDays();
		}

		return dias + this.getDay();
	}

	//Looping statements - Exercises 

/*Build a method that counts the number of  attempts 
needed to generate a random date equals to a given 
date (only inside the same year) 

Do it using a 
do-while 
statement */
	public int numberOfAttempts()
	{
		int attempts=0;
		int r_day=0;
		int r_month=0;
		int r_year=0;
		do
		{
			r_day = (int) (Math.random()*31+1);
			r_month = (int) (Math.random()*12+1);
			r_year = (int) (Math.random()*3000+1);
			attempts++;
		}while(this._year!=r_year);	

		return (attempts);
	}

/*For a given date and knowing the day of the week of  
the first day of the year of  that date, show the day of  
the week of  the given date*/
	public int getWeekDay(int weekDay)
	{
		int day=(getDaysSinceYear()%7)+weekDay;
		return(day);
	}
	
}




























