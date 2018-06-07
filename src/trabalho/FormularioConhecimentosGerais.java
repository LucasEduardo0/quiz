package trabalho;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;

public class FormularioConhecimentosGerais extends ConhecimentosGerais {

	public FormularioConhecimentosGerais() {
		JFrame contentPane = new JFrame();
		contentPane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.setBounds(100, 100, 450, 300);
		contentPane.getContentPane().setLayout(null);
		contentPane.setVisible(true);
		contentPane.setLocationRelativeTo(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(56, 93, 109, 23);
		rdbtnNewRadioButton.setActionCommand("New radio button");
		contentPane.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.setBounds(56, 119, 109, 23);
		rdbtnNewRadioButton_1.setActionCommand("New radio button");
		contentPane.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_2.setBounds(56, 145, 109, 23);
		rdbtnNewRadioButton_2.setActionCommand("New radio button");
		contentPane.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_3.setBounds(56, 171, 109, 23);
		rdbtnNewRadioButton_3.setActionCommand("New radio button");
		contentPane.getContentPane().add(rdbtnNewRadioButton_3);
		
		//ButtonGruop
		ButtonGroup turnos = new ButtonGroup();
		turnos.add(rdbtnNewRadioButton);
		turnos.add(rdbtnNewRadioButton_1);
		turnos.add(rdbtnNewRadioButton_2);
		turnos.add(rdbtnNewRadioButton_3);
		
		JButton btnResponder = new JButton("Responder");
		btnResponder.setBounds(76, 227, 89, 23);
		contentPane.getContentPane().add(btnResponder);
		
		JButton btnPular = new JButton("Pular");
		btnPular.setBounds(166, 227, 89, 23);
		contentPane.getContentPane().add(btnPular);
		
		JLabel lblPergunta = new JLabel("Pergunta");
		lblPergunta.setFont(new Font("Viner Hand ITC", Font.PLAIN, 20));
		lblPergunta.setBounds(10, 11, 140, 23);
		contentPane.getContentPane().add(lblPergunta);
		contentPane.setVisible(true);
		contentPane.setLocationRelativeTo(null);
		
	}
}