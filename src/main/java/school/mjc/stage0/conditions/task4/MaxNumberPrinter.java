package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        if (first == second && first == third){
            System.out.println(first);
        } else{
            System.out.println(first >= second ? (first >= third ? first : third) : second);
        }
    }
}
