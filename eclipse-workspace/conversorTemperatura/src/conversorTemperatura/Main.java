package conversorTemperatura;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
			
		//obtém a temperatura em Celsius
		double tempCelsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em graus Celsius:"));
	
		String[] opcoes = { "Escolha uma opção", "Fahrenheit", "Kelvin" };
	
		//exibe a caixa de diálogo com as opções
		String escolha = (String) JOptionPane.showInputDialog(null,
				"Para qual temperatura deseja converter?:",
				"Caixa de Escolha",
				JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]
				);
					
		if(escolha != null) {
			switch(escolha) {
				case "Fahrenheit":
					Conversor.exibirTemperaturaFahrenheit(tempCelsius, 0);
					break;
			        	
				case "Kelvin":
					Conversor.exibirTemperaturaKelvin(tempCelsius, 0);
					break;
			}
		}else {
			JOptionPane.showMessageDialog(null, "Nenhuma opção foi selecionada.");
		}
	}
}