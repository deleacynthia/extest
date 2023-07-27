public class ArrayUtils {
    public static int findHighest(int[] numbers){
        int max = 0;
        for (int num : numbers){
            if(num > max){
                max = num;
            }
        }
        return numbers[0];
    }
}
