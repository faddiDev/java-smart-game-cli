/*
Author    : Faddi Susanto
*/

import java.util.*;

class Math{
	
	private DB db;
	private List<Integer> MATH = new ArrayList<>();
	private List<Float> awrs = new ArrayList<>();
	private List<Float> jwbn = new ArrayList<>();
	private Integer[] beginMath;
	private Scanner scan;
	private int[] difficulty;
	private Float[] awr;
	private Float[] jwbs;
	private Random rand;
	
	Math(){
		db = new DB();
		for(int i=0;i<10;i++){
			MATH.add(i);
		}
		Collections.shuffle(MATH);
		beginMath = MATH.toArray(new Integer[MATH.size()]);
		init();
	}
	
	private void init(){
		int pil;
		scan = new Scanner(System.in);
		System.out.println("Tingkat Kesulitan : ");
		System.out.println("1. mudah");
		System.out.println("2. normal");
		System.out.println("3. sulit");
		System.out.print("Pilih tingkat kesulitan : ");
		pil = scan.nextInt();
		System.out.print("\n");
		difficulty = new int[]{pil};
		begin();
		return;
	}
	
	private void begin(){
		if(difficulty == null){
			System.out.println("Ada kesalahan, contact Programmer aplikasi.");
		}else{
			int pil = difficulty[0];
			int i=0;
			while(i<10){
				int j = i+1;
				System.out.print(j + ". ");
				if(beginMath[i] == 0){ Math0(pil); }
				else if(beginMath[i] == 1){ Math1(pil); }
				else if(beginMath[i] == 2){ Math2(pil); }
				else if(beginMath[i] == 3){ Math3(pil); }
				else if(beginMath[i] == 4){ Math4(pil); }
				else if(beginMath[i] == 5){ Math5(pil); }
				else if(beginMath[i] == 6){ Math6(pil); }
				else if(beginMath[i] == 7){ Math7(pil); }
				else if(beginMath[i] == 8){ Math8(pil); }
				else if(beginMath[i] == 9){ Math9(pil); }
				i++;
			}
			awr = awrs.toArray(new Float[awrs.size()]);
			jwbs = jwbn.toArray(new Float[jwbn.size()]);
			hasil();
		}
	}
	
	private void Math0(int i){
		rand = new Random();
		float onQA1 = rand.nextInt(100);
		float onQA2 = rand.nextInt(100);
		float onQA3 = rand.nextInt(100);
		scan = new Scanner(System.in);
		if(i == 1){
			float awr = onQA1 + onQA2;
			float jwb;
			System.out.println(onQA1 + " + " + onQA2 + " = ?");
			System.out.print("Jawaban anda : ");
			jwb = scan.nextFloat();
			jwbn.add(jwb);
			awrs.add(awr);
		}else if(i == 2){
			float awr = onQA1 * onQA2;
			float jwb;
			System.out.println(onQA1 + " x " + onQA2 + " = ?");
			System.out.print("Jawaban anda : ");
			jwb = scan.nextFloat();
			jwbn.add(jwb);
			awrs.add(awr);
		}else if(i == 3){
			float awr = (onQA1 * onQA2) + onQA3;
			float jwb;
			System.out.println(onQA1 + " x " + onQA2 + " + " + onQA3 + " = ?");
			System.out.print("Jawaban anda : ");
			jwb = scan.nextFloat();
			jwbn.add(jwb);
			awrs.add(awr);
		}
		return;
	}
	
	private void Math1(int i){
		rand = new Random();
		float onQA1 = rand.nextInt(100);
		float onQA2 = rand.nextInt(25);
		float onQA3 = rand.nextInt(50);
		onQA1 = (onQA1 < onQA2) ? rand.nextInt(100) : onQA1;
		scan = new Scanner(System.in);
		if(i == 1){
			float awr = onQA1 - onQA2;
			float jwb;
			System.out.println(onQA1 + " - " + onQA2 + " = ?");
			System.out.print("Jawaban anda : ");
			jwb = scan.nextFloat();
			jwbn.add(jwb);
			awrs.add(awr);
		}else if(i == 2){
			float awr = onQA1 / onQA2;
			float jwb;
			System.out.println(onQA1 + " % " + onQA2 + " = ?");
			System.out.print("Jawaban anda : ");
			jwb = scan.nextFloat();
			jwbn.add(jwb);
			awrs.add(awr);
		}else if(i == 3){
			float awr = (onQA1 * onQA2) / onQA3;
			float jwb;
			System.out.println(onQA1 + " x " + onQA2 + " % " + onQA3 + " = ?");
			System.out.print("Jawaban anda : ");
			jwb = scan.nextFloat();
			jwbn.add(jwb);
			awrs.add(awr);
		}
		return;
	}
	
