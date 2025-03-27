|                | Algorithm and Data Structure                                                  |
| -------------- | ----------------------------------------------------------------------------- |
| **NIM**        | 244107020207                                                                  |
| **Nama**       | Adam Bahy Maulana                                                             |
| **Kelas**      | TI - 1H                                                                       |
| **Repository** | [GitHub Repository](https://github.com/adambahyn/01_AdamBahyMaulana_PRAKALSD) |

# Jobsheet 6

## 6.2 Praktikum 1 - Mengimplementasikan Sorting menggunakan object

![Screenshot](1.png)

### **5.2.5 Pertanyaan!**

1. **Jelaskan fungsi kode program berikut**
   - Jika data index -1 lebih besar dari data index, maka memindahkan data index ke temp, mengubah data index dengan index -1, mengubah data index -1 dengan temp.
2. **Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada selection sort!**
   ```java
      int min = i;
      for (int j = i + 1; j < jumData; j++) {
            if (data[j] < data[min]) {
               min = j;
            }
      }
   ```
3. **Pada Insertion sort , jelaskan maksud dari kondisi pada perulangan**
   - Selama j lebih besar atau sama dengan 0 dan data index ke-j lebih besar dari temp, maka mengubah data index ke-j+1 dengan data index ke-j, dan decrement j
4. **Buat Kesimpulan tentang perbedaan cara kerja method faktorialBF() dan faktorialDC()!**
   - memindahkan data yang lebih besar ke index +1

---

## 5.3 Praktikum 2- (Sorting Menggunakan Array of Object)

![Screenshot](2.png)

### **5.3.4 Pertanyaan**

1. **Perhatikan perulangan di dalam bubbleSort() di bawah ini:**
   a. **Mengapa syarat dari perulangan i adalah ?**
   ```java
      i<listMhs.length-1
   ```
   karena di Bubble Sort, setelah penyortiran atau perulangan dilakukan selama n-1 kali, maka elemen terakhir sudah akan berada di posisi yang benar
   b. **Mengapa syarat dari perulangan j adalah**
   ```java
      j<listMhs.length-i
   ```
   Agar tidak membandingkan elemen yang posisi nya sudah benar
   c. **Jika  banyak  data  di  dalam  listMhs  adalah  50,  maka berapakali perulangan i akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?**
   Perulangan i ber iterasi selama 49 kali, dan juga ada 49 tahap Bubble Sort

2. **Modifikasi program diatas dimana data mahasiswa bersifat dinamis (input dari keyborad) yang terdiri dari nim, nama, kelas, dan ipk!**
   - ![Screenshot](3.png)![Screenshot](4.png)


## 5.3.5 Mengurutkan Data Mahasiswa Berdasarkan IPK (Selection Sort)

![Screenshot](5.png)
![Screenshot](6.png)

### **5.3.7 Pertanyaan**

1. **Di dalam method selection sort, terdapat baris program seperti di bawah ini:**
**Untuk apakah proses tersebut, jelaskan!**
   - untuk menemukan index elemen dengan nilai ipk terkecil yang nanti akan ditukar dengan bagian array yang belum disortir.

## 5.4 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insertion Sort

![Screenshot](7.png)
![Screenshot](8.png)

### **5.4.3 Pertanyaan**

1. **Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting dengan cara descending.**
   - ![Screenshot](9.png)


---

## 5.5 Latihan Praktikum

![Screenshot](10.png)
![Screenshot](11.png)
![Screenshot](12.png)
![Screenshot](13.png)
