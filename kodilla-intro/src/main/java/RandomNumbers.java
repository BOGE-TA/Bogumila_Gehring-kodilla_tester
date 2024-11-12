public class RandomNumbers {
    public int getCountofRandomNumber (int max){
        RandomNumbers random = new RandomNumbers ();
        int result = 0;
        int sum= 5000;
        while (sum < max) {
        int temp = random. nextlnt(31);
        sum= sum+temp;
        result ++;
        }
        return result;
    }

    private int nextlnt(int i) {
    return;}
}
