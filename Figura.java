import java.util.ArrayList;
import java.util.List;

public interface Figura {
    void dibujar();
}

public class Cuadrado implements Figura {
    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado.");
    }
}

public class Circulo implements Figura {
    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo.");
    }
}

public class Triangulo implements Figura {
    @Override
    public void dibujar() {
        System.out.println("Dibujando un triángulo.");
    }
}

public class Figuras {
    private List<Figura> figuras = new ArrayList<>();

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    public void dibujarFiguras() {
        for (Figura figura : figuras) {
            figura.dibujar();
        }
    }
}

public class Main {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    public static void main(String[] args) {
        Figuras figuras = new Figuras();
        figuras.agregarFigura(new Circulo());
        figuras.agregarFigura(new Cuadrado());
        figuras.agregarFigura(new Triangulo());
        figuras.dibujarFiguras();
    }
}
