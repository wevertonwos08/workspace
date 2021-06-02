import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro numero "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Segundo numero "));

		int totalSoma = num1 + num2;

		JOptionPane.showMessageDialog(null, "a soma dos valores é " + totalSoma);

	}

}
