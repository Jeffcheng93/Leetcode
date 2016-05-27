package twosumadvanced;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author chengp
 */
public class TwoSumAdvanced {

    public static int[] twoSum(int[] array, int target)
    {
       // 空map
       Map<Integer, Integer> map = new HashMap<>(); 
       for (int i=0; i< array.length; i++)
       {
           // 前面的值存进map, 后面的值匹配前面的值
           int x = array[i];  // test the first value
           if (map.containsKey(target-x))
           {  
              System.out.println(map.get(target-x)+1);
              System.out.println(i+1);
              
              return new int[] {map.get(target-x)+1, i+1};  // {index, index2};
              
              // assign the value to the array, and return the array to main method;
              // sample: return {a,b,c,d};
           }
           map.put(x, i);    // 通过值搜索index
       }
       throw new IllegalArgumentException("No two sum solution");
    }
    
    /*
        
      x= 2  -- map.contain(1)   
    
    
    */
    
    public static void main(String[] args) {
        int[] array = {100,400,300,500,700,800,900,600,1000,1100};
        int target = 1300 ; 
        int[] array2 = twoSum(array, target);
      //  int replacement = target -array2[1];
      //int index2 = Arrays.binarySearch(array, replacement)+1;
        System.out.println(array2[0]+ " "+array2[1]);
      //System.out.println(index2  + " "+ replacement+"\n"+"**********\n");
        
        
    }
    
}
