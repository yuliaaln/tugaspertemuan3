import java.util.Scanner;

//memnaggil class
class Cafe {
  public static void main(String[] argumen) {
	
	//untuk menjalankan program
    boolean programBerjalan = true;
	
	//untuk memanggil data berupa angka
    int totalBarang1 = 0;
    int totalBarang2 = 0;
    int totalBarang3 = 0;
    int totalBarang4 = 0;
    int totalBarang5 = 0;
    int totalKeuntungan = 0;
	
	//input data 
    Scanner inputPengguna = new Scanner(System.in);
    int nomorBarangDibeli;
    int kuantitasBarangDibeli;
    String kataPembuka;
	
	//perulangan data
    while(programBerjalan) {
      kataPembuka = "========================================================";
      kataPembuka += "\nSelamat datang di Cafe Li, mau pesan apa ?";
      kataPembuka += "\n1. Paket kentang sosis (Rp. 25.000) - " + totalBarang1 + " barang terjual";
      kataPembuka += "\n2. Tahu lada garam (Rp. 15.000) - " + totalBarang2 + " barang terjual";
      kataPembuka += "\n3. Steak tenderloin BBQ (Rp. 40.000) - " + totalBarang3 + " barang terjual";
      kataPembuka += "\n4. Dimsum (Rp. 10.000) - " + totalBarang4 + " barang terjual";
      kataPembuka += "\n5. Spaghetti Bolognaise (Rp. 12.000) - " + totalBarang5 + " barang terjual";
      kataPembuka += "\n0. Tidak jadi memesan";
      kataPembuka += "\n\nTotal keuntungan toko saat ini Rp. " + totalKeuntungan + "";
      kataPembuka += "\n========================================================";
      kataPembuka += "\n\nNomor pesanan (1 / 2 / 3 / 4 /5)";
      kataPembuka += "\nPilih nomor pesanan:";
       
	//memanggil data yang di perintahkan
      System.out.print(kataPembuka);
      nomorBarangDibeli = inputPengguna.nextInt();
	
	//Kondisi jika nomorBarangDibeli
      if (nomorBarangDibeli == 1 || nomorBarangDibeli == 2 || nomorBarangDibeli == 3 || nomorBarangDibeli == 4 || nomorBarangDibeli == 5) {

        System.out.print("Menu nomor " + nomorBarangDibeli + " dipilih\nMau berapa banyak ?");
        kuantitasBarangDibeli = inputPengguna.nextInt();

        System.out.println("Menu nomor " + nomorBarangDibeli + " dibeli sejumlah " + kuantitasBarangDibeli + " buah");
		
		
        switch(nomorBarangDibeli) {
			//jika barang nomor 1
          case 1:
            totalBarang1 += kuantitasBarangDibeli;
            totalKeuntungan += (kuantitasBarangDibeli * 25000);
            break;
			//jika barang nomor 2
          case 2:
            totalBarang2 += kuantitasBarangDibeli;
            totalKeuntungan += (kuantitasBarangDibeli * 15000);
            break;
			//jika barang nomor 3
          case 3:
            totalBarang3 += kuantitasBarangDibeli;
            totalKeuntungan += (kuantitasBarangDibeli * 40000);
            break;
			//jika barang nomor 4
          case 4:
            totalBarang4 += kuantitasBarangDibeli;
            totalKeuntungan += (kuantitasBarangDibeli * 10000);
            break;
			//jika barang nomor 5
	  case 5:
            totalBarang5 += kuantitasBarangDibeli;
            totalKeuntungan += (kuantitasBarangDibeli * 12000);
            break;
        }

		//Jika barang nomor 0 / nomor tidak ada
      } else if (nomorBarangDibeli == 0) {
        programBerjalan = false; 
        System.out.println("Sayang sekali, kamu melewatkan makanan terlezat");
      } else {
        System.out.println("Apa yang kamu pilih tidak layak untuk dibeli");
      }
    }
  }
}
