/**
 * Created by Daniel J. Gallegos on 6/7/2017.
 */
public class GooInterQuesOne {

    /*
     * Given an array of numbers, replace each number with the product of all the numbers in the array except the
     * the number itself *without* using division
     */
    //Method that finds the product of all numbers except for that number and replace it on the array
    static int[] prodOfAll(int[] a){
        int[] tempArray = new int[a.length];
        int temp = 0;
        for(int i = 0; i < a.length; i++){//traverses the array as place holder of the number
            temp =1;
            for(int j = 0; j < a.length; j++){// traverses the array multiplying values that are not equal to a[i]
                System.out.println("checking a[i] and a[j] " + a[i] + "    "+ a[j]);

                if(a[i] == a[j]){

                }


                else{
                    temp = temp * a[j];
                    System.out.println("checking temp value " + temp);
                }
            }
            tempArray[i] = temp;
            System.out.println("checking value in array " + tempArray[i]);
        }
        return tempArray;
    }
    //prints the Array values
    static void printArray(int[] m){
        for(int i = 0 ; i < m.length; i++) {
            System.out.println(m[i]);
        }
    }
    // Driver
    public static void main(String[] args){
        int[] myArray = {1,2,3,4};
        myArray = prodOfAll(myArray);
        System.out.println(" ");
        System.out.println(" ");
        printArray(myArray);

    }
}
