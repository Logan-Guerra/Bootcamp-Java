public class PhoneTester {
	public static void main(String[] args){
    Galaxy s9 = new Galaxy("S9",99,"Verizon","Ring Ring Ring!");
    IPhone iphone10 = new IPhone("X",100,"AT&T","Zing");

	s9.displayInfo();
	System.out.println(s9.ring());
	System.out.println(s9.unlock());

	iphone10.displayInfo();
	System.out.println(iphone10.ring());
	System.out.println(iphone10.unlock());

	}
}