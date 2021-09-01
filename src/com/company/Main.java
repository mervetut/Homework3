package com.company;

public class Main {

    public static void main(String[] args) {
	int b = 5, a = 3;
	long result = 1;
	while (b != 0){
	    result *= a;
	    --b;
    }
        System.out.println("Answer: " + result);


    }
}
