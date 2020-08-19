package br.com.lvgrk.controller;

import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import br.com.lvgrk.model.Endereco;

public class JSONReader {
	
	public Endereco ReaderJSONViaCep(String cep) {
		JSONObject objJson;
		JSONParser parser = new JSONParser();

		Endereco ende = new Endereco();

		try {

			URL url = new URL("https://viacep.com.br/ws/" + cep + "/json/");

			Reader reader = new InputStreamReader(url.openStream());

			objJson = (JSONObject) parser.parse(reader);

			ende.setCep((String) objJson.get("cep"));
			ende.setLogradouro((String) objJson.get("logradouro"));
			ende.setBairro((String) objJson.get("bairro"));
			ende.setLocalidade((String) objJson.get("localidade"));
			ende.setComplemento((String) objJson.get("complemento"));
			ende.setUf((String) objJson.get("uf"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ende;
		
	}
	
}
