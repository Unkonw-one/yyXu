//Author:yyXu-284 2020/6/21

public class Fibonacci {
    public static int of(int argv) {
        //
        if (argv == 1 || argv == 2) {
            return 1;
        } else if (argv > 2) {
            int result;
            result = Fibonacci.of(argv - 1) + Fibonacci.of(argv - 2);
            return result;
        } else {
            return -1;
        }
    }

        public static void main(String[] args){
            int i=1;
            while(Fibonacci.of(++i) < 201)
            {
                System.out.println(Fibonacci.of(i));
            }
        }
}
