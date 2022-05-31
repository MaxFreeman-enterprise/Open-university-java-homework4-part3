/**
 * Write a description of class EqualSplit here howmework part 3:
 * 
 * the equalSplit method:
 * 
 * check whether a given array's elements can be splitted equally into two groups 
 * while each group contain a half array's elements and the elements's sum in each group equal.
 * @param arr - array to be checked
 * @return true - iff it is possible to split the array equally  
 *
 * @author Max Freeman
 * @version 15.01.22
 */
public class EqualSplit
{
    
    public static boolean equalSplit (int [] arr){

        if (arr.length % 2 != 0){
            return false;
        }
        return equalSplit(0,arr,0,0,0,0);
    }

    private static boolean equalSplit(int index, int[] arr, int sum1, int sum2, int size1, int size2){
        if (index == arr.length){// recursion exit rule
            return sum1 == sum2 && size1 == size2;// equals sums and groups size
        }
        return equalSplit(index + 1, arr, sum1 + arr[index], sum2, size1, ++size2) ||
        equalSplit(index +1, arr,sum1,sum2 + arr[index], ++size1, --size2);
    }
}
