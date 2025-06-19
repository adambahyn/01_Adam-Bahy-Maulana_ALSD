|                | Algorithm and Data Structure                                                  |
| -------------- | ----------------------------------------------------------------------------- |
| **NIM**        | 244107020207                                                                  |
| **Nama**       | Adam Bahy Maulana                                                             |
| **Kelas**      | TI - 1H                                                                       |
| **Repository** | [GitHub Repository](https://github.com/adambahyn/01_AdamBahyMaulana_PRAKALSD) |

# Jobsheet 14 Collection

## 13.3 Praktikum - Implementasi ArrayList

![Screenshot](1.png)

### **14.2.2 Pertanyaan Percobaan**

4. **Cobalah tambahkan object customer baru ke dalam customers. Apakah object dapat ditambahkan meskipun melebihi kapasitas?**
    - bisa
5. **Compile dan run kode program, di mana object yang baru ditambahkan? Di awal, di tengah, atau di akhir collection?**
   - di akhir
7. **Compile dan run kode program. Index pada ArrayList dimulai dari 0 atau 1?**
   - 0
10. **Cobalah hapus angka 2 saat instansiasi object customers. Apakah ArrayList dapat diinstansiasi tanpa harus menentukan size di awal?**
   - bisa
**b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?**
   - jika di konstruktor root = null, maka tree bernilai null
4. **Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?**
   - menambah data baru sebagai root
5. **Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan secara detil untuk apa baris program tersebut?**
   - menambahkan data baru ke node kosong sesuai besarnya nilai terhadap parentnya
6. **Jelaskan langkah-langkah pada method delete() saat menghapus sebuah node yang memiliki dua anak. Bagaimana method getSuccessor() membantu dalam proses ini?**
   - mencari anak paling kiri subtree current kanan, memindah anak kiri current menjadi anaknya anak kanan dari current, memindah anak kanan menjadi current
---

## 14.3.1 Tahapan Percobaan

![Screenshot](2.png)

### **2.2.3 Pertanyaan**

1. **Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?**
   - data sebagai array dari class mahasiswa, idxLast sebagai penanda akhir index array data
2. **Apakah kegunaan dari method populateData()?**
   - untuk mengisi array data dan idxLast
2. **Apakah kegunaan dari method traverseInOrder()?**
   - menampilkan tree secara rekursif dari anak kiri -> akar -> anak kanan
2. **Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisileft child dan rigth child masing-masing?**
   - 5 dan 6
2. **Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?**
   - menandai akhir dari index array data
2. **Mengapa indeks `2*idxStart+1` dan `2*idxStart+2`digunakan dalam pemanggilan rekursif, dan apa kaitannya dengan struktur pohon biner yang disusun dalam array?**
   - 2*idxStart+1 merupakan indeks anak kiri dari parent.
   2*idxStart+2 merupakan indeks anak kanan dari parent.




---

## 3. Tugas
1. 
```java
public void addRekursif(Mahasiswa01 mhs) {
        root=tambahRekursif(root, mhs);
    }

    private Node01 tambahRekursif(Node01 current, Mahasiswa01 mhs) {
        if (current == null) {
            return new Node01(mhs);
        }

        if (mhs.ipk < current.mahasiswa.ipk) {
            current.left = tambahRekursif(current.left, mhs);
        } else {
            current.right = tambahRekursif(current.right, mhs);
        }
        return current;
    }
```
2. 
```java
    public Mahasiswa01 cariMinIPK() {
        if (isEmpty())
            return null;

        Node01 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.mahasiswa;
    }

    public Mahasiswa01 cariMaxIPK() {
        if (isEmpty())
            return null;

        Node01 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.mahasiswa;
    }

    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        tampilIPKLebih(root, ipkBatas);
    }

    private void tampilIPKLebih(Node01 node, double ipkBatas) {
        if (node != null) {
            tampilIPKLebih(node.left, ipkBatas);
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }
            tampilIPKLebih(node.right, ipkBatas);
        }
    }

```
3. 
```java
void add(Mahasiswa01 data) {
        if (idxLast + 1 < dataMahasiswa.length) {
            idxLast++;
            dataMahasiswa[idxLast] = data;
        } else {
            System.out.println("Tree penuh, tidak bisa menambah data.");
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi(); // Akar
                traversePreOrder(2 * idxStart + 1); // Kiri
                traversePreOrder(2 * idxStart + 2); // Kanan
            }
        }
    }

```

