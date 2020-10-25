/*
Author    : Faddi Susanto
Important : You can edit or share this application but do 
            not do commercial as the author are not take credit from it
Penting   : Silahkan meng-edit atau membagikan aplikasi ini namun dilarang
            keras melakukan penjualan karena pencipta aplikasi tidak meminta uang
*/

import java.util.*;

class QA{
	
	private DB db;
	private List<Integer> QA = new ArrayList<>();
	private List<Character> awr = new ArrayList<>();
	private Character[] awrs;
	private List<Character> jwb = new ArrayList<>();
	private Character[] jwbn;
	private Integer[] beginQA;
	private Scanner scan;
	
	QA(){
		db = new DB();
		for(int i=0;i<10;i++){
			QA.add(i);
		}
		Collections.shuffle(QA);
		beginQA = QA.toArray(new Integer[QA.size()]);
		begin();
	}
	
	private void begin(){
		int i=0;
		while(i<10){
			int j = i+1;
			System.out.print(j + ". ");
			if(beginQA[i] == 0){ QA0(); }
			else if(beginQA[i] == 1){ QA1(); }
			else if(beginQA[i] == 2){ QA2(); }
			else if(beginQA[i] == 3){ QA3(); }
			else if(beginQA[i] == 4){ QA4(); }
			else if(beginQA[i] == 5){ QA5(); }
			else if(beginQA[i] == 6){ QA6(); }
			else if(beginQA[i] == 7){ QA7(); }
			else if(beginQA[i] == 8){ QA8(); }
			else if(beginQA[i] == 9){ QA9(); }
			i++;
		}
		awrs = awr.toArray(new Character[awr.size()]);
		jwbn = jwb.toArray(new Character[jwb.size()]);
		hasil();
	}
	
	private void QA0(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("Siapakah nama seorang tokoh penemu dinamo?");
		System.out.println("a. Michael Faraday\t\t\tc. Albert Einstein");
		System.out.println("b. James Watt\t\t\t\td. Isaac Newton");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add((char) 97);
		jwb.add(jwbs.charAt(0));
		return;
	}
	
	private void QA1(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("Siapakah nama seorang tokoh penemu motor listrik?");
		System.out.println("a. Albert Einstein\t\t\t\tc. Nikola Tesla");
		System.out.println("b. Thomas Alva Edison\t\t\t\td. Michael Faraday");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add((char) 99);
		jwb.add(jwbs.charAt(0));
		return;
	}
	
	private void QA2(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("Seorang tokoh Presiden Amerika Serikat berjasa menghentikan perang saudara dan menghentikan perbudakan yang terjadi di Amerika pada masanya, siapakah nama tokoh Presiden tersebut?");
		System.out.println("a. John Kennedy\t\t\t\tc. George Washington");
		System.out.println("b. Abraham Lincoln\t\t\td. Jimmy Carter");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add((char) 98);
		jwb.add(jwbs.charAt(0));
		return;
	}
	
	private void QA3(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("Jatuh pada tanggal berapakah Indonesia merdeka di bulan agustus?");
		System.out.println("a. 14\t\t\t\tc. 16");
		System.out.println("b. 15\t\t\t\td. 17");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add((char) 100);
		jwb.add(jwbs.charAt(0));
		return;
	}
	
	private void QA4(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("Negara apakah yang dikenal sebagai negeri kanguru?");
		System.out.println("a. Inggris\t\t\t\tc. Australia");
		System.out.println("b. Indonesia\t\t\t\td. China");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add((char) 99);
		jwb.add(jwbs.charAt(0));
		return;
	}
	
	private void QA5(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("Manakah ibukota berikut yang tidak termasuk dalam provinsi Indonesia?");
		System.out.println("a. Jakarta\t\t\t\tc. Yogyakarta");
		System.out.println("b. Kuala Lumpur\t\t\t\td. Aceh");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add((char) 98);
		jwb.add(jwbs.charAt(0));
		return;
	}
	
