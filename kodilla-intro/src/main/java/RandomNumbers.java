import java.util.Random;

public class RandomNumbers {
    private int minValue;
    private int maxValue;

    public int getCountofRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 5000;
        while (sum < max) {
            int temp = random.nextInt(31);
            if (temp > maxValue) {
                maxValue=temp;
            }
            if (temp > minValue) {
                minValue=temp;
            }
            sum = sum + temp;
            result++;
        }
        return result;
    }


    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }
}
