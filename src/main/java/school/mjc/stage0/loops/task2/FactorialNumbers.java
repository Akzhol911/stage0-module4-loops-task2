package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int a = 2;
        int fact = a;
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
