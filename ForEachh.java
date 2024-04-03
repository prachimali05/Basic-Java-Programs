public class ForEachh {
       public static void main(String[] args)
{
       int[] numbers= {1,2,3,4,5,6,7,8,9,10};

//Using for-each loop to iterate over elements of the array
       for(int number : numbers)
{
if(number%2==1)

       System.out.println(number);
}
}
}