	private void QA6(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("Manakah negara berikut yang tidak termasuk Benua Asia?");
		System.out.println("a. Mongolia\t\t\t\tc. Hong Kong");
		System.out.println("b. Singapura\t\t\t\td. Hongaria");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add((char) 100);
		jwb.add(jwbs.charAt(0));
		return;
	}
	
	private void QA7(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("Tokoh yang satu ini menyeberangi samudera Atlantik sampai ke benua Amerika, dan menemukan teori bahwa Bumi berbentuk bulat, siapakah nama tokoh ini?");
		System.out.println("a. Christoper Columbus\t\t\t\tc. Bartolomeuz Diaz");
		System.out.println("b. George Raymond\t\t\t\td. Jacob Van Neck");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add((char) 97);
		jwb.add(jwbs.charAt(0));
		return;
	}
	
	private void QA8(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("Berapa tahunkah lamanya Presiden Soeharto menjabat di Indonesia?");
		System.out.println("a. 1966-1998\t\t\t\tc. 1967-1997");
		System.out.println("b. 1967-1998\t\t\t\td. 1968-1999");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add((char) 98);
		jwb.add(jwbs.charAt(0));
		return;
	}
	
	private void QA9(){
		scan = new Scanner(System.in);
		String jwbs = "";
		System.out.println("Gunung paling tertinggi di dunia?");
		System.out.println("a. Gunung Annapurna\t\t\t\tc. Gunung Makalu");
		System.out.println("b. Gunung Manaslu\t\t\t\td. Gunung Everest");
		System.out.print("jawaban Anda : ");
		jwbs = scan.nextLine();
		System.out.print("\n");
		awr.add((char) 100);
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
	
	/*
	private void QA10(){
		scan = new Scanner(System.in);
		String jwb = "";
		System.out.println("1. ");
		System.out.println("");
		System.out.println("");
		System.out.println("jwban Anda : ");
		jwb = scan.nextLine();
	}
	
	private void QA11(){
		scan = new Scanner(System.in);
		String jwb = "";
		System.out.println("1. ");
		System.out.println("");
		System.out.println("");
		System.out.println("jwban Anda : ");
		jwb = scan.nextLine();
	}
	
	private void QA12(){
		scan = new Scanner(System.in);
		String jwb = "";
		System.out.println("1. ");
		System.out.println("jwban Anda : ");
		jwb = scan.nextLine();
	}
	
	private void QA13(){
		scan = new Scanner(System.in);
		String jwb = "";
		System.out.println("1. ");
		System.out.println("jwban Anda : ");
		jwb = scan.nextLine();
	}
	
	private void QA14(){
		scan = new Scanner(System.in);
		String jwb = "";
		System.out.println("1. ");
		System.out.println("jwban Anda : ");
		jwb = scan.nextLine();
	}
	
	private void QA15(){
		scan = new Scanner(System.in);
		String jwb = "";
		System.out.println("1. ");
		System.out.println("jwban Anda : ");
		jwb = scan.nextLine();
	}
	
	private void QA16(){
		scan = new Scanner(System.in);
		String jwb = "";
		System.out.println("1. ");
		System.out.println("jwban Anda : ");
		jwb = scan.nextLine();
	}
	
	private void QA17(){
		scan = new Scanner(System.in);
		String jwb = "";
		System.out.println("1. ");
		System.out.println("jwban Anda : ");
		jwb = scan.nextLine();
	}
	
	private void QA18(){
		scan = new Scanner(System.in);
		String jwb = "";
		System.out.println("1. ");
		System.out.println("jwban Anda : ");
		jwb = scan.nextLine();
	}
	
	private void QA19(){
		scan = new Scanner(System.in);
		String jwb = "";
		System.out.println("1. ");
		System.out.println("jwban Anda : ");
		jwb = scan.nextLine();
	}
	*/
}