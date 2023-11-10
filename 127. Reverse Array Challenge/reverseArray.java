import java.util.Arrays;

public class reverseArray{
    public static void main(String[] args) {

            int[] array = {32, 5, 2, 88, 19, 20};

            
            int maxIndex = array.length-1;
            int halfLength = array.length/2;

            for (int i = 0; i < halfLength;  i++) {
                int temp = array[i];
                array[i] = array[maxIndex - i];
                array[maxIndex-i] = temp;
            }
        System.out.println("Reversed array = " + Arrays.toString(array));
    } 
}
