package PizzaShop;

import java.util.ArrayList;

public class Pizza
{																				
	private ArrayList<PizzaTopping> tops = new ArrayList<PizzaTopping>();	
	private PizzaBase base;								
	private int topping;								
								
	
	public Pizza()									
	{										
		this.setPizzaBase(base);						
		this.tops = new ArrayList<PizzaTopping>();			
	}

	public void setPizzaBase(PizzaBase base)					
	{
		this.base = base;							
	}

	public void addTopping(PizzaTopping topping)				
	{
		tops.add(topping);
	}
	
	public double pizzaCost()							
	{
		double cost = base.getCost();	
		System.out.println("Base cost is"+cost);
		for(PizzaTopping topping : tops)					
		{
			cost += topping.getCost();					
		}
		return cost;								
	}
	
	public void total()
	{
		System.out.printf(base.getName(), base.getCost());
		System.out.println("Base cost is "+ base.getCost());
		
		System.out.print(pizzaCost());
	}
	
	
    public PizzaBase getBase()							
    {
    	return base;
    }	
	public void setTopping(int topping)					
    {	
    	this.topping = topping;      	
    }
    
    public int getTopping()							
    {
    	return topping;
    }

}