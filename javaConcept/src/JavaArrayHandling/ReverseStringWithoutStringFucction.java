package JavaArrayHandling;

public class ReverseStringWithoutStringFucction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hello world";
		String revstring="";
		 
		for(int i=str.length()-1;i>=0;--i){
		revstring +=str.charAt(i);
		}
		 
		System.out.println(revstring);

	}

}
