package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import vista.Interfaz;

public class Controlador extends Interfaz implements ActionListener {

	String nombre, telefono, email;

	public Controlador() {

		// Listeners
		aniadir.addActionListener(this);
		actualizar.addActionListener(this);
		borrar.addActionListener(this);

		// Escribir Contactos
		try {
			FileReader fr = new FileReader("contactos.txt");
			BufferedReader br = new BufferedReader(fr);

			do {
				lista.add(br.readLine());
			} while (br.readLine() != null);

		} catch (FileNotFoundException fnfe) {
			System.out.println("No encontrado");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Writer w = new Writer();

		String comando = e.getActionCommand();
		switch (comando) {
		case "Añadir":
			nombre = nombreTexto.getText();
			telefono = telefonoTexto.getText();
			email = emailTexto.getText();
			w.writeln(nombre + " - " + telefono + " - " + email);
			texto.setText(nombre + " - " + telefono + " - " + email);
			lista.add(nombre + " - " + telefono + " - " + email);
			break;
		case "Borrar":
			nombreTexto.setText(null);
			telefonoTexto.setText(null);
			emailTexto.setText(null);
			break;
			
		}
	}

}
