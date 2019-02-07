import java.util.ArrayList;
import java.util.Iterator;

public class NNodeFromEnd {

    public static void main(String[] args) {

        //list size
        int n = 50;
        //k is the node from the end that we want
        int k = 5;
        //just initializing a list for demo
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            list.add(i);
        //first iterator
        Iterator<Integer> first = list.iterator();
        //carry ahead iterator
        Iterator<Integer> second = list.iterator();
        //advance carry ahead iterator k steps ahead
        if(k<=0) {
            System.out.println("Provide positive value bitch :) ");
            System.exit(0);
        }
        for (int j = 1; j <= k; j++) {
            if(second.hasNext()) {
                second.next();
            }else{
                System.out.println("Oops! Fuck you! Out of Bounds.");
                System.exit(0);
            }
        }
        while (second.hasNext()) {
            first.next();
            second.next();
        }
        System.out.println(first.next());

    }

}