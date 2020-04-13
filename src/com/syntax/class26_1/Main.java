package com.syntax.class26_1;

public class Main implements Functions {
	double firstNumber=100;
	double secondNumber=20;
	@Override
	public void display(double result) {
		System.out.println("Result is ::: "+result);	
	}

	@Override
	public double adding(int firstNumber, int secondNumber) {
		int result=firstNumber + secondNumber;
		return result;
	}

	@Override
	public double subtracting(int firstNumber, int secondNumber) {
		int result=firstNumber - secondNumber;
		return result;
	}

	@Override
	public double multiply(int firstNumber, int secondNumber) {
		int result=firstNumber * secondNumber;
		return result;
	}

	@Override
	public double dividing(int firstNumber, int secondNumber) {
		int result=firstNumber / secondNumber;
		return result;
	}
	
	public static void main(String[] args) {
		
		Main nn=new Main();
		double[] num= {nn.adding(100, 20), nn.subtracting(100, 20), nn.multiply(100, 20), nn.dividing(100, 20)};
		for(double result:num) {
			nn.display(result);
		}
	}

}
