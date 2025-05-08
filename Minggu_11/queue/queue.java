package queue;

public class queue {
    int data[];
    int front;
    int rear;
    int size;
    int max;

    public queue(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public boolean IsFull() {
        return size == max;
    }

    public void peek() {
        System.out.println(IsEmpty() ? "Queue masih kosong" : "Elemen terdepan: " + data[front]);
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(1);
        }

        int i = front;
        while (i != rear) {
            System.out.print(data[i] + " ");
            i = (i + 1) % max;
        }
        System.out.println(data[i] + " ");
        System.out.println("Jumlah elemen = " + size);
    }

    public void clear() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(1);
        }

        front = rear = -1;
        size = 0;
        System.out.println("Queue berhasil dikosongkan");
    }

    public void Enqueue(int dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(1);
        }

        if (IsEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        data[rear] = dt;
        size++;
    }

    public int Dequeue() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(1);
        }

        int dt = data[front];
        size--;

        if (size == 0) {
            front = rear = -1;
        } else {
            front = (front + 1) % max;
        }

        return dt;
    }

}
