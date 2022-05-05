
public class CalculadoraCientifica {
    
    public double raiz(int i1) {
        return Math.sqrt(i1);
    }
    public static double raiz (double d1) {
        return  Math.sqrt (d1);
    }
    public double raiz(String s1) {
        Double Resultado = Double.parseDouble(s1);
        return Math.sqrt (Resultado);
    }

    public Double potencia(int a, int b) {
        return Math.pow(a , b);
    }
    public double potencia(String s1, String s2) {
        Double Rs1= Double.parseDouble(s1);
        Double Rs2= Double.parseDouble(s2);
        return Math.pow (Rs1, Rs2);
    }
    public Double potencia(int a, double b) {
        return Math.pow(a , b);
    }
}
