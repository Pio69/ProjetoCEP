package br.com.lvgrk.main;

import br.com.lvgrk.controller.JSONReader;

public class Main {

	public static void main(String[] args) {
		
		JSONReader reader = new JSONReader();
		
		System.out.println(reader.ReaderJSONViaCep("89108000"));
		
	}
	
}
