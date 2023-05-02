package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int a = 0;
        int fact = 0;
        while (a<=printToInclusive){
            int b = a;
            while (b>=0){
                fact = fact*(b-1);
                b--;
            }System.out.println(fact);
            a++;
        }
    }
}
