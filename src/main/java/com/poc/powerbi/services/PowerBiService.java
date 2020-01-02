package com.poc.powerbi.services;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.util.JSONPObject;

@Service
public class PowerBiService {

	// add PowerBi URL here
	private String uri = "";

	private String auth_token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6InBpVmxsb1FEU01LeGgxbTJ5Z3FHU1ZkZ0ZwQSIsImtpZCI6InBpVmxsb1FEU"
			+ "01LeGgxbTJ5Z3FHU1ZkZ0ZwQSJ9.eyJhdWQiOiJodHRwczovL2FuYWx5c2lzLndpbmRvd3MubmV0L3Bvd2VyYmkvYXBpIiwiaXNzIjoiaHR0cHM6Ly9zdHMud2l"
			+ "uZG93cy5uZXQvODMzMWUxNGEtOTEzNC00Mjg4LWJmNWEtNWUyYzg0MTJmMDc0LyIsImlhdCI6MTU3Nzc2MzIxMCwibmJmIjoxNTc3NzYzMjEwLCJleHAiOjE1Nzc"
			+ "3NjcxMTAsImFjY3QiOjAsImFjciI6IjEiLCJhaW8iOiJBU1FBMi84TkFBQUFMUVhqaU5MYXVaN1lHOG9HeWd5cTM1WHZVT2R6VGlQV3Rpa1FvQ2V1OFZ3PSIsImF"
			+ "tciI6WyJwd2QiXSwiYXBwaWQiOiI3ZjU5YTc3My0yZWFmLTQyOWMtYTA1OS01MGZjNWJiMjhiNDQiLCJhcHBpZGFjciI6IjIiLCJmYW1pbHlfbmFtZSI6IlNla2h"
			+ "hciIsImdpdmVuX25hbWUiOiJSYWphIiwiaXBhZGRyIjoiMTU4LjQ4LjQuMjIiLCJuYW1lIjoiU2VraGFyLCBSYWphIChOb25FbXApIiwib2lkIjoiYjM5MDgxN2It"
			+ "NjA1Zi00ZWJjLWE2MzQtZGRhZTMyNjkyZjRjIiwib25wcmVtX3NpZCI6IlMtMS01LTIxLTMyOTA2ODE1Mi03ODkzMzYwNTgtMTE3NzIzODkxNS0zMTE0MTc4Iiwi"
			+ "cHVpZCI6IjEwMDMwMDAwQUYzQzNGMTgiLCJzY3AiOiJ1c2VyX2ltcGVyc29uYXRpb24iLCJzdWIiOiItVXFnQkF3enp5dmpwczRlV01CbTRjbkpsV0YwNjVyMUdnM"
			+ "mJ3bnU4UDNjIiwidGlkIjoiODMzMWUxNGEtOTEzNC00Mjg4LWJmNWEtNWUyYzg0MTJmMDc0IiwidW5pcXVlX25hbWUiOiJyYWphLnNla2hhckBrcm9nZXIuY29tIiwi"
			+ "dXBuIjoicmFqYS5zZWtoYXJAa3JvZ2VyLmNvbSIsInV0aSI6IjNZN1RpaHJIUFVtdEZKeFlfOWNEQUEiLCJ2ZXIiOiIxLjAifQ.uS3xLyi2Sn8_MZ0tLRk8kaK_VGpE3"
			+ "I1NfUuMKcXbB0YQVbeuxr8zA2K7P2DP-ea6pdkQ0nREjIhmFaoTnBE3kwviuV_7x66T0PhWyOiMr-HuDZsjcFxOFjoTUWS4e6TKX3l29UOMZn2HaZCaLW-V7QI9O4GcL"
			+ "sFG0Bku_V5eOyBoOnhGg8m8ulc8DFwsUna6sS1nOuj1Mo-57457u8mg-Uc7-QX33ETRmz0ZjO3inkHYZCRAA4wGYYyfEW8H1ciVmlcekM7rjtIPBbqSTgB9rUiqwnX1EZ"
			+ "5Ks2aGuaBQYHSGNrkjcSq6QKxRa6Tsab1erlhL8_UGWL8jN8gu6WYUKA";

	public ResponseEntity<?> getJson(String parameter) {

		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.set("Bearer Token", auth_token);
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		ResponseEntity<JSONPObject> result = restTemplate.exchange(uri, HttpMethod.GET, entity, JSONPObject.class);

		System.out.println(result);
		return result;
	}
}
