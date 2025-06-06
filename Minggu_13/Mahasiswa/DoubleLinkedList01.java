package Minggu_13.Mahasiswa;

public class DoubleLinkedList01 {
    NodeMahasiswa01 head, tail;

    public DoubleLinkedList01() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        }
        NodeMahasiswa01 current = head;
        while (current != null) {
            current.data.tampilInformasi();
            current = current.next;
        }
    }

    public void addFirst(Mahasiswa01 data) {
        NodeMahasiswa01 newNode = new NodeMahasiswa01(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa01 data) {
        NodeMahasiswa01 newNode = new NodeMahasiswa01(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa01 data) {
        NodeMahasiswa01 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan");
            return;
        }
        NodeMahasiswa01 newNode = new NodeMahasiswa01(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void add(int index, Mahasiswa01 input) {
        if (index < 0) {
            System.out.println("index salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa01 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            insertAfter(temp.data.nim, input);
        }
    }
    
    public void getFirst() {
        head.data.tampilInformasi();
    }
    public void getLast() {
        tail.data.tampilInformasi();
    }

    public void getData(int index) {
        NodeMahasiswa01 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.data.tampilInformasi();
    }

    // public int indexOf(String key) {
    //     NodeMahasiswa01 tmp = head;
    //     int index = 0;
    //     while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
    //         tmp = tmp.next;
    //         index++;
    //     }
    //     if (tmp == null) {
    //         return -1;
    //     } else {
    //         return index;
    //     }
    // }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus");
        }
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah " + head.data.nama + " (" + head.data.nim + ")");
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus");
        }
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah " + tail.data.nama + " (" + tail.data.nim + ")");
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void removeAfter(String key) {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus");
        } else {
            NodeMahasiswa01 temp = head;
            while (temp != null) {
                if ((temp.data.nim.equalsIgnoreCase(key)) && (temp == head)) {
                    this.removeFirst();
                    break;
                } else if (temp.data.nim.equalsIgnoreCase(key)) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void remove(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            NodeMahasiswa01 temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
