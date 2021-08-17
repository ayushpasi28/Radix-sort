package Practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main { 
	public static void main(String[] args)
	{ 
		System.out.println("Radix sort in Java"); 
	int[] input = { 52,25,81,31};
	System.out.println("An Integer array before sorting"); 
	System.out.println(Arrays.toString(input));
	radixSort(input); 
	System.out.println("Sorting an int array using radix sort algorithm"); 
	System.out.println(Arrays.toString(input));
	}
	public static void radixSort(int[] input) { 
		final int RADIX = 10;
		List<Integer>[] bucket = new ArrayList[RADIX];
		
		for (int i = 0; i < bucket.length; i++)
		{
			bucket[i] = new ArrayList<Integer>(); 
		}
		boolean maxLength = false; 
		int tmp = -1, placement = 1;

		 while (!maxLength) {
		      maxLength = true;
		      
		      for (Integer i : input) 
		      { 
		    	  tmp = i / placement;
		    	  bucket[tmp % RADIX].add(i);
		    	  if (maxLength && tmp > 0)
		    	  {
		    		  maxLength = false;
		    	  }
		    	  }
		      int a = 0; 
		      for (int b = 0; b < RADIX; b++) 
		      { 
		    	  for (Integer i : bucket[b]) 
		        { 
		    	  input[a++] = i; 
		        } 
		      bucket[b].clear();
		      }
		      placement *= RADIX;
		      

		     }

		    
	}

	
}

