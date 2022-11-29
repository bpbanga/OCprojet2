package com.hemebiotech.analytics;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class AnalyticsCounter {

	public static void main(String args[])
			
			throws Exception {
		ReadSymptomDataFromFile readSymptom = new ReadSymptomDataFromFile("symptoms.txt");
		
		
		// next generate output a extraire
		FileWriter writer = new FileWriter ("result.out");
		for(String symptom : readSymptom.GetSymptoms()) {
			writer.write(symptom + "\n");
		}
		
		writer.close();
	}
}
