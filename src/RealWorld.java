
public class RealWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car hondaCivic2019 = new Car("Honda","CIVIC","2019");
		Car hondaCRV2019 = new Car("Honda","CRV","2019");
		Car ToyotaCamry2019 = new Car("Toyota","Camry","2019");
		Car ToyotaHRV2019 = new Car("Toyota","HRV","2019");
		Car teslaModel32019 = new Car("Tesla","Model 3","2019");
		Car teslaModelX2019 = new Car("Tesla","Model X","2019");
		Car bmwX32019 = new Car("BMW","X 3","2019");
		
		User shadli = new User("Shadli");
		User sajedul = new User("Sajedul");
		User shadmila = new User("Shadmila");
		
		shadmila.setPhone("01717701999");
		shadmila.addCar(bmwX32019);
		
		System.out.println(shadmila);
		
		shadmila.addCar(hondaCivic2019);
		
		System.out.println(shadmila);
		
		shadmila.addCar(teslaModel32019);
		
		System.out.println(shadmila);

		Car hhh=new Car();
		hhh.setName("hhh");
		hhh.setModel("HPN");
		hhh.setYear("2323");

		hhh.CreateCar("h","hhh",999);


		System.out.println(hhh.toString());



		shadmila.setPhone("641-451-7575");
		shadmila.removeCar(hondaCivic2019);
		
		System.out.println(shadmila);
	}

}
