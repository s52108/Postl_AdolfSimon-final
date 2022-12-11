package products;

public class StackGeneric<T> {
    private T[] elements;
    private int length;

    public StackGeneric(T[] elements) {
        this.elements = elements;
        length = 0;
    }

    public void push(T p) {
        if (length < elements.length)
            elements[length++] = p;
        else
            System.out.println("Stack is full");
    }

    public T pop() {
        if (length > 0) {
            return elements[--length];
        }
        System.out.println("Stack is empty");
        return null;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    @Override
    public String toString() {
        String value = "";
        for (int i = length - 1; i >= 0; i--) {
            value += "Position: " + i + ": " + elements[i];
            value += "\n";
            value += "--------------------------------------------------------\n";
        }
        return value;
    }
}
