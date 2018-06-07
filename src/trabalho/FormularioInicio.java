package trabalho;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class FormularioInicio extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public FormularioInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox<String> combo = new JComboBox();
		combo.setBounds(10, 174, 161, 20);
		combo.addItem("Selecione uma categoria");
		combo.addItem("Conhecimentos Gerais");
		combo.addItem("Filmes");
		combo.addItem("Esportes");
		contentPane.add(combo);
		
		JButton btnNewButton = new JButton("Vamos Jogar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(combo.getSelectedIndex() == 1) {
					
					FormularioConhecimentosGerais fcg = new FormularioConhecimentosGerais();
					dispose();
					
				}
				
			}
		});
		btnNewButton.setBounds(240, 106, 161, 44);
		contentPane.add(btnNewButton);
		
		JLabel lblQuiz = new JLabel("Quiz");
		lblQuiz.setFont(new Font("Viner Hand ITC", Font.PLAIN, 30));
		lblQuiz.setBounds(10, 11, 182, 44);
		contentPane.add(lblQuiz);
		
		textField = new JTextField();
		textField.setBounds(85, 66, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSelecionarOFormulario = new JLabel("Selecionar o Formulario");
		lblSelecionarOFormulario.setFont(new Font("Viner Hand ITC", Font.PLAIN, 15));
		lblSelecionarOFormulario.setBounds(10, 149, 161, 14);
		contentPane.add(lblSelecionarOFormulario);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Viner Hand ITC", Font.PLAIN, 15));
		lblNome.setBounds(10, 66, 46, 14);
		contentPane.add(lblNome);
		
		
	}
}