public class Date
{
	private int _day;
	private int _month;
	private int _year;

//Constructor
	public Date(int day, int month, int year)
	{
		if(this.isValidDayRange()==true)
		{

		}
		_day = day;
		_month = month;
		_year = year;
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

	public int getDate()
	{

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

	private 

	private boolean isValidDayRange()
	{
		int d = this.day;
		int m = this.month;
		boolean r = false;
		switch(m)
		{
			case (1): 
			case(3): 
			case(5): 
			case(7): 
			case(8): 
			case(10): 
			case(12): 
				if((d<1)||(d>31))
				{
					r=true;
				} 
				break;
			case (2): 
				if((d<1)||(d>28))
				{
					r=true;
				} 
				break;
			case (4): 
			case(6): 
			case(9): 
			case(11):
				if((d<1)||(d>30))
				{
					r=true;
				} 
				break;
		}
		return r;
	}

	public String getMonthName()
	{
		String month = "";
		switch(this.month)
		{
			case (1): month = "Enero";
				break;
			case (2): month = "Febrero";
				break;
			case (3): month = "Marzo";
				break;
			case (4): month = "Abril";
				break;
			case (5): month = "Mayo";
				break;
			case (6): month = "Junio";
				break;
			case (7): month = "Julio";
				break;
			case (8): month = "Agosto";
				break;
			case (9): month = "Septiembre";
				break;
			case (10): month = "Octubre";
				break;
			case (11): month = "Noviembre";
				break;
			case (12): month = "Diciembre";
				break;
		}
		return (month);
	}
}
