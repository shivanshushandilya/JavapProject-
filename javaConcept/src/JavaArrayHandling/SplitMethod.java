package JavaArrayHandling;

public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] items = "A|B|C".split("|");
		   System.out.println("Number of items is: " + items.length);
		   
		   String[] items2 = "A.B.C".split(".");
		   System.out.println("Number of items is: " + items2.length);
		   
		   String string = "004-034556-7854";
		   String[] parts = string.split("-");
		   String part1 = parts[0]; // 004
		   String part2 = parts[2]; // 034556
		   System.out.println(part2);
		   System.out.print("\"Hello\""); 


	}

}
