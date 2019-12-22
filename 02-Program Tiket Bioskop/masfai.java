import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class masfai{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean a = true, b = true;
            int number,detik, menit, jam, hari, bulan, tahun;
    GregorianCalendar date = new GregorianCalendar();
    String namabulan[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
    detik = date.get(Calendar.SECOND);
    menit = date.get(Calendar.MINUTE);
    jam =  date.get(Calendar.HOUR_OF_DAY);
    hari = date.get(Calendar.DAY_OF_MONTH);
    bulan = date.get(Calendar.MONTH);
    tahun = date.get(Calendar.YEAR);
    
        do{
		System.out.println("Film Tayang Pada Tanggal 15-30 Desember 2019");
	//	System.out.print ("masukkan tanggal hari ini : ");
	//	int hari = in.nextInt();
        System.out.println(" ");
    System.out.println("Tanggal sekarang: "+hari+" "+namabulan[bulan]+" "+tahun);
    System.out.println("Waktu sekarang: "+jam+":"+menit+":"+detik);
    
                        System.out.println(" ");
			System.out.println("Selamat Datang Di Bioskop XXI");
                        System.out.println("Film Saski dan Risfi 3");
            System.out.println("1. Usia 2 tahun");
            System.out.println("2. Usia 2-17 tahun");
            System.out.println("3. Usia 17 tahun ke atas");
            System.out.println("4. Anak SMA");
            System.out.println("5. Anak SMK");
            System.out.println("NB : Khusus Anak SMA Mendapat Cashback 5%");
           
                        System.out.println("Masukkan Pilihan Sesuai Umur Anda : ");
                        number = in.nextInt();
                        
                        if (number == 1){
                            System.out.println("Maaf Anda Belum Mencukupi Umur");
                        }else if (number == 2){
                                System.out.println("Maaf Anda Tidak Mendapat Diskon");
                        }else if (number == 3){
                        System.out.println("Masukkan Jumlah Tiket : ");
                                int ticket = in.nextInt();
                                    if (ticket == 2){
                                        System.out.println("Selamat Anda Mendapatkan Gratis 1 Tiket dan Diskon 10%");
                                        }
                                    }else
                              if (number == 4){
                                            System.out.println("Selamat Siswa/i SMA Mendapatkan Cashback 5%");
                                    }else if (number == 5){
                                            System.out.println("Maaf Anda Tidak Mendapatkan Cashback");
                                        }else{
                                        
                                    }                
                                    
        do{
                System.out.println("Apakah anda masih ingin lanjut membeli tiket?");
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
            System.out.println("Terima Kasih Sudah mengunjungi bioskop XXI");
        }
    }