package sidderick.greeter;

public class Greeter {

    public Object greet(String name){
        return "Hello " + name.substring(0,1).trim().toUpperCase() + name.substring(1).trim();
    }
}
