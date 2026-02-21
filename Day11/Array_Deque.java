import java.util.ArrayDeque;

public class Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        
        deque.add("Red");
        deque.add("Green");
        deque.add("Blue"); 
        deque.addFirst("Yellow");
        deque.addLast("Purple");
        
        for (String color : deque) {
            System.out.println(color);
        }
        
        System.out.println("Size of the deque: " + deque.size());
        System.out.println("Is the deque empty? " + deque.isEmpty());
        System.out.println("Does the deque contain 'Green'? " + deque.contains("Green"));
    }
}
