public class Function {

    private static int n;

    private static int x;


    public Function(int n, int x) {
        this.n = n;
        this.x = x;
    }

    public static float func(){
        // y=sum(1..N)(1/x)
        float y =0;

        for(int i = 1; i <= n; i++){
            y =+i;
        }
        y = y * (1/x);

     return y;
    }

    public static int getN() {
        return n;
    }

    public static void setN(int n) {
        Function.n = n;
    }

    public static int getX() {
        return x;
    }

    public static void setX(int x) {
        Function.x = x;
    }
}
