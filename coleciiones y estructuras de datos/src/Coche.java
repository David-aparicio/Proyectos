public class Coches {
    private String color;
    private String marca;

    
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Coches{");
        sb.append("color=").append(color);
        sb.append(", marca=").append(marca);
        sb.append('}');
        return sb.toString();
    }
    
    
}
