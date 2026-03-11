import java.util.Arrays;
public class AInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};
        //System.out.println(""+ Arrays.toString(myNumbers));
        int i = myNumbers.length;
        for(int x=1; x<i ;x++)
        {
            int newNumbers = myNumbers[x];
            int w = x-1;

            while(w>=0 && newNumbers<myNumbers[w])
            {
                myNumbers[w+1] = myNumbers[w];
                w--;
            }
            myNumbers[w+1]=newNumbers;   
            //for(int y=1; y<myNumbers.length; y++)
            //{
                //if(myNumbers[y]< myNumbers[y-1])
                //{
                
                    //for(int z=y; x>=1; z--) 
                    //{
                    
                  // int z=y;
                //int copy=z;
                    //myNumbers[y]=myNumbers[y+1];
                    //myNumbers[y]= copy;  
                //} 
                
            }
            System.out.println("" + Arrays.toString(myNumbers));
        } 
           
    }
    
        
//}
//}
