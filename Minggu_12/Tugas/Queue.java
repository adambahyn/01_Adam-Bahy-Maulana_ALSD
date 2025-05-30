package Minggu_12.Tugas;

public class Queue {
    Node front, rear;
    int size;

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(Mahasiswa data) {
        Node newNode = new Node(data, null);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Antrian ditambahkan: " + data.nama);
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak dapat memanggil.");
        } else {
            System.out.println("Memanggil: " + front.data.nama);
            front = front.next;
            if (front == null) rear = null;
            size--;
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Antrian:");
            Node current = front;
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }
    }

    public void peekFrontAndRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian Terdepan: " + front.data.nama);
            System.out.println("Antrian Terakhir: " + rear.data.nama);
        }
    }

    public void clearQueue() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public int size() {
        return size;
    }
}
