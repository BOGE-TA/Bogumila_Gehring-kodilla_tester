public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int getLastGrade () {
        return grades [size-1];
    }

    public double average() {
        int sum = 0;
        for ( int i =0; i <size ; i++) {
            sum += grades [i];
        }
        return (double) sum / size;
    }
}