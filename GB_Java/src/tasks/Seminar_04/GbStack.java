package tasks.Seminar_04;
/*
Реализовать стэк с помощью массива.
Нужно реализовать методы:
size(), empty(), push(), peek(), pop().

 */
public class GbStack {

    private int[] array;
    private int capacity;
    private int top;
    public GbStack(){
        int size = 3;
        array = new int[size];
        capacity = size;
        top = -1;
    }  //Конструктор JAVA

    private void addCapacity(){
        int[] copy = new int[array.length + array.length / 2];
        System.arraycopy(array, 0, copy, 0, array.length);
        array = copy;
        capacity = array.length;
        System.out.println("Add Capacity");

    }
    public int size() {
        return top + 1;
    }
    public boolean empty() {
        return top == -1;
    }
    public GbStack push(int value) { // Используем в качестве переменной название Класса Делается для того, чтобы работать с методами паровозиком
        if (isFull()){
            addCapacity();
        }
        array[++top] = value;
        return this;
    }
    public int peek() {
        if (!empty()){
            return array[top];
        }
        else {
            throw new RuntimeException("Stack is Empty");
        }
    }

    public int pop() {
        if (empty()) {
            throw new RuntimeException("Stack is Empty");
        }
        peek();
        return array[top--];
    }

    private boolean isFull(){
        return size() == capacity;
    }
    public int getCapacity(){
        return capacity;
    }
}
