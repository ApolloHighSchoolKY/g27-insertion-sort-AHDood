import java.util.ArrayList;

public class ALInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};
    	ArrayList<Integer> sorted = new ArrayList<Integer>();
    	boolean inserted=false;

		//Add the first number to the array list
		
		//Loop once for all of the remaining numbers in the unsorted list
		for(int i=1; i<myNumbers.length;i++)
		{
			int pos=myNumbers[i];
			int x=i-1;
			while(x>=0 && pos<myNumbers[x])
			{
				
				myNumbers[x+1]=myNumbers[x];
				x=x-1;
			}
			myNumbers[x+1]=pos;
			sorted= ArrayList.toString(myNumbers);
			if(myNumbers[i]>myNumbers[i+1])
			{
			//Check with each of the numbers in the sorted list

				//If this number is less than one in the sorted list,
				//insert it there
			}
			//If it was not inserted, stick it on the end.


		//End Loop for unsorted list
		}
		System.out.println(sorted);

		//Move the data back to the array

		//Print the contents of the array

    }


}
