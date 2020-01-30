package JavaL2;

public class CommandLineArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(String s:args) {
			int i = Integer.parseInt(s);
			if(i<0)
				System.out.println("Number is Negative");
			else
				System.out.println("Number is Positive");
		}
	}

}
