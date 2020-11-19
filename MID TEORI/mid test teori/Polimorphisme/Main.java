import java.util.Scanner;

class Main {
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	
	String name;
	int jumpemakaian;
	
	System.out.print("masukkan nama anda : ");
    name = input.nextLine();
	System.out.print("Jumlah pemakaian meteran :");
	jumpemakaian = input.nextInt();
	
	Proses p = new Proses(name,jumpemakaian);
	Polimorphisme l = new Proses(name,jumpemakaian);
	
	p.pilihan();
	p.pembayaran();
	p.cetak();
	
	
		
	}
}