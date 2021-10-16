package com.mdtanvirhossain.jp.ch10.javanio;

import java.nio.charset.Charset;
import java.util.Map;
import java.util.Set;

public class AvaiableChartset {

	public static void main(String[] args) {
		
		Map<String, Charset> map = Charset.availableCharsets();
		
		Set<String> keys = map.keySet();
		
		int count = keys.size();
		
		System.out.println("Available Characterset set count: "+count);
		
		for (String chartsetName : keys) {
			System.out.println(chartsetName);
		}
	}

}
