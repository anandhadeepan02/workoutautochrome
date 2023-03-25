package oopsu;

public class Op {
	String Mobilename ="Realme";
	public String mobilename() {
		return Mobilename;
		
	}
public float mobileprice() {
	float price=(float)29999.99;
	return price;
}
boolean usagecondition=true;
public boolean mobilecondition() {
	return usagecondition;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Op a=new Op();
		System.out.println(a.mobilename());
		System.out.println(a.mobileprice());
		System.out.println(a.mobilecondition());

	}

}

	

