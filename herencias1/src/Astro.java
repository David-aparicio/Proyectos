public class Astro {

    private double diametroMedio;
    private double masaDelCuerpo;
    private double distanciaMedia;
    private double períodoRotaciónHoras;
    private double períodoTraslaciónHoras;

    public Astro(double  masaDelCuerpo, double  diametroMedio, double  períodoRotaciónHoras, double  períodoTraslaciónHoras, double  distanciaMedia) {
        this.masaDelCuerpo = masaDelCuerpo;
        this.diametroMedio = diametroMedio;
        this.períodoRotaciónHoras = períodoRotaciónHoras;
        this.períodoTraslaciónHoras = períodoTraslaciónHoras;
        this.distanciaMedia = distanciaMedia;
    }

    public String mostrarInfo(){
        String info;
        info = "Masa del cuerpo.: "+this.masaDelCuerpo+" Diámetro medio: "+this.diametroMedio+" Período de rotación sobre su propio eje: "+
        this.períodoRotaciónHoras+" Período de traslación alrededor del cuerpo que orbitan: "+this.períodoTraslaciónHoras + " Distancia media a ese cuerpo: "+this.distanciaMedia;
        return info;
    }

    

    public double getMasaDelCuerpo() {
        return masaDelCuerpo;
    }

    public double getDiametroMedio(){
        return diametroMedio;
    }

    public double getDistanciaMedia(){
        return this.distanciaMedia;
    }

    public double getPeríodoRotaciónHoras() {
        return períodoRotaciónHoras;
    }

    public double getPeríodoTraslaciónHoras() {
        return períodoTraslaciónHoras;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Persona{");

        sb.append("Masa del Cuerpo=").append(masaDelCuerpo);

        sb.append(", Diametro Medio=").append(diametroMedio);

        sb.append(", Periodo de Rotacion =").append(períodoRotaciónHoras);

        sb.append(", Período de traslación =").append(períodoTraslaciónHoras);

        sb.append(", Distancia Media =").append(distanciaMedia);

        sb.append('}');
        
        return sb.toString();
    }
}
