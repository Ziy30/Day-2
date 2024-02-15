package lesson7.STACK.Assig1;

import java.util.ArrayList;
import java.util.List;

public class GenericStack <T> {
    private List<T> stack;

//Constructor
    public GenericStack(){
        stack = new ArrayList<>();
    }

    public void push(T item){
        stack.add(item);
    }

    public T pop(){
        if(!isEmpty()){
            return stack.remove(stack.size()-1);
        }else{
            throw new IllegalStateException("Stack is empty");  
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
    

    public static void main(String[] args) {
        // Testing GenericStack with Integer
        GenericStack<Integer> integerStack = new GenericStack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        System.out.println("Popped from integerStack: " + integerStack.pop());
        System.out.println("Popped from integerStack: " + integerStack.pop());

        // Testing GenericStack with String
        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("Hello");
        stringStack.push("World");
        System.out.println("Popped from stringStack: " + stringStack.pop());

        // Testing GenericStack with Double
        GenericStack<Double> doubleStack = new GenericStack<>();
        doubleStack.push(3.14);
        doubleStack.push(2.718);
        System.out.println("Popped from doubleStack: " + doubleStack.pop());
    }

    
    
}
