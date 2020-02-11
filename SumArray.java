/// WAP in java to sum values of an array

package Exam;

public class SumArray {
    public static void main(String[] args) {
        int ar[] = {1,2,3,4,5};
        int sum =0;

        for(int i=0;i<ar.length;i++){
           sum = sum + ar[i];
        }

        System.out.println("Sum of array = "+sum);
    }
}