package com.yash.tech;
public class EqualityOfTwoArrays
{
    public static void main(String[] args)
    {   
        int[] arrayOne = {2, 5, 1, 7, 4};
          
        int[] arrayTwo = {2, 5, 1, 7, 4};
          
        boolean equalOrNot = true;
          
        if(arrayOne.length == arrayTwo.length)
        {
            for (int i = 0; i < arrayOne.length; i++)
            {
                if(arrayOne[i] != arrayTwo[i])
                {
                    equalOrNot = false;
                }
            }
        }
        else
        {
            equalOrNot = false;
        }
          
        if (equalOrNot)
        {
            System.out.println("Two Arrays Are Equal");
        }
        else
        {
            System.out.println("Two Arrays Are Not equal");
        }
    }
}