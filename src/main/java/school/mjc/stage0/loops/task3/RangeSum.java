package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
//        int total = 0;
//        for (int i = firstBoarder; i <= secondBoarder; i++) {
//            total += i;
//
//        }
//        System.out.println(total);
        System.out.println((secondBoarder * (secondBoarder + 1) - (firstBoarder - 1) * firstBoarder) / 2);
    }
}
