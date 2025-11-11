package objects;

public class House {
	
	String address;
	double area;
	char type;
	
	
	
	
	
	
	void show() {
		switch(type) {
		case 'f','F':
			System.out.println("Flat at c/ " + this.address +", Area: " + this.area  +  "m2");
			break;
		case 'd','D':
			System.out.println("house at c/ " + this.address +", Area: " + this.area + "m2");
			break;
		default:
			System.out.println("not a valid type of house....");
		}
	}
	
	double giveMeTax(){
		double tax = 0;
		if(this.area <60) {
			tax = 0;
		}
		if(this.area >= 60 && this.area <= 80) {
			tax = this.area * 4.5;
		}
		if(this.area > 80) {
			tax = this.area * 5.5;
		}
		
		return tax;
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		House h1 = new House();
		h1.address = " calle madrid ,47";
		h1.area = 300;
		h1.type = 'f';
		
		h1.show();
		System.out.println(h1.giveMeTax() + " €  in taxes");
		

	}

}
