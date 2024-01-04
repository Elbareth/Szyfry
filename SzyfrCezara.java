public class Main
{
	public static void main(String[] args) {
		String text = "KOIPUXCM";
		for(char it = 'A'; it <= 'Z'; it++)
		{
		    char tmpIt = (char) (it - 'A');
		    System.out.print("Przesunięcie o: "+ (int) tmpIt+" ");
		    for(int i = 0; i<text.length(); i++)
		    {
		        char tmp = (char) (text.charAt(i)+tmpIt);
		        if(tmp > 'Z')
		        {
		            int diff = tmp - 'Z' - 1;
		            tmp = (char) ('A' + diff);
		        }
		        System.out.print(tmp);
		    }
		    System.out.println("");
		}
	}
}
