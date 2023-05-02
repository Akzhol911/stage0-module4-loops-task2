package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int a = 0;
        while (a<= printToInclusive){
            if (a<=3){
            }else if (a%2==0 || a%3==0) {
                System.out.println(a);
            }
        }
    }
}
