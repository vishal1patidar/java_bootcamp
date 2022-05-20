class longest_consicutive_one
{
    private static int maxConsecutiveOnes(int x)
    {
        int count = 0;
        System.out.println("your ones are in a binary no "); 
        while (x!=0)
        {
            x = (x & (x << 1)); 
            count++;
        }
      
        return count;
    }
 
    public static void main(String strings[])
    {
        System.out.println(maxConsecutiveOnes(222));  //(11011110)₂
    }
}