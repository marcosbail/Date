package es.unileon.prg.date;

/*Marcos Martin Bail Ingold*/

public class Date
{
	private int _day;
	private int _month;
	private int _year;

//Constructor Vacio
	//comentario
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
	//Chequeamos si los valores q se pasan son enteros
	/*if(day != (int) day)
	{
		buff.append("\n El valor ingresado en dia no es Entero ");
	}
		else if(month != (int) month)
		{
			buff.append("\n El valor ingresado en mes no es Entero ");
		}
			else if(year != (int) year)
			{
				buff.append("\n El valor ingresado en año no es Entero ");
			}*/
	//Chequeamos dia 
	int r=0;
	if((day<1))
	{
		buff.append("\n El dia ingresado es negativo");
	}
	else if(day>28){
		switch(month)
		{
			case(1): 
			case(3): 
			case(5): 
			case(7): 
			case(8): 
			case(10): 
			case(12): r=31;
				break;
			case(2): r=28;
				break;
			case(4): 
			case(6): 
			case(9): 
			case(11): r=30;
				break;
		}
		if((day>r)&&(r==28))
		{
			buff.append("El dia ingresado es mayor a 28, Febrero tiene 28 dias\n");
		}
			else if((day>r)&&(r==30))
			{
				buff.append("El dia ingresado es mayor a 30, El mes tiene 30 dias\n");
			}
				else if((day>r)&&(r==31))
				{
					buff.append("El dia ingresado es mayor a 31, El mes tiene 31 dias\n");
				}
	}
	//Chequeamos mes
	if((month>12)||(month<1))
	{
		buff.append("\n El mes esta fuera de rango (mas de 12 o menos de 1)");
	}
	//Chequeamos año
	if(year<0)
	{
		buff.append("\n El año es negativo (fuera de rango)");
	}
	//throw
	if(buff.length()!=0)
	{
		throw new DateException(buff.toString());
	}
		else
		{//Si pasamos todo:
			_day = day;
			_month = month;
			_year = year;
		}
	}
//Fin Constructor
	
	public void setDay(int day) throws DateException
	{
		StringBuffer buff = new StringBuffer();
		if((day>31)||(day<1))
		{
			buff.append("\n El dia esta fuera de rango");
		}
			if(buff.length()!=0)
			{
				throw new DateException(buff.toString());
			}
				else{
					this._day=day;
				}
	}
		
	

	

	public void setMonth(int month) throws DateException
	{

		StringBuffer buff = new StringBuffer();
		if((month>12)||(month<1))
		{
			buff.append("\n El mes esta fuera de rango");
		}
			if(buff.length()!=0)
			{
				throw new DateException(buff.toString());
			}
				else{
					this._month=month;
				}
	}

	public void setYear(int year) throws DateException
	{
		StringBuffer buff = new StringBuffer();
		if((year>3000)||(year<1))
		{
			buff.append("\n El año esta fuera de rango");
		}
			if(buff.length()!=0)
			{
				throw new DateException(buff.toString());
			}
				else
				{
					this._year=year;
				}
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
	//sameYear() sameMonth() sameDay() sameDate()

	public boolean sameYear(Date other)
	{
		boolean b=false;
		if(this._year==other.getYear())
		{
			b=true;
		}
	
	return b;
	}

	public boolean sameMonth(Date other)
	{
		boolean b=false;
		if(this._month==other.getMonth())
		{
			b=true;
		}
	return b;
	}

	public boolean sameDate(Date other)
	{
		boolean b=false;
		if(this._year==other.getYear())
		{
			if(this._month==other.getMonth())
			{
				if(this._day==other.getDay())
				{
					b=true;
				}
			}
		}
		return b;
	}

	public boolean sameDay(Date other)
	{
		boolean b=false;
		if(this._day==other.getDay())
		{
			b=true;
		}
	
	return b;
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
		}catch(DateException exp){
			System.err.print(exp.getMessage());
		}

		return left.toString();
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

			for(int i=this._day+1; i<=aux.getMonthDays(); i++)
			{
				left.append(i+" ");
			}

		return left.toString();
	}


//For a date, print all dates until the end of  the month. 

	public String getDatesLeftInMonth()
	{
		Date aux = new Date(this);
		StringBuffer left = new StringBuffer();
		int j=0;
		try{
			for(int i=this._day;i<=getMonthDays();i++)
			{
			    setDay(aux.getDay()+j++);
			    left.append(" "+this._day+"/"+this._month+"/"+this._year);
			}
		}catch(DateException exp){
			System.err.print(exp.getMessage());
		}
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
		try{
			for(int i=1;i<=12;i++)
			{
				fecha2.setMonth(i);
				if(dias==fecha2.getMonthDays())
				{
					    equal.append(" "+fecha2.getMonthName());
				}
			}
		}catch(DateException exp){
			System.err.print(exp.getMessage());
		}
		return equal.toString();
	}

	/*For a date, count the number of  days since the first day of  the year (do not consider leap years) */
	public int getDaysSinceYear()
	{
		int dias = 0;

		Date fecha1 = new Date(this);
		Date fecha2 = new Date(this);
		try{
			for(int i = 1; i < fecha2.getMonth(); i++)
			{

			    fecha1.setMonth(i);
			    dias += fecha1.getMonthDays();
			}
		}catch(DateException exp){
			System.err.print(exp.getMessage());
		}

		return dias + this.getDay();
	}

	//Looping statements - Exercises 

/*Build a method that counts the number of  attempts needed to generate a random date equals to a given date (only inside the same year) 
Do it using a do-while statement */
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
	public int getWeekDay(int weekDay) throws DateException
	{
		int day=(getDaysSinceYear()%7)+weekDay;
		return(day);
	}
	
}
/*Marcos Martin Bail Ingold*/

