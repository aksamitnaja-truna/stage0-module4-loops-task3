package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int total = 0, len = String.valueOf(t).length();
        for (int i = 0; i < len; i ++){
            total += Math.abs(t % 10);
            t = t / 10;
        }
        System.out.println(total);
    }
}
