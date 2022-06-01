package practiseBen;

import java.util.ArrayList;
import java.util.List;

public class First {
    public static void main(String[] args) {
        List<Integer> temp=new ArrayList<Integer>();
        temp.add(1);
        temp.add(2);
        temp.add(3);
        System.out.println(temp.size());
        for(Integer a:temp){
            System.out.println(a);
        }

    }
}
