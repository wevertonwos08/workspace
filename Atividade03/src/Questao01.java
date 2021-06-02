import javax.swing.JOptionPane;

public class Questao01 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero"));

		int numAntes = 0;
		int numDepois = 2;

		if (num == num) {
			numAntes = --num;
			numDepois = num + numDepois;

		}

//
		JOptionPane.showMessageDialog(null, "o numeros vizinhos  são  " + numAntes + " e " + numDepois);

	}

}
