package JavaCourseworkUP847948;

import java.util.*;

public class Order {
    
    private ArrayList<Pizza> Pizzas;
    
    public Order(){
        this.Pizzas = new ArrayList<Pizza>();
    }
    
    public void add(
                    String size, 
                    String crust,
                    String sauce,
                    String topping1,
                    String topping2
                )
    {
            Pizza newPizza = new Pizza(
                                    size, 
                                    crust,
                                    sauce,
                                    topping1,
                                    topping2
                                    );
            Pizzas.add(newPizza);
    }
    
    public String getOrder(){
        String order;
        order = "";
        for(Pizza p : Pizzas){
            order += p.getInvoice()+"\n\n";
        }
        
        return order;
    }
    
    public double getTotal(){
        double totalCost;
        totalCost = 0;
        for(Pizza p : Pizzas){
            totalCost += p.getCost();
        }
        
        return Math.round(totalCost * 100d) / 100d;//round to 2 decimal places
    }
    
    public int numOfPizzas(){ return Pizzas.size();}
      
    public void deletePizza(int positionInOrder){
        Pizzas.remove(positionInOrder);
    }
    
    public Pizza getPizza(int pos){
        return Pizzas.get(pos);
    }
    
    public void updatePizza(
                    String size, 
                    String crust,
                    String sauce,
                    String topping1,
                    String topping2,
                    int positionInOrder
                )
    {
        Pizza pizza = new Pizza(
                        size, 
                        crust,
                        sauce,
                        topping1,
                        topping2
                        );
        Pizzas.set(positionInOrder, pizza);
    }
}
