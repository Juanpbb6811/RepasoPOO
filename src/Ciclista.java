public class Ciclista extends Deportista{
    private double distancia;
    private double tiempo;
    private double desnivel;

    public Ciclista() {
    }

    public Ciclista(String nombre, int edad, String pais, int horasEntrenamiento) {
        super(nombre, edad, pais, horasEntrenamiento);
    }

    public Ciclista(double distancia, double tiempo, double desnivel) {
        this.distancia = distancia;
        this.tiempo = tiempo;
        this.desnivel = desnivel;
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

    public double getDesnivel() {
        return desnivel;
    }

    public void setDesnivel(double desnivel) {
        this.desnivel = desnivel;
    }

    @Override
    public String toString() {
        return "Ciclista{" +
                "distancia=" + distancia +
                ", tiempo=" + tiempo +
                ", desnivel=" + desnivel +
                '}';
    }

    @Override
    public double calcularRendimiento() {
        double velocidad = calcularVelocidad();
        return (velocidad*horasEntrenamiento)+(desnivel/100);
    }

    public  double calcularVelocidad () {
        return distancia/tiempo;
}


}
