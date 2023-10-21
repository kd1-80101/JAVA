package com.sunbeam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BufferReadInFile {

	public static void writeIntoFiles() {
		Scanner sc = new Scanner(System.in);
		String str;
		try (FileReader fw = new FileReader("String.txt")) {

			try (BufferedReader bos = new BufferedReader(fw)) {

				while ((str = bos.readLine()) != null) {
					System.out.println(str);
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Files read ...");
	}

	public static void main(String[] args) {

		writeIntoFiles();

	}

}
