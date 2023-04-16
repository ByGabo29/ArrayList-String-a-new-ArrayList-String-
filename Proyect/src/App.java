import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> Familia = new ArrayList<String>();
        Familia.add("Gabriel");
        Familia.add("Diego");
        Familia.add("Yris");
        Familia.add("Johamms");
        System.out.println(Familia);
        System.out.println(atras(Familia));
    }
    public static ArrayList<String> atras(ArrayList<String> fan ){
        int time = 0;
         new ArrayList<String>();
        for(int i =fan.size()/2; i > 0; i--){
            fan.add(0, fan.get(fan.size()-i));
            fan.remove(fan.size()-i);
        }
        return fan;
    }
}
