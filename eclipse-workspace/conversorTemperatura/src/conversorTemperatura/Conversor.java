package conversorTemperatura;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Conversor {
	//criação das variáveis
			private double celsius;
			private double fahrenheit;
			private double kelvin;
			private static DecimalFormat df = new DecimalFormat("#.##");
			
			//construtores
			public Conversor(double celsius, double farenheit, double kelvin) {
				this.celsius = celsius;
				this.fahrenheit = farenheit;
				this.kelvin = kelvin;
			}

			//get e set das variáveis
			public double getCelsius() {
				return celsius;
			}

			public void setCelsius(double celsius) {
				this.celsius = celsius;
			}

			public double getFarenheit() {
				return fahrenheit;
			}

			public void setFarenheit(double farenheit) {
				this.fahrenheit = farenheit;
			}

			public double getKelvin() {
				return kelvin;
			}

			public void setKelvin(double kelvin) {
				this.kelvin = kelvin;
			}
			
			//fórmula de conversão de Celsius para Fahrenheit
			public static void exibirTemperaturaFahrenheit(double celsius, double fahrenheit) {
				fahrenheit = (celsius * 1.8) + 32;
				JOptionPane.showMessageDialog(null, "A temperatura " +celsius+ "° Celsius é igual a " +df.format(fahrenheit)+ "° Fahrenheit.");
			}
			
			//fórmula de conversão de celsius para kelvin
			public static void  exibirTemperaturaKelvin(double celsius, double kelvin) {
				kelvin = celsius + 273;
				JOptionPane.showMessageDialog(null, "A temperatura " +celsius+ "° Celsius é igual a " +df.format(kelvin)+ " Kelvin.");
			}
}
