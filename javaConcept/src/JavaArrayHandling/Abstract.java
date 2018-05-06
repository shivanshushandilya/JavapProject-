package JavaArrayHandling;

public class  Abstract {

	public static void main(String[] args) {
		
		FuturePhone obj= new Htc();
		obj.patrnlock();

	}
}
	
abstract class FuturePhone{ 
abstract void patrnlock();	
abstract void biomatric(); 
abstract void facerecognizar();

}  
//In real scenario, implementation is provided by others i.e. unknown by end user  
abstract class Apple extends FuturePhone{  
void biomatric(){
	System.out.println("Take Figer print");
	}  
}  
class Htc extends Apple{  
void facerecognizar(){
	System.out.println("Take Face shape");
	}  
void patrnlock(){
	System.out.println("peternLock");
}
}  