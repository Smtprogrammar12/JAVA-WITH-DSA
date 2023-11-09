package oops;

public class staticMethod {

        class calculate{

            static int cube(int x){
                return x*x*x;
            }
        }
        public static void main(String[] args) {
            int results = calculate.cube(5);
            System.out.println(results);
        }
    }

