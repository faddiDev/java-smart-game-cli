/*
Author    : Faddi Susanto
*/

import java.io.*;
import java.util.*;

class lullaby {
	
	private String[][] store;
	private String[][] scoreS;
	private String[] islogin;
	private String[] isscore;
	private FileInputStream finput = null;
	private FileOutputStream foutput = null;
	
	lullaby() {
		FileInputStream finput = null;
		int data;
		String isi = "";
		try{
			finput = new FileInputStream("User.txt");
		}catch(IOException fnfe){
			System.out.println("File tidak ditemukan");
			return;
		}
		try{
			while((data = finput.read()) != -1){
				char d = (char) data;
				isi += d;
			}
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
			return;
		}
		try{
			finput.close();
		}catch(IOException ioe){}
		String[] arry = isi.split("\n");
		int len = arry.length;
		store = new String[len][7];
		for(int v=0;v<arry.length;v++){
			store[v] = arry[v].split(",");
		}
		FileInputStream finputS = null;
		int dataS;
		String isiS = "";
		try{
			finputS = new FileInputStream("Score.txt");
		}catch(IOException fnfe){
			System.out.println("File tidak ditemukan");
			return;
		}
		try{
			while((dataS = finputS.read()) != -1){
				char e = (char) dataS;
				isiS += e;
			}
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
			return;
		}
		try{
			finput.close();
		}catch(IOException ioe){}
		String[] arri = isiS.split("\n");
		int lens = arri.length;
		scoreS = new String[lens][7];
		for(int v=0;v<arri.length;v++){
			scoreS[v] = arri[v].split(",");
		}
	}
	
	public void login(String username,String password){
		for(int i=0;i<store.length;i++){
			if(store[i][0].equals(username) && store[i][1].equals(password)){
				islogin = store[i];
			}else{
				System.out.println("Username/Password Salah");
			}
		}
		for(int i=0;i<scoreS.length;i++){
			if(scoreS[i][0].equals(username)){
				isscore = scoreS[i];
			}else{
				System.out.println("Ada Kesalahan dalam login, contact Programmer aplikasi.");
			}
		}
		return;
	}
	
	public void logout(){
		islogin = null;
	}
	
	public boolean isLogin(){
		boolean login = false;
		if(islogin == null){
			login = false;
		}else{
			login = true;
		}
		return login;
	}
	
	public boolean isScore(){
		boolean score = false;
		if(isscore == null){
			score = false;
		}else{
			score = true;
		}
		return score;
	}
	
	public String[] user(){
		String[] user = null;
		if(isLogin()){
			user = islogin;
		}else{
			System.out.println("Error, ada kesalahan");
		}
		return user;
	}
	
	public String[] score(){
		String[] score = null;
		if(isScore()){
			score = isscore;
		}else{
			System.out.println("Error, ada kesalahan");
		}
		return score;
	}
	
	public void update(String[] arr){
		String data = "";
		for(int i=0;i<arr.length;i++){
			data = data + arr[i] + ",";
		}
		data = data + "\n";
		try{
			foutput = new FileOutputStream("User.txt",true);
		}catch(FileNotFoundException fnfe){
			System.out.println("File tidak dapat ditulis");
			return;
		}
		try{
			for(int i =0;i<data.length();i++){
				foutput.write((int)data.charAt(i));
			}
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
			return;
		}
		try{
			foutput.flush();
			foutput.close();
		}catch(IOException ioe){}
		String datas = "";
		datas = datas + arr[0] + "," + arr[2] + "," + "0" + "," +  "0" + "," + "0" + "," +  "0" + "," +  "0" + "," + "\n";
		try{
			foutput = new FileOutputStream("Score.txt",true);
		}catch(FileNotFoundException fnfe){
			System.out.println("File tidak dapat ditulis");
			return;
		}
		try{
			for(int i =0;i<datas.length();i++){
				foutput.write((int)datas.charAt(i));
			}
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
			return;
		}
		try{
			foutput.flush();
			foutput.close();
		}catch(IOException ioe){}
		
		return;
	}
	
	public void userCheck(){
		int data;
		try{
			finput = new FileInputStream("User.txt");
		}catch(FileNotFoundException fnfe){
			System.out.println("File tidak ditemukan");
			return;
		}
		try{
			while((data = finput.read()) != -1){
				System.out.print((char) data);
			}
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
			return;
		}
		try{
			finput.close();
		}catch(IOException ioe){}
		return;
	}
	
	public void scoreCheck(){
		int data;
		try{
			finput = new FileInputStream("Score.txt");
		}catch(FileNotFoundException fnfe){
			System.out.println("File tidak ditemukan");
			return;
		}
		try{
			while((data = finput.read()) != -1){
				System.out.print((char) data);
			}
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
			return;
		}
		try{
			finput.close();
		}catch(IOException ioe){}
		return;
	}
	
	public void updateScore(int position, String newString){
		if(isLogin()){
			String datas = "";
			for(int i=0;i<store.length;i++){
				isscore[position] = newString;
				datas += Arrays.toString(isscore).replace("[","").replace("]","").replace(" ","") + "\n";
			}
			try{
				foutput = new FileOutputStream("score.txt");
			}catch(FileNotFoundException fnfe){
				System.out.println("File Tidak Ditemukan");
			}
			try{
				for(int i=0;i<datas.length();i++){
					foutput.write((int) datas.charAt(i));
				}
			}catch(IOException ioe){
				System.out.println(ioe.getMessage());
			}
			try{
				foutput.flush();
				foutput.close();
			}catch(IOException ioe){
				System.out.println(ioe.getMessage());
			}
		}else{
			System.out.println("Error, ada kesalahan");
		}
		return;
	}
	
	public void deleteUser(String equal, int where){
		String datas = "";
		for(int i=0;i<store.length;i++){
			if(store[i][where].equals(equal)){
				store[i] = "null,null,null,null,null,null,null,".split(",");
			}
			datas += Arrays.toString(store[i]).replace("[","").replace("]","").replace(" ","") + "\n";
		}
		try{
			foutput = new FileOutputStream("User.txt");
		}catch(FileNotFoundException fnfe){
			System.out.println("File Tidak Ditemukan");
		}
		try{
			for(int i=0;i<datas.length();i++){
				foutput.write((int) datas.charAt(i));
			}
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
		try{
			foutput.flush();
			foutput.close();
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
		return;
	}
	
	public void deleteScore(String equal, int where){
		String datas = "";
		for(int i=0;i<store.length;i++){
			if(store[i][where].equals(equal)){
				store[i] = "null,null,null,null,null,null,".split(",");
			}
			datas += Arrays.toString(store[i]).replace("[","").replace("]","").replace(" ","") + "\n";
		}
		try{
			foutput = new FileOutputStream("Score.txt");
		}catch(FileNotFoundException fnfe){
			System.out.println("File Tidak Ditemukan");
		}
		try{
			for(int i=0;i<datas.length();i++){
				foutput.write((int) datas.charAt(i));
			}
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
		try{
			foutput.flush();
			foutput.close();
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
		return;
	}
}
