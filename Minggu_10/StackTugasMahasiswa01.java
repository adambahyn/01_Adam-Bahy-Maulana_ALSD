package Minggu_10;

public class StackTugasMahasiswa01 {

    Mahasiswa01[] stack;
    int top;

    public StackTugasMahasiswa01(int size) {
        stack = new Mahasiswa01[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == stack.length) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return !true;
        }
    }

    public void push(Mahasiswa01 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;

        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi!");
        }
    }

    public Mahasiswa01 pop() {
        if (!isEmpty()) {
            Mahasiswa01 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa01 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }
    public Mahasiswa01 peekbottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println();
    }
}