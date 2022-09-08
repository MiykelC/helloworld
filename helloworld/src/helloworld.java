import java.util.HashSet;
import java.util.Set;

public class helloworld {
    static void f1(){
        System.out.println("f1 has been executed");

    }

    public static void main(String[] args) {
     //   Set<Integer> x = new Hashset<>();
        Myset x = new Myset();
        x.add(11);
        x.add(12);
        x.add(13);
        x.add(14);
        x.add(15);
        x.remove(11);
        System.out.println(x.size());
        System.out.println(x.contains(11)); // false
        }
    }
