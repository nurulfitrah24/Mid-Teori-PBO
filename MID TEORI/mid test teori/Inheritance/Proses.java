import java.util.Scanner;




class Proses extends Inheritance{
	private int biaya=0;

	Scanner input = new Scanner(System.in);
	



	public void input(){
	
	System.out.print("masukkan nama anda : ");
    nama = input.nextLine();
	System.out.print("Jumlah pemakaian meteran :");
	pemakaian = input.nextInt();
	}
	
	public void pilihan(){
	
	boolean loop=true;
	
	while(loop){
	
	System.out.print("Tipe Rumah(31/32/33/34/35/40) : ");
	tiperumah = input.nextInt();
	
	switch(tiperumah){
            case 31 :
                biaya = 100000;
                System.out.println("Biaya : "+biaya);
                
                loop = false;
                break;
            case 32 :
                 biaya = 125000;
                 System.out.println("Biaya : "+biaya);
                 
                 loop= false;
                break;
                case 33 :
               biaya =  450000;
                 System.out.println("Biaya : "+biaya);
                   loop= false;
                break;
                case 34 :
               biaya =  480000;
                 System.out.println("Biaya : "+biaya);
                   loop= false;
                break;
                  case 35 :
               biaya =  500000;
                 System.out.println("Biaya : "+biaya);
                   loop= false;
                break;
                  case 40 :
               biaya =  550000;
                 System.out.println("Biaya : "+biaya);
                   loop= false;
                break;
                
                
            default :
                System.out.println();
                System.out.println("Tipe rumah anda tidak ada coba lagi");
                break;
                
               
        }
	}

	
	}
	
	public void pembayaran(){
		
		totalharga = pemakaian*biaya;
		System.out.println("Total Harga    : "+totalharga);
		
	
		
		System.out.print("Masukkan Jumlah uang dibayarkan : "+"Rp.");
		bayar= input.nextInt();
			
			
		while(bayar<totalharga){
			
			if(bayar<totalharga){
				
				System.out.println("uang anda kurang mohon masukkan dengan nominal yang lebih besar");
				
	            System.out.print("Masukkan Jumlah uang dibayarkan : "+"Rp.");
		        bayar= input.nextInt();
			
				}else{
				
				System.out.print("Masukkan Jumlah uang dibayarkan : "+"Rp.");
		        bayar= input.nextInt();
				}
	
		
		}
    	
	}
	public void cetak(){
	System.out.println();	
	System.out.println("=====Cetak Hasil Pembayaran=====");
	System.out.println("Nama pelanggan : "+ nama);
	System.out.println("Total Harga    : "+totalharga);
	System.out.println("Bayar          : "+ bayar);
	System.out.println("Kembaliaan     : "+ (bayar-totalharga));
	System.out.println("=====Cetak Hasil Pembayaran=====");
	}
	



	
}