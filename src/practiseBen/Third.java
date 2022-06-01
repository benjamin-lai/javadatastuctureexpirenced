package practiseBen;

import java.util.ArrayList;
import java.util.List;

public class Third {
    public static void main(String[] args) {
        List<String> temp=new ArrayList<String>();
        temp.add("hello");
        temp.add("world");
        temp.add("!");
        System.out.println(temp.size());
        for(String a:temp){
            System.out.println(a);
        }
    }
}
