
package exerciciofixacao;


public class Temperatura {
    
    
    double converterParaCelsius(double tempFerenheit){
        double celsius = (tempFerenheit - 32) / 1.8;
        return celsius;
    }
    
    double converterParaFarenheit(double tempCelsius){
        double farenheit = tempCelsius * 1.8 + 32;
        return farenheit;
    }
    
}
