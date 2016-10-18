package controlador;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

	public void writeln(String str) {
		FileWriter fw;
		BufferedWriter bw;
		try {
			fw = new FileWriter("contactos.txt", true);
			bw = new BufferedWriter(fw);

			bw.write(str + "\n");

			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void write(String str) {
		FileWriter fw;
		BufferedWriter bw;
		try {
			fw = new FileWriter("contactos.txt", true);
			bw = new BufferedWriter(fw);

			bw.write(str);

			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
