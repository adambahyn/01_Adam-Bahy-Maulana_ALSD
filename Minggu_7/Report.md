|                | Algorithm and Data Structure                                                  |
| -------------- | ----------------------------------------------------------------------------- |
| **NIM**        | 244107020207                                                                  |
| **Nama**       | Adam Bahy Maulana                                                             |
| **Kelas**      | TI - 1H                                                                       |
| **Repository** | [GitHub Repository](https://github.com/adambahyn/01_AdamBahyMaulana_PRAKALSD) |

# Jobsheet 6

## 6.2. Searching / Pencarian Menggunakan Agoritma Sequential Search

![Screenshot](1.png)

### **6.2.3 Pertanyaan!**

1. **. Jelaskan perbedaan metod tampilDataSearch dan tampilPosisi pada class MahasiswaBerprestasi!**
   - method tampilPosisi hanya berfungsi untuk menampilkan bahwa data yang dicari dalam array ada atau tidak, method tampilDataSearch berfungsi untuk menampilkan informasi lain yang dicari dari indeks array yang sama ketika ditemukan
2. **Jelaskan fungsi break pada kode program dibawah ini!**

- untuk menghentikan perulangan jika kondisi(ipk == cari) benar dan me return posisi yang sudah diganti

---

## 6.3. Searching / Pencarian Menggunakan Binary Search

![Screenshot](2.png)

### **6.3.3 Pertanyaan**

1. **Tunjukkan pada kode program yang mana proses divide dijalankan!**

   - ```java
      if (cari == listMhs[mid].ipk)
         return (mid);
      else if (listMhs[mid].ipk > cari)
         return findBinarySearch(cari, left, mid - 1);
      else
         return findBinarySearch(cari, mid + 1, right);

     ```

2. **Tunjukkan pada kode program yang mana proses conquer dijalankan!**
   - ```java
        if (cari == listMhs[mid].ipk) {
                return (mid);
        }
     ```
3. **Jika data IPK yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian!**
   - tidak bisa, karena binary searching bekerja dengan cara membagi data menjadi 2 bagian, jika yang dicari lebih besar/kecil, maka akan melanjutkan pencarian kearah yang sudah ditentukan.
4. **Jika IPK yang dimasukkan dari IPK terbesar ke terkecil (missal : 3.8, 3.7, 3.5, 3.4, 3.2) dan elemen yang dicari adalah 3.2. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai**
   - tidak sesuai,
   ```java
   else if (listMhs[mid].ipk < cari) {
         return findBinarySearch(cari, left, mid - 1);
   } else {
         return findBinarySearch(cari, mid + 1, right);
   }
   ```
5. **Modifikasilah program diatas yang mana jumlah mahasiswa yang di inputkan sesuai dengan masukan dari keyboard.**
   - ```java
      int jumMhs = sc.nextInt();
      sc.nextLine();
      MahasiswaBerprestasi01 list = new MahasiswaBerprestasi01(jumMhs);
     ```

---

## 6.5 Latihan Praktikum

![Screenshot](3.png)

