public class StaticStack<T> {
    private int top = -1;
    private T[] data;


    public StaticStack(int size) {
        data = (T[]) new Object[size];
    }


    public void push(T value) {
        if (isFull()) {
            throw new StackOverflowError("Pilha cheia");
        }

    }


    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia");
        }
        return data[top--];
    }


    public void clear() {
        top = -1;
    }


    public boolean isFull() {
        return top == data.length - 1;
    }


    public boolean isEmpty() {
        return top == -1;
    }
}
