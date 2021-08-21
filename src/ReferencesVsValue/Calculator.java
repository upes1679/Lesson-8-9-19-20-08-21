package ReferencesVsValue;

public class Calculator {
private static int c;
private static int d;

    public static int calcSum(int a, int b){
        return a+b+d;
    }

    public static int getC() {
        return c;
    }

    public static void setC(int c) {
        Calculator.c = c;
    }
}
