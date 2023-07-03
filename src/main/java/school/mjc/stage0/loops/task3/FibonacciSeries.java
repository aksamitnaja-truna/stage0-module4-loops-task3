package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first = 0, second = 1, third = 1;
        for (int i = 0; i < lastFibonacci; i++){
            System.out.println(first);
            first = second;
            second = third;
            third = second + first;
        }

    }
}
