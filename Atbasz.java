public class Main
{
	public static void main(String[] args) {
		String text = "YZYROLM";
		char[] tmp = new char[27];
		int counter = 0;
		for(char it = 'Z'; it >= 'A'; it--)
		{
		    tmp[counter] = it;
		    counter++;
		}
		for(int i = 0; i < text.length(); i++)
		{
		    System.out.print(tmp[text.charAt(i) - 65]);
		}
	}
}
