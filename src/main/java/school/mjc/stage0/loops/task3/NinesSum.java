package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int total = 0, increment = 9;
        for (int i = 0; i < lengthOfLastNumber; i++){
            total += increment;
            increment = increment * 10 + 9;
        }
        System.out.println(total);
    }
}
