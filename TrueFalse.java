/*
Author    : Faddi Susanto
Important : You can edit or share this application but do 
            not do commercial as the author are not take credit from it
Penting   : Silahkan meng-edit atau membagikan aplikasi ini namun dilarang
            keras melakukan penjualan karena pencipta aplikasi tidak meminta uang
*/

import java.util.*;

class TrueFalse{
	
	private DB db;
	private List<Integer> Truefalse = new ArrayList<>();
	private List<String> awr = new ArrayList<>();
	private String[] awrs;
	private List<String> jwb = new ArrayList<>();
	private String[] jwbn;
	private Integer[] beginTruefalse;
	private Scanner scan;
	
	TrueFalse(){
		db = new DB();
		for(int i=0;i<10;i++){
			Truefalse.add(i);
		}
		Collections.shuffle(Truefalse);
		beginTruefalse = Truefalse.toArray(new Integer[Truefalse.size()]);
		begin();
	}
	
	
	private void begin(){
		int i=0;
		while(i<10){
			int j = i+1;
			System.out.print(j + ". ");
			if(beginTruefalse[i] == 0){ Truefalse0(); }
			else if(beginTruefalse[i] == 1){ Truefalse1(); }
			else if(beginTruefalse[i] == 2){ Truefalse2(); }
			else if(beginTruefalse[i] == 3){ Truefalse3(); }
			else if(beginTruefalse[i] == 4){ Truefalse4(); }
			else if(beginTruefalse[i] == 5){ Truefalse5(); }
			else if(beginTruefalse[i] == 6){ Truefalse6(); }
			else if(beginTruefalse[i] == 7){ Truefalse7(); }
			else if(beginTruefalse[i] == 8){ Truefalse8(); }
			else if(beginTruefalse[i] == 9){ Truefalse9(); }
			i++;
		}
		awrs = awr.toArray(new String[awr.size()]);
		jwbn = jwb.toArray(new String[jwb.size()]);
		hasil();
	}
	
	private void Truefalse0(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("romeo dan juliet adalah sebuah cerita pembunuhan tragis? (benar/salah)");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add("salah");
		boolean which = jwbs.equalsIgnoreCase("salah");
		if(which){
			jwb.add(jwbs);
		}
		else{
			jwb.add("benar");
		}
		return;
	}
	
	private void Truefalse1(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("Albert Einstein seorang ilmuwan jenius? (benar/salah)");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add("benar");
		boolean which = jwbs.equalsIgnoreCase("benar");
		if(which){
			jwb.add(jwbs);
		}else{
			jwb.add("salah");
		}
		return;
	}
	
	private void Truefalse2(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("Amerika adalah negara adidaya? (benar/salah)");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add("benar");
		boolean which = jwbs.equalsIgnoreCase("benar");
		if(which){
			jwb.add(jwbs);
		}else{
			jwb.add("salah");
		}
		return;
	}
	
	private void Truefalse3(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("Matematika dibuat untuk berbahasa? (benar/salah)");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add("salah");
		boolean which = jwbs.equalsIgnoreCase("salah");
		if(which){
			jwb.add(jwbs);
		}else{
			jwb.add("benar");
		}
		return;
	}
	
	private void Truefalse4(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("menara eiffel berada di kota New York? (benar/salah)");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add("salah");
		boolean which = jwbs.equalsIgnoreCase("salah");
		if(which){
			jwb.add(jwbs);
		}else{
			jwb.add("benar");
		}
		return;
	}
	
	private void Truefalse5(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("piramida mesir dibuat oleh alien? (benar/salah)");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add("salah");
		boolean which = jwbs.equalsIgnoreCase("salah");
		if(which){
			jwb.add(jwbs);
		}else{
			jwb.add("benar");
		}
		return;
	}
	
	private void Truefalse6(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("gunung everest gunung tertinggi didunia? (benar/salah)");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add("benar");
		boolean which = jwbs.equalsIgnoreCase("benar");
		if(which){
			jwb.add(jwbs);
		}else{
			jwb.add("salah");
		}
		return;
	}
	
	private void Truefalse7(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("Hong Kong termasuk pada benua asia? (benar/salah)");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add("benar");
		boolean which = jwbs.equalsIgnoreCase("benar");
		if(which){
			jwb.add(jwbs);
		}else{
			jwb.add("salah");
		}
		return;
	}
	
	private void Truefalse8(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("Indonesia telah merdeka tahun 1945? (benar/salah)");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add("benar");
		boolean which = jwbs.equalsIgnoreCase("benar");
		if(which){
			jwb.add(jwbs);
		}else{
			jwb.add("salah");
		}
		return;
	}
	
	private void Truefalse9(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("programmer sang pembuat aplikasi ini sangat tampan? (benar/salah)");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add("benar");
		boolean which = jwbs.equalsIgnoreCase("benar");
		if(which){
			jwb.add(jwbs);
		}else{
			jwb.add("salah");
		}
		return;
	}
	
	public int hasil(){
		int score=0;
		if(awrs == null && jwbn == null){
			System.out.println("Ada kesalahan, contact Programmer aplikasi.");
		}else{
			int i=0;
			while(i<10){
				if(awrs[i].equals(jwbn[i])){
					score += 10;
				}else{
					score+=0;
				}
				i++;
			}
		}
		return score;
	}
	
}
