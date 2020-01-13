package JavaCourseworkUP847948;

import java.util.*;

public class Pizza {
    //Member variables
    private String size;
    private String crust;
    private String sauce;
    private String topping1;
    private String topping2;
    private List<String> toppings;
    private List<Double> toppingCosts;
    
    public Pizza(
                    String size, 
                    String crust,
                    String sauce,
                    String topping1,
                    String topping2
                )
    {
            this.size = size;
            this.crust = crust;
            this.sauce = sauce;
            this.topping1 = topping1;
            this.topping2 = topping2;
            this.toppings = Arrays.asList(
                                        "none",
                                        "olives", 
                                        "extra_cheese", 
                                        "chilli", 
                                        "pepperoni", 
                                        "mushroom",
                                        "rocket",
                                        "jalapenos",
                                        "onion",
                                        "anchovy"
                                        );
            
            this.toppingCosts = Arrays.asList(
                                        0.00,
                                        0.08, 
                                        0.02, 
                                        0.06, 
                                        0.10, 
                                        0.03,
                                        0.05,
                                        0.20,
                                        0.07,
                                        0.09
                                        );
    }
    
    //get 
    public String getSize(){ return this.size;}
    public String getCrust(){ return this.crust;}
    public String getSauce() { return this.sauce;}
    public String getTopping1() { return this.topping1;}
    public String getTopping2() { return this.topping2;}
    
    //set 
    public void setSize(String size){this.size = size;}
    public void setCrust(String crust){this.crust = crust;}
    public void setSauce(String sauce) {this.sauce = sauce;}
    public void setTopping1(String topping1) {this.topping1 = topping1;}
    public void setTopping2(String topping2) {this.topping2 = topping2;}
    
    public double getCost(){
        double price;
        price = 0;
        
        //Size costs
        if (this.size.equalsIgnoreCase("small")) {
            price += 9.45;
        }else if(this.size.equalsIgnoreCase("medium")) {
            price += 11.87;
        }else {
            price += 15.90;
        }
        
        //crust costs
        if (this.crust.equalsIgnoreCase("thin")) {
            price += 1.08;
        }else if(this.crust.equalsIgnoreCase("deep")) {
            price += 1.10;
        }else {
            price += 2.14;
        }
        
        //sauce costs
        if (this.sauce.equalsIgnoreCase("pesto")) {
            price += 0.5;
        }
        
        int count = 0;
        for(String t : toppings){    
            if (t.equalsIgnoreCase(this.topping1)){
                price += toppingCosts.get(count) * 5;
                if (this.topping1.equals(this.topping2)){
                    price += toppingCosts.get(count) * 4;
                }
            }else if(t.equalsIgnoreCase(this.topping2)) {
                price += toppingCosts.get(count) * 4;
            }
            count += 1;
        }
        return Math.round(price * 100d) / 100d;//round to 2 decimal places
    }
    
    public String getInvoice(){
        String price;
        double base; 
        price = "TOTAL COST: £"+getCost()+"\n";
        base = 0;
        
        //Size costs
        if (this.size.equalsIgnoreCase("small")) {
            price += "Small Size: £9.45";
            base += 9.45;
        }else if(this.size.equalsIgnoreCase("medium")) {
            price += "Medium Size: £11.87";
            base += 11.87;
        }else {
            price += "Large Size: £15.90";
            base += 15.9;
        }
        
        //crust costs
        if (this.crust.equalsIgnoreCase("thin")) {
            price += "\nThin Crust: £1.08";
            base += 1.08;
        }else if(this.crust.equalsIgnoreCase("deep")) {
            price += "\nDeep Crust: £1.10";
            base += 1.1;
        }else {
            price += "\nStuffed Crust: £2.14";
            base += 2.14;
        }
        
        price += "\nBASE COST: £" + String.valueOf(Math.round(base * 100d) / 100d); 
        //Topping costs
        int count = 0;
        for(String t : toppings){    
            if (t.equalsIgnoreCase(this.topping1)){
                price += "\n"+this.topping1 +" topping: £"+String.valueOf(toppingCosts.get(count))+" * 5 = £"+String.valueOf(toppingCosts.get(count) * 5);
                if (this.topping1.equals(this.topping2)){
                    price += "\n"+this.topping2 +" topping: £"+String.valueOf(toppingCosts.get(count))+" * 4 = £"+String.valueOf(toppingCosts.get(count) * 4);
                }
            }else if(t.equalsIgnoreCase(this.topping2)) {
                price += "\n"+this.topping2 +" topping: £"+String.valueOf(toppingCosts.get(count))+" * 4 = £"+String.valueOf(toppingCosts.get(count) * 4);
            }
            count += 1;
        }
        
        //sauce costs
        if (this.sauce.equalsIgnoreCase("pesto")) {
            price += "\nPesto Sauce: £0.50";
        }else {
            price += "\nTomato Sauce: £0";
        }
        return price;
    }
}
