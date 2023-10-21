import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataOutputStream;

import java.io.FileWriter;
import java.util.Scanner;

public class BufferWriteInFile {

	public static void writeIntoFiles() {
		Scanner sc = new Scanner(System.in);
		try (FileWriter fw = new FileWriter("String.txt")) {

			try (BufferedWriter bos = new BufferedWriter(fw)) {

				for (int i = 1; i <= 4; i++) {
					System.out.println("ENTER STRING :");
					String line = sc.nextLine();
					bos.write(line);
					bos.newLine();
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Files saved ...");
	}

	public static void main(String[] args) {

		writeIntoFiles();

	}

}
