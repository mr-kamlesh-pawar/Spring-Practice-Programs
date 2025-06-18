import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import in.kp.code.DrinksAndDessert;
import in.kp.code.PizzaBase;
import in.kp.code.Sauces;
import in.kp.code.Toppings;

public class Main {
	public static void main(String[] args) {
		System.out.println("Pizza Store");
		PizzaBase base = new PizzaBase("Hii", 899);
		Sauces sauce = new Sauces("tomato");
	
		 HashMap<String, Integer> hashMap = new HashMap<>();
	          
	      hashMap.put("j", 25);
	      hashMap.put("l", 30);
	      
	

		Toppings top = new Toppings(hashMap);
		
		//TODO: if 
		DrinksAndDessert dd= new DrinksAndDessert("Drink", "XYZ", 110);
		
		float total= 0;
		
		total+= base.getCost();
		
		for (Map.Entry<String, Integer> set :
            hashMap.entrySet()) 
		{           
           total+= set.getValue();
                              
       }
		
		
		
		System.out.println(total);
		
   }

		
	}


