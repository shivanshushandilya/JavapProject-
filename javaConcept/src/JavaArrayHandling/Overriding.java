package JavaArrayHandling;



public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone obj = new SmartPhone();
		
		obj.functionality();
		
		
	}
}

	
class Phone {
	   public void functionality() {
	      System.out.println("Call Msg Torch");
	   }
	}

	class SmartPhone extends Phone {
	   public void functionality() {
	      System.out.println("Camra Video BiomatricRecognizar");
	   }
	}
