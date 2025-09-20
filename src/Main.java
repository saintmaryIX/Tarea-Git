//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        circulo.calcularArea();
        Rectangulo rectangulo = new Rectangulo(5, 10);
        rectangulo.calcularArea();


        System.out.println("El area total de las figuras es: " + Figura.AreaFiguras);

    }
}
