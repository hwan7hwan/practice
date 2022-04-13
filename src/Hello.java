import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Hello {
    public static void main(String[] args){
        String a = "What up git";
        String b = "Hello java!!";

        List c =  new ArrayList();
        c.add("list1");
        c.add("list2");
        c.add("list3");

        System.out.println(a);
        System.out.println(b);

        Iterator getList = c.iterator();

        while (getList.hasNext()){
            String showMe =(String) getList.next();
            System.out.println(showMe);
        }

    }
}
