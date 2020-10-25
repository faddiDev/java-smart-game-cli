/*
Author    : Faddi Susanto
Important : You can edit or share this application but do 
            not do commercial as the author are not take credit from it
Penting   : Silahkan meng-edit atau membagikan aplikasi ini namun dilarang
            keras melakukan penjualan karena pencipta aplikasi tidak meminta uang
*/

import java.util.*;

class Synonim{
	
	private DB db;
	private List<Integer> Sinonim = new ArrayList<>();
	private List<Character> awr = new ArrayList<>();
	private Character[] awrs;
	private List<Character> jwb = new ArrayList<>();
	private Character[] jwbn;
	private Integer[] beginSinonim;
	private Scanner scan;
	
	Synonim(){
		db = new DB();
		for(int i=0;i<10;i++){
			Sinonim.add(i);
		}
		Collections.shuffle(Sinonim);
		beginSinonim = Sinonim.toArray(new Integer[Sinonim.size()]);
		begin();
	}
	
	private void begin(){
		int i=0;
		while(i<10){
			int j = i+1;
			System.out.print(j + ". ");
			if(beginSinonim[i] == 0){ Sinonim0(); }
			else if(beginSinonim[i] == 1){ Sinonim1(); }
			else if(beginSinonim[i] == 2){ Sinonim2(); }
			else if(beginSinonim[i] == 3){ Sinonim3(); }
			else if(beginSinonim[i] == 4){ Sinonim4(); }
			else if(beginSinonim[i] == 5){ Sinonim5(); }
			else if(beginSinonim[i] == 6){ Sinonim6(); }
			else if(beginSinonim[i] == 7){ Sinonim7(); }
			else if(beginSinonim[i] == 8){ Sinonim8(); }
			else if(beginSinonim[i] == 9){ Sinonim9(); }
			i++;
		}
		awrs = awr.toArray(new Character[awr.size()]);
		jwbn = jwb.toArray(new Character[jwb.size()]);
		hasil();
	}
	
	private void Sinonim0(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("abadi = ...");
		System.out.println("a. kekal\t\t\tc. sementara");
		System.out.println("b. lama\t\t\td. cepat");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add((char) 97);
		jwb.add(jwbs.charAt(0));
		return;
	}
	
	private void Sinonim1(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("cantik =  ...");
		System.out.println("a. buruk\t\t\t\tc. jelek");
		System.out.println("b. anggun\t\t\t\td. baik");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add((char) 98);
		jwb.add(jwbs.charAt(0));
		return;
	}
	
	private void Sinonim2(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("ekonomis = ...");
		System.out.println("a. boros\t\t\t\tc. irit");
		System.out.println("b. habis\t\t\t\td. tersier");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add((char) 99);
		jwb.add(jwbs.charAt(0));
		return;
	}
	
	private void Sinonim3(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("identik = ...");
		System.out.println("a. berbeda\t\t\tc. tak sama");
		System.out.println("b. identitas\t\t\td. serupa");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add((char) 100);
		jwb.add(jwbs.charAt(0));
		return;
	}
	
	private void Sinonim4(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("jahat = ...");
		System.out.println("a. bengis\t\t\t\tc. baik");
		System.out.println("b. keras\t\t\t\td. alim");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add((char) 97);
		jwb.add(jwbs.charAt(0));
		return;
	}
	
	private void Sinonim5(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("kualitas = ...");
		System.out.println("a. buruk\t\t\t\tc. kuantitas");
		System.out.println("b. derajat\t\t\t\td. kuantiti");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add((char) 98);
		jwb.add(jwbs.charAt(0));
		return;
	}
	
	private void Sinonim6(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("labil = ...");
		System.out.println("a. stabil\t\t\t\tc. goyah");
		System.out.println("b. mulus\t\t\t\td. tidak mantap");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add((char) 99);
		jwb.add(jwbs.charAt(0));
		return;
	}
	
	private void Sinonim7(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("lahir = ...");
		System.out.println("a. selesai\t\t\t\tc. mati");
		System.out.println("b. meninggal\t\t\t\td. tumbuh");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add((char) 100);
		jwb.add(jwbs.charAt(0));
		return;
	}
	
	private void Sinonim8(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("murid = ...");
		System.out.println("a. musyid\t\t\t\tc. guru");
		System.out.println("b. senior\t\t\t\td. anak didik");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add((char) 100);
		jwb.add(jwbs.charAt(0));
		return;
	}
	
	private void Sinonim9(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("orisinal = ...");
		System.out.println("a. asli\t\t\t\tc. tiruan");
		System.out.println("b. jiplak\t\t\td. imitasi");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add((char) 97);
		jwb.add(jwbs.charAt(0));
		return;
	}
	
	public int hasil(){
		int score=0;
		if(awrs == null && jwbn == null){
			System.out.println("Ada kesalahan, contact Programmer aplikasi.");
		}else{
			int i=0;
			while(i<10){
				if(awrs[i] == jwbn[i]){
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