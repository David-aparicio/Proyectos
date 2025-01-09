public class Planetas extends Astro{

    private double distanciaSol;
    private double orbitaAlSol;
    private boolean tieneSatelites;

    public Planetas(double masaDelCuerpo, double diametroMedio, double períodoRotaciónHoras, double períodoTraslaciónHoras, double distanciaMedia, double distanciaSol, double orbitaAlSol, boolean tieneSatelites) {
        super(masaDelCuerpo,diametroMedio,períodoRotaciónHoras,períodoTraslaciónHoras,distanciaMedia);

        this.distanciaSol = distanciaSol;
        this.orbitaAlSol = orbitaAlSol;
        this.tieneSatelites = tieneSatelites;
    }
      
    public double getDistanciaSol() {
        return distanciaSol;
    }

    public double getOrbitaAlSol() {
        return orbitaAlSol;
    }

    public boolean TieneSatelites() {
        return tieneSatelites;
    }


    public String monstrarInfoPlanetas(){
        String info = super.mostrarInfo();
        info += "Distancia al Sol: " + this.distanciaSol + " Orbita al Sol: " + this.orbitaAlSol + " ¿Tiene Satelites?: " + this.tieneSatelites ;
        return info;
    }

    public void test(){
        this.mostrarInfo();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Planeta{");
        sb.append("Masa del Cuerpo =").append(super.getMasaDelCuerpo());

        sb.append(", Diametro Medio =").append(super.getDiametroMedio());

        sb.append(", Periodo de Rotacion =").append(super.getDistanciaMedia());

        sb.append(", Período de traslación alrededor del cuerpo que orbitan =").append(super.getPeríodoRotaciónHoras());

        sb.append(", Distancia Media =").append(super.getPeríodoTraslaciónHoras());

        sb.append(", Distancia al Sol =").append(this.distanciaSol);

        sb.append(", Orbita al Sol =").append(this.orbitaAlSol);

        sb.append(", ¿Tiene satelites? =").append(this.tieneSatelites);

        sb.append('}');
        return sb.toString();
    }
    

}
