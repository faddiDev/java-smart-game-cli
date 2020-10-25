/*
Author    : Faddi Susanto
Important : You can edit or share this application but do 
            not do commercial as the author are not take credit from it
Penting   : Silahkan meng-edit atau membagikan aplikasi ini namun dilarang
            keras melakukan penjualan karena pencipta aplikasi tidak meminta uang
*/

import java.util.*;

class Antonim{
	
	private DB db;
	private List<Integer> Antonim = new ArrayList<>();
	private List<Character> awr = new ArrayList<>();
	private Character[] awrs;
	private List<Character> jwb = new ArrayList<>();
	private Character[] jwbn;
	private Integer[] beginAntonim;
	private Scanner scan;
	
	Antonim(){
		db = new DB();
		for(int i=0;i<10;i++){
			Antonim.add(i);
		}
		Collections.shuffle(Antonim);
		beginAntonim = Antonim.toArray(new Integer[Antonim.size()]);
		begin();
	}
	
	private void begin(){
		int i=0;
		while(i<10){
			int j = i+1;
			System.out.print(j + ". ");
			if(beginAntonim[i] == 0){ Antonim0(); }
			else if(beginAntonim[i] == 1){ Antonim1(); }
			else if(beginAntonim[i] == 2){ Antonim2(); }
			else if(beginAntonim[i] == 3){ Antonim3(); }
			else if(beginAntonim[i] == 4){ Antonim4(); }
			else if(beginAntonim[i] == 5){ Antonim5(); }
			else if(beginAntonim[i] == 6){ Antonim6(); }
			else if(beginAntonim[i] == 7){ Antonim7(); }
			else if(beginAntonim[i] == 8){ Antonim8(); }
			else if(beginAntonim[i] == 9){ Antonim9(); }
			i++;
		}
		awrs = awr.toArray(new Character[awr.size()]);
		jwbn = jwb.toArray(new Character[jwb.size()]);
		hasil();
	}
	
	private void Antonim0(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("laba >< ...");
		System.out.println("a. rugi\t\t\t\tc. Keuntungan");
		System.out.println("b. profit\t\t\td. Kerugian");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add((char) 97);
		jwb.add(jwbs.charAt(0));
		return;
	}
	
	private void Antonim1(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("muda >< ...");
		System.out.println("a. bujang\t\t\t\tc. belia");
		System.out.println("b. tua\t\t\t\td. anak muda");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add((char) 98);
		jwb.add(jwbs.charAt(0));
		return;
	}
	
	private void Antonim2(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("mudah >< ...");
		System.out.println("a. gampang\t\t\t\tc. sulit");
		System.out.println("b. enteng\t\t\t\td. mentah");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add((char) 99);
		jwb.add(jwbs.charAt(0));
		return;
	}
	
	private void Antonim3(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("netral >< ...");
		System.out.println("a. adil\t\t\t\tc. objektif");
		System.out.println("b. bebas\t\t\td. berpihak");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add((char) 100);
		jwb.add(jwbs.charAt(0));
		return;
	}
	
	private void Antonim4(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("menikah >< ...");
		System.out.println("a. bercerai\t\t\t\tc. berkawin");
		System.out.println("b. berjodoh\t\t\t\td. berkeluarga");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add((char) 97);
		jwb.add(jwbs.charAt(0));
		return;
	}
	
	private void Antonim5(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("optimis >< ...");
		System.out.println("a. yakin\t\t\t\tc. berpengharapan");
		System.out.println("b. pesimis\t\t\t\td. positif");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add((char) 98);
		jwb.add(jwbs.charAt(0));
		return;
	}
	
	private void Antonim6(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("panas >< ...");
		System.out.println("a. meriang\t\t\t\tc. dingin");
		System.out.println("b. demam\t\t\t\td. gerah");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add((char) 99);
		jwb.add(jwbs.charAt(0));
		return;
	}
	
	private void Antonim7(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("dahulu >< ...");
		System.out.println("a. awal\t\t\t\tc. lampau");
		System.out.println("b. dulu\t\t\t\td. sekarang");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add((char) 100);
		jwb.add(jwbs.charAt(0));
		return;
	}
	
	private void Antonim8(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("ilegal >< ...");
		System.out.println("a. gelap\t\t\t\tc. palsu");
		System.out.println("b. haram\t\t\t\td. legal");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add((char) 100);
		jwb.add(jwbs.charAt(0));
		return;
	}
	
	private void Antonim9(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("kontroversi >< ...");
		System.out.println("a. selaras\t\t\t\tc. perselisihan");
		System.out.println("b. percekcokan\t\t\t\td. silang pendapat");
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