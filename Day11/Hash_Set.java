
import java.util.HashSet;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet<Integer> l=new HashSet<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);  
        for(Integer number : l) {
            System.out.println(number);
        }
        System.out.println("Size of the set: " + l.size());
        System.out.println("Is the set empty? " + l.isEmpty());
        System.out.println("Does the set contain '30'? " + l.contains(30));     
    }
    
}
