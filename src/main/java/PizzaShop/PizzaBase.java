package PizzaShop;

import java.util.ArrayList;

	public class PizzaBase 
	{
		private String Name;				
		private double Cost;
		
		public PizzaBase()
		{
			setName(Name);
			setCost(Cost);			
		}
		
		public String getName()				
		{
			return Name;
		}
		
		public void setName(String Name)		
		{
			this.Name = Name;			
		}
		
		public double getCost()				
		{
			return Cost;				
		}
		
		public void setCost(double Cost)		
		{
			this.Cost = Cost;
		}
	}