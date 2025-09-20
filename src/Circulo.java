public class Circulo extends Figura{

    float radio;

    public Circulo(float radius) {
    radio = radius;
    }

    @Override
    public void calcularArea(){ //forma 2 del método (polimorfismo)
        float area = (float) (Math.PI * Math.pow(this.radio, 2)); //math pow devuelve double, convierto a float con (float)
        AreaFiguras = AreaFiguras + area;
    }
}
