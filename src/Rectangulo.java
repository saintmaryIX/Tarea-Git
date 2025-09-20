public class Rectangulo extends Figura{

    float ancho;
    float alto;

    public Rectangulo(float width, float height) {
        ancho = width;
        alto = height;
    }


    @Override
    public void calcularArea(){ //forma 1 del método (polimorfismo)
        float area = ancho * alto;
        AreaFiguras = AreaFiguras + area;
    }
}