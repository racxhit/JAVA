/*
Implement Autoboxing and unboxing in java and analyze the result.
*/

class P3 
{
    public static void main(String args[]) 
    {
        // Autoboxing
        int i = 10;  
        Integer K = i;  
        System.out.println("Autoboxing (primitive int to Integer), K: " + K);
        
        // Unboxing
        Integer J = Integer.valueOf(20);
        int j = J; 
        System.out.println("Unboxing (Integer to primitive int), j: " + j);
    }
}
