import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Apresentacao {

	private JFrame frame;
	private JTextField textField;
	private String formula = "";
	private String caracter;
	private Calculadora c = new Calculadora();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apresentacao window = new Apresentacao();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Apresentacao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.info);
		frame.setBackground(SystemColor.desktop);
		frame.setBounds(100, 100, 260, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 224, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		// Adiciona valores de 0 a 9 para a formula, um char de cada vez
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(10, 79, 50, 23);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formula += "7";
				textField.setText(formula);
			}
		});
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(69, 79, 50, 23);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formula += "8";
				textField.setText(formula);
			}
		});
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(128, 79, 50, 23);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formula += "9";
				textField.setText(formula);
			}
		});
		frame.getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(10, 112, 50, 23);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formula += "4";
				textField.setText(formula);
			}
		});
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(69, 113, 50, 23);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formula += "5";
				textField.setText(formula);
			}
		});
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(128, 113, 50, 23);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formula += "6";
				textField.setText(formula);
			}
		});
		frame.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(10, 146, 50, 23);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formula += "1";
				textField.setText(formula);
			}
		});
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formula += "2";
				textField.setText(formula);
			}
		});
		btn2.setBounds(69, 147, 50, 23);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(128, 147, 50, 23);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formula += "3";
				textField.setText(formula);
			}
		});
		frame.getContentPane().add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(69, 181, 50, 23);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formula += "0";
				textField.setText(formula);
			}
		});
		frame.getContentPane().add(btn0);
		
		// Adiciona os operadores matemáticos básicos (+,-,*,/)
		
		JButton btnSoma = new JButton("+");
		btnSoma.setBounds(187, 112, 50, 23);
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formula += "+";
				textField.setText(formula);
				caracter = "+"; // setta o caracter utilizado
			}
		});
		frame.getContentPane().add(btnSoma);
		
		JButton btnSubtracao = new JButton("-");
		btnSubtracao.setBounds(187, 78, 50, 23);
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formula += "-";
				textField.setText(formula);
				caracter = "-";
			}
		});
		frame.getContentPane().add(btnSubtracao);
		
		JButton btnMultiplicacao = new JButton("x");
		btnMultiplicacao.setBounds(187, 45, 50, 23);
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formula += "*";
				textField.setText(formula);
				caracter = "*";
			}
		});
		frame.getContentPane().add(btnMultiplicacao);
		
		JButton btnDivisao = new JButton("/");
		btnDivisao.setBounds(187, 148, 50, 23);
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formula += "/";
				textField.setText(formula);
				caracter = "/";
			}
		});
		frame.getContentPane().add(btnDivisao);
		
		// Adiciona pontuação para caso de número fracionado
		
		JButton btnPonto = new JButton(".");
		btnPonto.setBounds(127, 181, 50, 23);
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formula += ".";
				textField.setText(formula);
			}
		});
		frame.getContentPane().add(btnPonto);
		
		// Troca o sinal do primeiro número
		
		JButton btnTrocaSinal = new JButton("+/-");
		btnTrocaSinal.setBounds(10, 180, 50, 23);
		btnTrocaSinal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(formula.charAt(0)=='-') {
					formula = formula.replaceFirst("-", "");
				} else {
					formula = "-" + formula;
				}
				textField.setText(formula);
			}
		});
		frame.getContentPane().add(btnTrocaSinal);
		
		// Limpa o painel de escrita
		
		JButton btnLimpar = new JButton("C");
		btnLimpar.setBounds(128, 45, 50, 23);
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formula = "";
				textField.setText(formula);
			}
		});
		frame.getContentPane().add(btnLimpar);
		
		// Calcula a raiz quadrada do primeiro valor
		
		JButton btnRaizQuadrada = new JButton("\u221Ax");
		btnRaizQuadrada.setBounds(69, 45, 51, 23);
		btnRaizQuadrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formula += "r";
				caracter = "r";
				c.setEntrada(formula);
				c.filtroEntrada(caracter);
				formula = "" + c.getRaizQuadrada();
				textField.setText(formula);
			}
		});
		frame.getContentPane().add(btnRaizQuadrada);

		// Calcula a potencia quadrada do primeiro valor
		
		JButton btnPotenciaQuadrada = new JButton("x\u00B2");
		btnPotenciaQuadrada.setBounds(10, 45, 50, 23);
		btnPotenciaQuadrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formula += "p";
				caracter = "p";
				c.setEntrada(formula);
				c.filtroEntrada(caracter);
				formula = "" + c.getPotenciaQuadrada();
				textField.setText(formula);
			}
		});
		frame.getContentPane().add(btnPotenciaQuadrada);
		
		// Captura a formula e realiza a operação desejada
		
		JButton btnIgual = new JButton("=");
		btnIgual.setBackground(new Color(255, 204, 0));
		btnIgual.setBounds(187, 182, 50, 23);
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				c.setEntrada(formula);
				c.filtroEntrada(caracter);
				if(caracter.equals("+")) {
					formula = "" + c.getSoma();
					textField.setText(formula);
				} else if(caracter.equals("-")) {
					formula = "" + c.getSubtracao();
					textField.setText(formula);
				} else if(caracter.equals("*")) {
					formula = "" + c.getMultiplicacao();
					textField.setText(formula);
				} else if(caracter.equals("/")) {
					formula = "" + c.getDivisao();
					textField.setText(formula);
				}
				} catch(IllegalArgumentException iae){
					JOptionPane.showMessageDialog(frame, "Não é póssivel dividir por zero!");
				}
			}
		});
		frame.getContentPane().add(btnIgual);
	}
}
