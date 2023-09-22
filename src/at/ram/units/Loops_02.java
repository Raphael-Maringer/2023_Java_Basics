package at.ram.units;

public class Loops_02 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 1000 ; i+= 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
