public class Corredor extends Deportista{
    private double distancia;
    private double horasEntranamiento;

    public Corredor() {
    }

    public Corredor(double distancia, double horasEntranamiento) {
        this.distancia = distancia;
        this.horasEntranamiento = horasEntranamiento;
    }

    public Corredor(String nombre, int edad, String pais, int horasEntrenamiento, double distancia, double horasEntranamiento) {
        super(nombre, edad, pais, horasEntrenamiento);
        this.distancia = distancia;
        this.horasEntranamiento = horasEntranamiento;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getHorasEntranamiento() {
        return horasEntranamiento;
    }

    public void setHorasEntranamiento(double horasEntranamiento) {
        this.horasEntranamiento = horasEntranamiento;
    }

    @Override
    public String toString() {
        return "Corredor{" +
                "distancia=" + distancia +
                ", horasEntranamiento=" + horasEntranamiento +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", pais='" + pais + '\'' +
                ", horasEntrenamiento=" + horasEntrenamiento +
                '}';
    }
public double calcularVelocidad () {
        return distancia/horasEntranamiento;
}
@Override
    public double calcularRendimiento () {
        double velocidad = calcularVelocidad();
        return velocidad * horasEntrenamiento;
}
}
