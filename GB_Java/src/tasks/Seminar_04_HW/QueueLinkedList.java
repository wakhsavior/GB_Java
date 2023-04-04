package tasks.Seminar_04_HW;

import java.util.LinkedList;

/*
Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() -
возвращает первый элемент из очереди, не удаляя.


 */
public class QueueLinkedList {
    private LinkedList<Integer> queueLink;
    private int top;

    public QueueLinkedList() {
        top = -1;
        queueLink = new LinkedList<>();
    }

    public void enqueue(int item) {
        queueLink.add(item);
        top++;
    }

    public int dequeue() {
        if (!empty()) {
            top--;
            return queueLink.pollFirst();
        } else {
            throw new RuntimeException("Queue is Empty");
        }
    }

    public void showQueue() {
        if (!empty()) {
            for (int i = 0; i < top; i++) {
                System.out.print(queueLink.get(i) + ", ");
            }
            System.out.print(queueLink.get(top) + "\n");
        }else {
            throw new RuntimeException("Queue is Empty");
        }

    }

    public int first() {
        if (!empty()) {
            return queueLink.getFirst();
        } else {
            throw new RuntimeException("Queue is Empty");
        }
    }

    public boolean empty() {
        return top == -1;
    }

    public int getSize() {
        return top + 1;
    }
}
