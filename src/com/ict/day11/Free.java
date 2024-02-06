package com.ict.day11;

public class Free {
	private String name = "";
	private int kor = 0;
	private int eng = 0;
	private int math = 0;
	private int sum = 0;
	private double avg = 0.0;
	private String hak = "";
	private int rank = 1;
	
	public Free() {
		
	}
	
	
	public Free(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		sum();
	}


	public void sum() {
		sum = kor + eng + math;
		avg();
	}
	
	public void avg() {
		avg = (int)((sum/3.0)*10)/10.0;
		hak();
	}
	
	public void hak() {
		if(avg >= 90) {
			hak = "A학점";
		}else if(avg >= 80) {
			hak = "B학점";
		}else if(avg >= 70) {
			hak = "C학점";
		}else {
			hak = "F학점";
		}
	}


	public String getName() {
		return name;
	}


	public int getKor() {
		return kor;
	}


	public int getEng() {
		return eng;
	}


	public int getMath() {
		return math;
	}


	public int getSum() {
		return sum;
	}


	public double getAvg() {
		return avg;
	}


	public String getHak() {
		return hak;
	}


	public int getRank() {
		return rank;
	}
	
	
	
	
	
}