	private void Math2(int i){
		rand = new Random();
		float onQA1 = rand.nextInt(100);
		float onQA2 = rand.nextInt(50);
		float onQA3 = rand.nextInt(100);
		onQA1 = (onQA1 < onQA2) ? rand.nextInt(100) : onQA1;
		scan = new Scanner(System.in);
		if(i == 1){
			float awr = onQA1 + onQA2;
			float jwb;
			System.out.println(onQA1 + " + " + onQA2 + " = ?");
			System.out.print("Jawaban anda : ");
			jwb = scan.nextFloat();
			jwbn.add(jwb);
			awrs.add(awr);
		}else if(i == 2){
			float awr = onQA1 / onQA2;
			float jwb;
			System.out.println(onQA1 + " % " + onQA2 + " = ?");
			System.out.print("Jawaban anda : ");
			jwb = scan.nextFloat();
			jwbn.add(jwb);
			awrs.add(awr);
		}else if(i == 3){
			float awr = (onQA1 % onQA2) + onQA3;
			float jwb;
			System.out.println(onQA1 + " % " + onQA2 + " + " + onQA3 + " = ?");
			System.out.print("Jawaban anda : ");
			jwb = scan.nextFloat();
			jwbn.add(jwb);
			awrs.add(awr);
		}
		return;
	}
	
	private void Math3(int i){
		rand = new Random();
		float onQA1 = rand.nextInt(100);
		float onQA2 = rand.nextInt(100);
		float onQA3 = rand.nextInt(100);
		scan = new Scanner(System.in);
		if(i == 1){
			float awr = onQA1 + onQA2;
			float jwb;
			System.out.println(onQA1 + " + " + onQA2 + " = ?");
			System.out.print("Jawaban anda : ");
			jwb = scan.nextFloat();
			jwbn.add(jwb);
			awrs.add(awr);
		}else if(i == 2){
			float awr = onQA1 * onQA2;
			float jwb;
			System.out.println(onQA1 + " x " + onQA2 + " = ?");
			System.out.print("Jawaban anda : ");
			jwb = scan.nextFloat();
			jwbn.add(jwb);
			awrs.add(awr);
		}else if(i == 3){
			float awr = (onQA1 * onQA2) - onQA3;
			float jwb;
			System.out.println(onQA1 + " x " + onQA2 + " - " + onQA3 + " = ?");
			System.out.print("Jawaban anda : ");
			jwb = scan.nextFloat();
			jwbn.add(jwb);
			awrs.add(awr);
		}
		return;
	}
	
	private void Math4(int i){
		rand = new Random();
		float onQA1 = rand.nextInt(100);
		float onQA2 = rand.nextInt(50);
		float onQA3 = rand.nextInt(100);
		onQA1 = (onQA1 < onQA2) ? rand.nextInt(100) : onQA1;
		scan = new Scanner(System.in);
		if(i == 1){
			float awr = onQA1 - onQA2;
			float jwb;
			System.out.println(onQA1 + " + " + onQA2 + " = ?");
			System.out.print("Jawaban anda : ");
			jwb = scan.nextFloat();
			jwbn.add(jwb);
			awrs.add(awr);
		}else if(i == 2){
			float awr = onQA1 / onQA2;
			float jwb;
			System.out.println(onQA1 + " % " + onQA2 + " = ?");
			System.out.print("Jawaban anda : ");
			jwb = scan.nextFloat();
			jwbn.add(jwb);
			awrs.add(awr);
		}else if(i == 3){
			float awr = (onQA1 * onQA2) - onQA3;
			float jwb;
			System.out.println(onQA1 + " x " + onQA2 + " - " + onQA3 + " = ?");
			System.out.print("Jawaban anda : ");
			jwb = scan.nextFloat();
			jwbn.add(jwb);
			awrs.add(awr);
		}
		return;
	}
	
	private void Math5(int i){
		rand = new Random();
		float onQA1 = rand.nextInt(100);
		float onQA2 = rand.nextInt(100);
		float onQA3 = rand.nextInt(100);
		scan = new Scanner(System.in);
		if(i == 1){
			float awr = onQA1 + onQA2;
			float jwb;
			System.out.println(onQA1 + " + " + onQA2 + " = ?");
			System.out.print("Jawaban anda : ");
			jwb = scan.nextFloat();
			jwbn.add(jwb);
			awrs.add(awr);
		}else if(i == 2){
			float awr = onQA1 * onQA2;
			float jwb;
			System.out.println(onQA1 + " x " + onQA2 + " = ?");
			System.out.print("Jawaban anda : ");
			jwb = scan.nextFloat();
			jwbn.add(jwb);
			awrs.add(awr);
		}else if(i == 3){
			float awr = (onQA1 * onQA2) + onQA3;
			float jwb;
			System.out.println(onQA1 + " x " + onQA2 + " + " + onQA3 + " = ?");
			System.out.print("Jawaban anda : ");
			jwb = scan.nextFloat();
			jwbn.add(jwb);
			awrs.add(awr);
		}
		return;
	}
	
