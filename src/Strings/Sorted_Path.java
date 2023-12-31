package Strings;

public class Sorted_Path {

    public  static  float sortedPath(String str){
        int x =0 ;
        int y =0;
        for (int i =0 ; i< str.length(); i++){
            int dir = str.charAt(i);
            if( dir == 'N'){
                y++;
            } else if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            }
            else {
                y--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
//        String str = "NSW";

        System.out.println("sorted path of the given String are : " + sortedPath(str));
    }
}
