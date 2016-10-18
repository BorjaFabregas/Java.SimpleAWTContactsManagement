package vista;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Interfaz extends Frame {
	
	
	// Botones
	public Button aniadir = new Button("Añadir");
	public Button actualizar = new Button("Actualizar");
	public Button borrar = new Button("Borrar");
	
	//Texto
	public Label name = new Label("Nombre:",FlowLayout.RIGHT);
	public Label tfno = new Label("Telefono:",FlowLayout.RIGHT);
	public Label mail = new Label("E-mail:",FlowLayout.RIGHT);
	public Label contacto = new Label("Contacto");

	//Campos de Texto
	public TextField nombreTexto = new TextField();
	public TextField telefonoTexto = new TextField();
	public TextField emailTexto = new TextField();
	
	
	public TextArea texto = new TextArea();

	public List lista = new List();

	public Interfaz() {

		super("Gestion de Contactos");

		//Cierre 
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        
        
		setLayout(new FlowLayout());
		this.setLocation(300, 200);
		this.setSize(400, 210);

		Panel panel = new Panel();
		panel.setLayout(new GridLayout(2, 1));
		panel.setSize(300, 300);

		Panel contactos = new Panel();
		contactos.setLayout(new GridLayout(1, 1));
		Panel newContacto = new Panel();
		newContacto.setLayout(new GridLayout(3,3));
	
		
		

		contactos.add(lista);
		newContacto.add(name);
		newContacto.add(nombreTexto);
		newContacto.add(aniadir);
		newContacto.add(tfno);
		newContacto.add(telefonoTexto);
		newContacto.add(actualizar);
		newContacto.add(mail);
		newContacto.add(emailTexto);
		newContacto.add(borrar);
		
		
		
		this.add(panel);
		panel.add(contactos, BorderLayout.NORTH);
		panel.add(newContacto, BorderLayout.SOUTH);

		this.setResizable(true);
		this.setVisible(true);

	}
}
