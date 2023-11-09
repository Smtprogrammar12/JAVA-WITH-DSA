package Array_new;

public class linear_search {

    public static  String LS(String menu[] , String key){
        for (int i =0; i< menu.length; i++){
            if (menu[i] == key){
                return "i";
            }
        }
        return "-1";
    }
    public static void main(String[] args) {

        String menu[] = {"Dosa" , "Chola kulcha" , "Samosa" , "Aloo paratha" };
        String key = "Samosa";

        String index = LS(menu , key);
        if( index == "-1"){
            System.out.println("you are search wrong item");
        }else {
            System.out.println("your item is index number:- " + index);
        }
    }

}
