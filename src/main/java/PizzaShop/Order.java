package PizzaShop;

public class Order {
	public static void main(String[] args)
	{
		Pizza pizza = new Pizza();						
		pizza.setPizzaBase(new PizzaBase());
		pizza.addTopping(new PizzaTopping("Tomato Sauce", 150));
		pizza.total();
		
	}
}
