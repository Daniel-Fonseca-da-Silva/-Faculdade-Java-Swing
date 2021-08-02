package eventoDeTextoComAWT;

//Importacaoes
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

import java.awt.Label;
import java.awt.TextField;
import java.awt.Panel;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Button;
import java.awt.FlowLayout;

public class Tela implements TextListener, ActionListener {

	// Atributos privados da tela
	private Frame frmJanela;
	private Label lblCabecalho;
	private Label lblStatus;
	private Panel painelControle;
	private TextField txtTexto;

	public Tela() {
		prepareGUI();
	}

	private void prepareGUI() {
		// Janela
		frmJanela = new Frame("Exemplo de TextListener");
		frmJanela.setSize(400, 400);
		frmJanela.setLayout(new GridLayout(3, 1));// 3 linhas e 1 coluna
		frmJanela.addWindowListener(new OuvinteJanela());

		// lblCabecalho
		lblCabecalho = new Label();
		lblCabecalho.setAlignment(Label.CENTER);

		// lblStatus
		lblStatus = new Label();
		lblStatus.setAlignment(Label.CENTER);
		lblStatus.setSize(350, 100);

		// Painel contendo componentes
		painelControle = new Panel();
		painelControle.setLayout(new FlowLayout());

		frmJanela.add(lblCabecalho);
		frmJanela.add(painelControle);
		frmJanela.add(lblStatus);
		frmJanela.setVisible(true);
	}

	public void showTextListenerDemo() {
		lblCabecalho.setText("Tratamento de eventos TextListener em ação");

		txtTexto = new TextField(10);

		txtTexto.addTextListener(this);
		Button okButton = new Button("Ok");
		okButton.addActionListener(this);

		painelControle.add(txtTexto);
		painelControle.add(okButton);
		frmJanela.setVisible(true);
	}

	// Tratamento do texto digitado
	public void textValueChanged(TextEvent e) {
		lblStatus.setText("Voce digitou = " + txtTexto.getText());
	}

	// Tratamento do Botao
	public void actionPerformed(ActionEvent e) {
		lblStatus.setText("Continue digitando seu nome: " + txtTexto.getText());
	}

	// Classe adaptada que trata o fechamento do programa
	private class OuvinteJanela extends WindowAdapter {
		public void windowClosing(WindowEvent windowEvent) {
			System.out.println("Fechei a tela");
			System.exit(0);
		}
	}
}
