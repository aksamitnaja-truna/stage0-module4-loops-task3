package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int largest = Math.max(first,second), small = Math.min(first, second), result = 1;
        if (small == 0) {
            System.out.println(largest);
            return;
        }
        for (int i = 1; i <= small; i++){
            if (small % i == 0 && largest % i == 0)
                result = i;
        }
        System.out.println(result);
    }
}
