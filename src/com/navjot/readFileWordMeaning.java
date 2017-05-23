package com.navjot;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readFileWordMeaning {
	private static final String FILENAME = "./wordmeaning.txt";

	public static void main(String[] args) {
		try {
			checkIfFileExists(FILENAME);
			printWordsMeanings(FILENAME);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void checkIfFileExists(String filename) throws FileNotFoundException {

		File f = new File(filename);
		if (!f.exists()) {
			throw new FileNotFoundException();
		}

	}

	public static void printWordsMeanings(String filename) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(filename));

		String sCurrentLine;

		while ((sCurrentLine = br.readLine()) != null) {
			String[] allwords = sCurrentLine.split(" - ");
			String word = allwords[0];
			System.out.println(word);
			String[] allmeanings = allwords[1].split(", ");
			for (String meaning : allmeanings) {
				System.out.println(meaning);
			}
		}
		
		br.close();

	}
}