	private void Math6(int i){
		rand = new Random();
		float onQA1 = rand.nextInt(100);
		float onQA2 = rand.nextInt(100);
		float onQA3 = rand.nextInt(100);
		scan = new Scanner(System.in);
		if(i == 1){
			float awr = onQA1 - onQA2;
			float jwb;
			System.out.println(onQA1 + " - " + onQA2 + " = ?");
			System.out.print("Jawaban anda : ");
			jwb = scan.nextFloat();
			jwbn.add(jwb);
			awrs.add(awr);
		}else if(i == 2){
			float awr = onQA1 * onQA2;
			float jwb;
			System.out.println(onQA1 + " x " + onQA2 + " = ?");
			System.out.print("Jawaban anda : ");
			jwb = scan.nextFloat();
			jwbn.add(jwb);
			awrs.add(awr);
		}else if(i == 3){
			float awr = (onQA1 * onQA2) + onQA3;
			float jwb;
			System.out.println(onQA1 + " x " + onQA2 + " + " + onQA3 + " = ?");
			System.out.print("Jawaban anda : ");
			jwb = scan.nextFloat();
			jwbn.add(jwb);
			awrs.add(awr);
		}
		return;
	}
	private void Math7(int i){
		rand = new Random();
		float onQA1 = rand.nextInt(100);
		float onQA2 = rand.nextInt(100);
		float onQA3 = rand.nextInt(100);
		scan = new Scanner(System.in);
		if(i == 1){
			float awr = onQA1 + onQA2;
			float jwb;
			System.out.println(onQA1 + " + " + onQA2 + " = ?");
			System.out.print("Jawaban anda : ");
			jwb = scan.nextFloat();
			jwbn.add(jwb);
			awrs.add(awr);
		}else if(i == 2){
			float awr = onQA1 * onQA2;
			float jwb;
			System.out.println(onQA1 + " x " + onQA2 + " = ?");
			System.out.print("Jawaban anda : ");
			jwb = scan.nextFloat();
			jwbn.add(jwb);
			awrs.add(awr);
		}else if(i == 3){
			float awr = (onQA1 + onQA2) - onQA3;
			float jwb;
			System.out.println(onQA1 + " + " + onQA2 + " - " + onQA3 + " = ?");
			System.out.print("Jawaban anda : ");
			jwb = scan.nextFloat();
			jwbn.add(jwb);
			awrs.add(awr);
		}
		return;
	}
	
	private void Math8(int i){
		rand = new Random();
		float onQA1 = rand.nextInt(100);
		float onQA2 = rand.nextInt(100);
		scan = new Scanner(System.in);
		if(i == 1){
			float awr = onQA1 + onQA2;
			float jwb;
			System.out.println(onQA1 + " + " + onQA2 + " = ?");
			System.out.print("Jawaban anda : ");
			jwb = scan.nextFloat();
			jwbn.add(jwb);
			awrs.add(awr);
		}else if(i == 2){
			float awr = onQA1 * onQA2;
			float jwb;
			System.out.println(onQA1 + " x " + onQA2 + " = ?");
			System.out.print("Jawaban anda : ");
			jwb = scan.nextFloat();
			jwbn.add(jwb);
			awrs.add(awr);
		}else if(i == 3){
			float awr = (onQA1 * onQA2) - (onQA1 * onQA2);
			float jwb;
			System.out.println(" (" + onQA1 + " x " + onQA2 + ") - (" + onQA1 + " x " + onQA2 + ") = ?");
			System.out.print("Jawaban anda : ");
			jwb = scan.nextFloat();
			jwbn.add(jwb);
			awrs.add(awr);
		}
		return;
	}
	
	private void Math9(int i){
		rand = new Random();
		float onQA1 = rand.nextInt(100);
		float onQA2 = rand.nextInt(100);
		float onQA3 = rand.nextInt(100);
		scan = new Scanner(System.in);
		if(i == 1){
			float awr = onQA1 + onQA2;
			float jwb;
			System.out.println(onQA1 + " + " + onQA2 + " = ?");
			System.out.print("Jawaban anda : ");
			jwb = scan.nextFloat();
			jwbn.add(jwb);
			awrs.add(awr);
		}else if(i == 2){
			float awr = onQA1 * onQA2;
			float jwb;
			System.out.println(onQA1 + " x " + onQA2 + " = ?");
			System.out.print("Jawaban anda : ");
			jwb = scan.nextFloat();
			jwbn.add(jwb);
			awrs.add(awr);
		}else if(i == 3){
			float awr = (onQA1 + onQA2) - onQA3;
			float jwb;
			System.out.println(onQA1 + " + " + onQA2 + " - " + onQA3 + " = ?");
			System.out.print("Jawaban anda : ");
			jwb = scan.nextFloat();
			jwbn.add(jwb);
			awrs.add(awr);
		}
		return;
	}
	
	public int hasil(){
		int score=0;
		if(awr == null && jwbs == null){
			System.out.println("Ada kesalahan, contact Programmer aplikasi.");
		}else{
			int i=0;
			while(i<10){
				if(awr[i].equals(jwbs[i])){
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
	private void Math10(){}
	private void Math11(){}
	private void Math12(){}
	private void Math13(){}
	private void Math14(){}
	private void Math15(){}
	private void Math16(){}
	private void Math17(){}
	private void Math18(){}
	private void Math19(){}
	*/
}