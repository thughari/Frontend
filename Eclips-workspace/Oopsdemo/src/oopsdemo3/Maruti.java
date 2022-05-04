package oopsdemo3;

public class Maruti implements NewCarModel {

	Car car=new Car("Maruti",true,"Brezza",5.1f,"White","Petrol","200bhp",6);
	   
    public void CarFeatures()
    {
        System.out.println("Brand Name : "+ car.getCompany());
        System.out.println("Color of Car : "+ car.getColor());
        System.out.println("Power : "+ car.getPower());
        System.out.println("Fuel type : "+ car.getFuelType());
        System.out.println("No of Gears: " + car.getNumberOfGear());
    }
    
	@Override
	public void isAutomatic() {
		// TODO Auto-generated method stub
		System.out.println("Is this Car automatic : " + car.isAutomatic());
		
	}

	@Override
	public void modelName() {
		// TODO Auto-generated method stub
		System.out.println("Model name : " + car.getModelName());
		
	}

	@Override
	public void highTechAC() {
		// TODO Auto-generated method stub
		System.out.println("Ac Spec: " + car.getHighTechAC());
		
	}

}
