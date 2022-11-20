public class Function {

    public static void main(String[] args) {


        System.out.println(func(10,1));

    }

    public static float func(int n, int x){
        // y=sum(1..N)(1/x)
        float y =0;

        for(int i = 1; i <= n; i++){
            y =+i;
        }
        y = y * (1/x);

     return y;

    }
}
