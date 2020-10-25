/*
Author    : Faddi Susanto
Important : You can edit or share this application but do 
            not do commercial as the author are not take credit from it
Penting   : Silahkan meng-edit atau membagikan aplikasi ini namun dilarang
            keras melakukan penjualan karena pencipta aplikasi tidak meminta uang
*/

import java.util.Scanner;

class Init{
	
	private Scanner scan;
	private DB db;
	private QA qa;
	private Math math;
	private Antonim antonim;
	private Synonim sinonim;
	private TrueFalse truefalse;
	private String[][] isi;
	
	Init(){
		db = new DB();
		begin();
	}
	
	private void begin(){
		if(db.isLogin()){
			index2();
		}else{
			index();
		}
		return;
	}
	
	private void index(){
		System.out.println("\n-----------------");
		System.out.println("Faddi Application");
		System.out.println("-----------------");
		System.out.println("------Menus------\n");
		System.out.println("1. Login");
		System.out.println("2. Register");
		System.out.println("3. Check User");
		System.out.println("4. Check Score");
		System.out.println("5. Delete User");
		System.out.println("6. Exit");
		choose();
		return;
	}
	
	private void index2(){
		System.out.println("\n-----------------");
		System.out.println("Faddi Application");
		System.out.println("-----------------");
		System.out.println("------Menus------\n");
		System.out.println("Welcome, " + db.user()[2]);
		System.out.println("1. Q&A Games");
		System.out.println("2. MATH Games");
		System.out.println("3. Synonim Games");
		System.out.println("4. Antonim Games");
		System.out.println("5. True or False Games");
		System.out.println("6. Check Score");
		System.out.println("7. Logout");
		System.out.println("8. Exit");
		choose2();
		return;
	}
	
	private void choose(){
		scan = new Scanner(System.in);
		int i;		
		System.out.print("Pilih : ");
		i = scan.nextInt();
		
		try{
			if(i == 1){
				System.out.print("\n");
				login();
			}else if(i == 2){
				System.out.print("\n");
				register();
			}else if(i == 3){
				System.out.print("\n");
				userCheck();
			}else if(i == 4){
				System.out.print("\n");
				scoreCheck();
			}else if(i == 5){
				System.out.print("\n");
				delUser();
			}else if(i == 6){
				System.out.print("\n");
				System.out.print("Goodbye..");
				System.out.println("See you again..^^");
				System.exit(0);
			}else{
				System.out.print("\n");
				System.out.println("Nomor yang anda input tidak ada di pilihan.");
				begin();
			}
		}catch(Exception e){
			System.out.print("\n");
			System.out.println("Masukkan hanya angka.");
			begin();
		}
		return;
	}

	private void choose2(){
		scan = new Scanner(System.in);
		int i;
		System.out.print("Pilih : ");
		i = scan.nextInt();
		
		try{
			if(i == 1){
				System.out.print("\n");
				qa = new QA();
				System.out.println("Score : " + qa.hasil());
				if(qa.hasil() >= Integer.parseInt(db.score()[2])){
					db.updateScore(2,Integer.toString(qa.hasil()));
				}
				begin();
			}else if(i == 2){
				System.out.print("\n");
				math = new Math();
				System.out.println("Score : " + math.hasil());
				if(math.hasil() > Integer.parseInt(db.score()[3])){
					db.updateScore(3,Integer.toString(math.hasil()));
				}
				begin();
			}else if(i == 3){
				System.out.print("\n");
				sinonim = new Synonim();
				System.out.println("Score : " + sinonim.hasil());
				if(sinonim.hasil() > Integer.parseInt(db.score()[4])){
					db.updateScore(4,Integer.toString(sinonim.hasil()));
				}
				begin();
			}else if(i == 4){
				System.out.print("\n");
				antonim = new Antonim();
				System.out.println("Score : " + antonim.hasil());
				if(antonim.hasil() > Integer.parseInt(db.score()[5])){
					db.updateScore(5,Integer.toString(antonim.hasil()));
				}
				begin();
			}else if(i == 5){
				System.out.print("\n");
				truefalse = new TrueFalse();
				System.out.println("Score : " + truefalse.hasil());
				if(truefalse.hasil() > Integer.parseInt(db.score()[6])){
					db.updateScore(6,Integer.toString(truefalse.hasil()));
				}
				begin();
			}else if(i == 6){
				System.out.print("\n");
				checkScoreLogin();
				begin();
			}else if(i == 7){
				System.out.print("\n");
				System.out.println("Have a nice day, " + db.user()[2]);
				logout();
			}else if(i == 8){
				System.out.print("\n");
				System.out.print("Goodbye..");
				System.out.println("See you again..^^");
				System.exit(0);
			}else{
				System.out.println("Nomor yang anda masukkan tidak ada di pilihan.");
				begin();
			}
		}catch(Exception e){
			System.out.print("\n");
			System.out.println("Masukkan hanya angka.");
			begin();
		}
		return;
	}
	
	private void login(){
		scan = new Scanner(System.in);
		String usrnm, pwd;
		System.out.print("Masukkan Username : ");
		usrnm = scan.nextLine();
		System.out.print("Masukkan Password : ");
		pwd = scan.nextLine();
		db.login(usrnm,pwd);
		begin();
	}
	
	private void logout(){
		db.logout();
		begin();
	}
	
	private void register(){
		scan = new Scanner(System.in);
		String usrnm, pwd, nama, alamat, tmp, tgl, hobi;
		System.out.print("Username      : ");
		usrnm = scan.nextLine();
		System.out.print("Password      : ");
		pwd = scan.nextLine();
		System.out.print("Nama          : ");
		nama = scan.nextLine();
		System.out.print("Alamat        : ");
		alamat = scan.nextLine();
		System.out.print("Tempat Lahir  : ");
		tmp = scan.nextLine();
		System.out.print("Tanggal Lahir : ");
		tgl = scan.nextLine();
		System.out.print("Hobi          : ");
		hobi = scan.nextLine();
		String[] reg = {usrnm,pwd,nama,alamat,tmp,tgl,hobi};
		db.update(reg);
		begin();
		return;
	}
	
	private void userCheck(){
		db.userCheck();
		begin();
		return;
	}
	
	private void scoreCheck(){
		db.scoreCheck();
		begin();
		return;
	}
	
	private void delUser(){
		scan = new Scanner(System.in);
		String username = "";
		System.out.print("Masukkan username yang ingin dihapus : ");
		username = scan.nextLine();
		db.deleteUser(username,0);
		db.deleteScore(username,0);
		return;
	}
	
	private void checkScoreLogin(){
		System.out.println("Username                           : " + db.score()[0]);
		System.out.println("Nama                               : " + db.score()[1]);
		System.out.println("Score Q&A Game Tertinggi           : " + db.score()[2]);
		System.out.println("Score MATH Game Tertinggi          : " + db.score()[3]);
		System.out.println("Score Synonim Game Tertinggi       : " + db.score()[4]);
		System.out.println("Score Antonim Game Tertinggi       : " + db.score()[5]);
		System.out.println("Score True Or False Game Tertinggi : " + db.score()[6]);
		begin();
		return;
	}
	
}