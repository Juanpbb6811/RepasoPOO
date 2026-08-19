public class Nadador extends Deportista{
    private double distancia;
    private double tiempo;
    private String estilo;

    public Nadador() {
    }

    public Nadador(double distancia, double tiempo, String estilo) {
        this.distancia = distancia;
        this.tiempo = tiempo;
        this.estilo = estilo;
    }

    public Nadador(String nombre, int edad, String pais, int horasEntrenamiento, double distancia, double tiempo, String estilo) {
        super(nombre, edad, pais, horasEntrenamiento);
        this.distancia = distancia;
        this.tiempo = tiempo;
        this.estilo = estilo;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return "Nadador{" +
                "distancia=" + distancia +
                ", tiempo=" + tiempo +
                ", estilo='" + estilo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", pais='" + pais + '\'' +
                ", horasEntrenamiento=" + horasEntrenamiento +
                '}';
    }

    @Override
    public double calcularRendimiento() {
        double velocidad = calcularVelocidad();
        return (velocidad+horasEntrenamiento)+(de)
    }

    public double calcularVelocidad () {
        return distancia/tiempo;
    }


}
