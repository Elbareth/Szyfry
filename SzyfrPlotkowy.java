/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		String text = "ZOAEADLOALTPDIDSSAAAEYCPSNOINZ";
		for(int k = 2; k < text.length(); k++)
		{
		    System.out.print("Wielkość drabinki: "+k+" ");
		    char [][] tmp = new char[k][text.length()/k + text.length()%k + 1];
		    int counterK = 0;
		    int counterI = 0;
		    for(int i = 0; i < text.length(); i++)
		    {
		        System.out.println("counter K "+counterK+" counterI "+counterI +" i "+i);
		        //System.out.println("i = "+i+" value = "+text.charAt(i));
		        tmp[counterK][counterI] = text.charAt(i);
		        if(counterK == 0)
		        {
		           counterK++;
		        }
		        else if(k % counterK == 0){
		           counterI++;
		           counterK = 0;
		        } 
		        else
		        {
		            counterK++;
		        }
		    }
		    for(int r = 0; r < k; r++)
		    {
		        for(int p = 0; p < text.length()/k + text.length()%k + 1; p++)
		        {
		            System.out.print(tmp[r][p]);
		        }
		    }
		    System.out.println("");
		    
		}
	}
}
