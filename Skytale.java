public class Main
{
	public static void main(String[] args) {
		String text = "zoyrdkltsoe";
		int amountOfJump = 1;
		for(int k = 0; k < text.length() / 2; k++){
		    int size = 0;
		    System.out.print("Jump: "+amountOfJump+" ");
		    for(int l = 0; l < text.length(); l++)
    		{
    		    for(int i = l; i < text.length(); i++)
    		    {
    		        System.out.print(text.charAt(i));
    		        i+=amountOfJump;
    		        size++;
    		    }
    		    if(size >= text.length()) break;
    		}
    		amountOfJump++;
    		System.out.println("");
		}
	}
}
