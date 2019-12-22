import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner ;

public class masfai{
    public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	boolean a = true, b=true;
    int detik, menit, jam, hari, bulan, tahun;
    GregorianCalendar date = new GregorianCalendar();
    String namabulan[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
    detik = date.get(Calendar.SECOND);
    menit = date.get(Calendar.MINUTE);
    jam =  date.get(Calendar.HOUR_OF_DAY);
    hari = date.get(Calendar.DAY_OF_MONTH);
    bulan = date.get(Calendar.MONTH);
    tahun = date.get(Calendar.YEAR);
		
	do{
		System.out.println("Setiap Tanggal 1 Sampai 10 Dengan Total Belanja Diatas Rp.700,000,- Kami akan Memberikan Diskon Sebesar 5% Semua Barang");
	//	System.out.print ("masukkan tanggal hari ini : ");
	//	int hari = in.nextInt();
        System.out.println(" ");
    System.out.println("Tanggal sekarang: "+hari+" "+namabulan[bulan]+" "+tahun);
    System.out.println("Waktu sekarang: "+jam+":"+menit+":"+detik);
  
		
			System.out.println(" ");
			System.out.println("Daftar Barang dan Harga : ");
            System.out.println("Kemeja  : Rp 70.000,-");
            System.out.println("kaos	: Rp 85.000,-");
            System.out.println("Jas     : Rp 150.000,-");
            System.out.println("Jeans   : Rp 120.000,-");
            System.out.println("Chino   : Rp 210.000,-");

         
			System.out.print("Masukkan jumlah kemeja yang dibeli: ");
            int kemeja = in.nextInt();
            System.out.print("Masukkan jumlah kaos yang dibeli: ");
            int kaos = in.nextInt();
            System.out.print("Masukkan jumlah jas yang dibeli: ");
            int jas = in.nextInt();
            System.out.print("Masukkan jumlah jeans yang dibeli: ");
            int jeans = in.nextInt();
            System.out.print("Masukkan jumlah chino yang dibeli: ");
            int chino = in.nextInt();

            int jumlah = kemeja + kaos + jas + jeans + chino;
            int totalbelanja = kemeja*70000 + kaos*85000 + jas*150000 + jeans*120000 + chino*210000;
			int diskon = totalbelanja*5/100;
			int hargadiskon = totalbelanja - diskon;
			
			if (hari >=1 && hari<=10){
				if (jumlah>=5){
					if (totalbelanja>=700000){
					System.out.println ("Anda mendapatkan diskon sebesar = Rp."+diskon+" dari total belanja sebesar = Rp."+totalbelanja);
					System.out.println ("Dan total harga belanja anda adalah = Rp."+hargadiskon);
					} else {
                        System.out.println("Jumlah Total Belanjaan Anda: "+totalbelanja);
                    }
                } else { 
                    System.out.println("Jumlah Total Belanjaan Anda: "+totalbelanja);
                }
            } else {
                System.out.println("Jumlah Total Belanjaan Anda: "+totalbelanja);
            }
            do{
                System.out.println("Apakah anda masih ingin lanjut Berbelanja?");
                System.out.println("1. Ya");
                System.out.println("2. Tidak");
                int pilihan = in.nextInt();

                switch(pilihan){
                    case 2:
                    a = false;
                    break;
                }
                if(pilihan == 0){
                    System.out.println("Maaf, Pilihan tidak tersedia");
                }
                else if(pilihan > 2){
                    System.out.println("Maaf, Pilihan tidak tersedia");
                } else {
                    b = false;
                }
            }while (b);
        } while (a);
            System.out.println("Terima Kasih Sudah Berbelanja di toko Saya");
  }
}