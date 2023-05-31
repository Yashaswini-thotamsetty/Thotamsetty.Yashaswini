/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class array1
{
	public static void main(String[] args) {
	    int a []={6,5,9,8,0,2};
	    int Max=a[0];
	    for (int i=0;i<a.length;i++)
	    {
	        if (Max<a[i]){
	            Max=a[i];
	        }
	    }
		System.out.println(Max);
	}
}
