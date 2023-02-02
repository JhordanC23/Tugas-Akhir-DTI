# Tugas-Akhir-DTI
Logika permograman yang saya gunakan ialah :
1) i = baris dan j = kolom
2)menginisialisasikan int n = 5, karena memerlukan 5 baris dan kolom untuk diisi dengan bintang untuk membuat huruf. 
3)for(int i=1;i<=n;i++) , kode tersebut digunakan agar * yang terprint sebnayak 5x kebawah.
4)Untuk membuat angka 0, saya menggunakan kode :
    for(int j=1;j<=n;j++)
    {  
    if (i==1||i==n||j==1||j==n)
          System.out.print("* ");
    else 
    System.out.print("  ");
     }
          System.out.print(" ");
    dengan kode tersebut * akan terprint sebanyak 5x namun hanya akan di print selama ii, i5, j1 dan j5, selain itu akan kosong. Misalanya yang akan terprint pada         bagian atas 0 adalah i1j1, i1j2, i1j3, i1j4, dan i1j5.
5)untuk membuat angka 1, saya menggukan kode : 
    for (int j=1;j<=2;j++)
     {
     if (j==1)
          System.out.print("* ");
     if (j==2)
          System.out.print(" ");
     }
     Dengan kode diatas * akan terprint hanya pada j = 1, dan lainnya ksosong. maka hasilnya nanit adalah i1j1, i2j1, i3j1, i4j1, dan i5j1, sehingga membentuk angka 1.
6)untuk membuat huruf j ;
     for (int j=1;j<=n;j++)
     {
     if (i==1||i==5||j==5)
           System.out.print("* ");
     else
           ystem.out.print("  ");
     }
     Dengan kode diatas kode * hanya akan terprint selama i1, i5, dan j5 sebanyak 5 bintang.
7) Yang keterakhir, untuk membuat baris baru setelah for ke-2 digunakan, saya menggunakan coding :
   System.out.println(" ");
