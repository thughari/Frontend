package oopsdemo1;

public class LampTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var led=new Lamp();
		var halogen=new Lamp();
		
		led.turnOn();
		led.turnOff();
		
		halogen.turnOn();
		halogen.turnOff();

		
	}

}

class Lamp {
	// stores the value for light
    // true if light is on
    // false if light is off
    boolean isOn;
   
    //method to turn On the light
    void turnOn()
    {
        isOn=true;
        System.out.println("Light On? "+isOn);
    }
   
  //method to turn Off the light
    void turnOff()
    {
        isOn=false;
        System.out.println("Light On? "+isOn);
    }
}
