/*
   @author chengp
 */
public class TwoSumBrute {

    /**
      Brute force approach , complexity is n^2
     */
    public static void main(String[] args) {
        
        int array[] = {2,4,1,3,7,8,9,6,10,5};
        int target = 19 ; 
        
        for (int i = 0 ; i < array.length;i++)
        {
           for (int j = i+1 ; j < array.length;j++)
           {
               if (array[i] == target - array[j] )
               {
                   int index1 = i+1;
                   int index2 = j+1;
                   System.out.println("Find " + array[i] +" at index " + index1);
                   System.out.println("Find " + array[j] +" at index " + index2);
               }
           }        
        }
    }
}
