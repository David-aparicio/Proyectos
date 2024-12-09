import java.time.LocalDate;

public class VideoDaw {
    private String cif;
    private String direccion;
    private LocalDate fechaAlta;
    private Pelicula [] peliculasRegistradas;
    private int nPeliculasRegistradas;
    private Cliente [] clientesRegistrados;
    private int nClientesRegistrados;

    public VideoDaw(String cif, String direccion ){
        this.cif = cif;
        this.direccion = direccion;
        this.fechaAlta = LocalDate.now();
        this.peliculasRegistradas = new Pelicula[100];
        this.clientesRegistrados = new Cliente[100];
        this.nPeliculasRegistradas = 0;
        this.nClientesRegistrados = 0;
    }

    public String getCif() {
        return cif;
    }
    
    public int getnPeliculasRegistradas() {
        return nPeliculasRegistradas;
    }

    public int getnClientesRegistrados() {
        return nClientesRegistrados;
    }

    public String getDireccion() {
        return direccion;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public Pelicula[] getPeliculasRegistradas() {
        return peliculasRegistradas;
    }

    public Cliente[] getClientesRegistrados() {
        return clientesRegistrados;
    }

    public String mostrarInfoVideoclub(){
        String infoVideoclub = String.format("Cif: %s, Direccion: %s, FechaAlta: %s, Peliculas registradas: %s, Clientes registrados: %s",
        this.cif, this.direccion, this.fechaAlta, this.nPeliculasRegistradas, this.nClientesRegistrados);
        return infoVideoclub;
    }
   
    public boolean registrarCliente(Cliente nuevoCliente){
        boolean isAdd = false;
        if(nuevoCliente != null){
            this.clientesRegistrados[nClientesRegistrados] = nuevoCliente;
            nClientesRegistrados++;
            isAdd = true;
        }
        return isAdd;
    }
    public String mostrarClientes(){
        String mostrarClientes = "";
        if(clientesRegistrados != null){   
        for(int i = 0; i < nClientesRegistrados; i++){
            System.out.println(i + "-" + clientesRegistrados[i].mostrarInfoCliente());
            }
        }
        return mostrarClientes;
    }
    public boolean nuevaPelicula(Pelicula nueva){
        boolean isAdd = false;
        if (nueva != null){
            this.peliculasRegistradas [nPeliculasRegistradas] = nueva;
            nPeliculasRegistradas++;
            isAdd = true;
        }
        return isAdd;
    }
    public String mostrarPeliculas(){
        String peliculasDisponibles = "";
        for(int i = 0; i < nPeliculasRegistradas; i++){
            System.out.println(i + peliculasRegistradas[i].mostrarInfoPelicula());
        }
       return peliculasDisponibles;
    }

    public String mostrarNoAlquiladas(){
        String peliculasNoAlquiladas = "";
        if(nPeliculasRegistradas > 0){
        for(int i = 0; i < nPeliculasRegistradas; i++){
            if (peliculasRegistradas[i].getIsAlquilada() == false){
                peliculasNoAlquiladas += (peliculasRegistradas[i].mostrarInfoPelicula());
            }
        }
        }else{
            peliculasNoAlquiladas = "No hay peliculas";
        }
        return peliculasNoAlquiladas;
    }

    public Pelicula posiciondelapeliculaArray(int i){
        return this.peliculasRegistradas[i];
    } 

    public Cliente clientesregistradosArray(int i){
        return this.clientesRegistrados[i];
    }
    public boolean alquilarPelicula(int c, int p){
        this.clientesregistradosArray(c);
        this.posiciondelapeliculaArray(p).Alquiler();
        boolean isAdd = false;
        return isAdd;
    }

    public boolean devolverPelicula(int c, int p){
        this.clientesregistradosArray(c);
        this.posiciondelapeliculaArray(p).Alquiler();
        boolean isRemoved = false;
        return isRemoved;
    }

    public boolean darBajaCliente(Cliente c, int numSocio){
        boolean isRemoved = false;
        if(this.clientesRegistrados != null){
            this.clientesRegistrados[numSocio] = null;
            for(int i = numSocio + 1; i < nClientesRegistrados; i++){
                this.clientesRegistrados [i-1] = this.clientesRegistrados[i];
            }
            this.clientesRegistrados [nClientesRegistrados-1] = null;
            nClientesRegistrados--;
            isRemoved = true;
        }
    return isRemoved;
    }

    public boolean darBajaPelicula(Pelicula p, int codigoPelicula){
        boolean isRemoved = false;
        if (codigoPelicula >= 0 && codigoPelicula < nPeliculasRegistradas) {
            this.peliculasRegistradas [codigoPelicula] = null;
            
            for(int i = codigoPelicula + 1; i < nPeliculasRegistradas; i++){
                this.peliculasRegistradas [i-1] = this.peliculasRegistradas[i];
            }
            this.peliculasRegistradas [nPeliculasRegistradas-1] = null;
            nPeliculasRegistradas--;
            isRemoved = true;
        }
    return isRemoved;
    }
}






