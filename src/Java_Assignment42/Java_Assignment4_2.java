package Java_Assignment42;
/*
 * This class is to master the concepts Types of Inheritance like Is-a Relationship and Has-a Relationship. 
 */

public class Java_Assignment4_2 
{

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Maruti myMaruti = new Maruti();  //Creating a instance of Maruti class
	     myMaruti.setColor("RED"); // Executing the setColor method
	     myMaruti.setMaxSpeed(180);  //Executing the setMaxSpeed method
	     myMaruti.carInfo();  //Executing the carInfo method
	     myMaruti.MarutiStartDemo(); //Executing the MarutiStartDemo method
	     

	}

}
class Car //Base Class
{  
    // Methods implementation and class/Instance members  
    private String color;  
    private int maxSpeed;   
    public void carInfo()
    {  
        System.out.println("Car Color= "+color + " \nMax Speed= " + maxSpeed);  
    }  
    public void setColor(String color) 
    {  
        this.color = color;  
    }  
    public void setMaxSpeed(int maxSpeed) 
    {  
        this.maxSpeed = maxSpeed;  
    }  
}  
/*Car class has a couple of instance variable and few methods. Maruti is
 *  a specific type of Car which extends Car class means Maruti IS-A Car.
 */
class Maruti extends Car
{  
    //Maruti extends Car and thus inherits all methods from Car (except final and static)  
    //Maruti can also define all its specific functionality  
    public void MarutiStartDemo()
    {  
        Engine MarutiEngine = new Engine();  //Createing object of Engine class HAS_A relationship
        MarutiEngine.start();  //Maruti has Engine Has_A relation ship
    }  
 }  
 class Engine //Class for relationship
 {  
    public void start()
    {  
        System.out.println("Engine Started.");  
    }  
    public void stop()
    {  
        System.out.println("Engine Stopped.");  
    }  
}  