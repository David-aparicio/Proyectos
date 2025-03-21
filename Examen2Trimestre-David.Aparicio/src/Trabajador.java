    import java.time.LocalDate;
import java.time.LocalTime;

public class Trabajador extends Persona{

        private String numeroSS;
        private String email;
        private int salario;
        private departamentosTrabajador departamento;
        private boolean inOficina;


        public Trabajador(String nombre, LocalDate fechaNacimiento, String dni, String direccion, String numeroSS,
                String email, int salario, departamentosTrabajador departamento) {
            super(nombre, fechaNacimiento, dni, direccion);
            this.numeroSS = numeroSS;
            this.email = email;
            this.salario = salario;
            this.departamento = departamento;
            this.inOficina = inOficina;
        }

    public String getNumeroSS() {
        return numeroSS;
    }

    public String getEmail() {
        return email;
    }

    public int getSalario() {
        return salario;
    }

    public departamentosTrabajador getDepartamento() {
        return departamento;
    }

    public boolean isInOficina() {
        return inOficina;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trabajador{");
        sb.append("numeroSS=").append(numeroSS);
        sb.append(", email=").append(email);
        sb.append(", Salario=").append(salario);
        sb.append(", departamento=").append(departamento);
        sb.append(", inOficina=").append(inOficina);
        sb.append('}');
        return sb.toString();
    }


        public void actualizarEstado(){
        LocalTime ahora = LocalTime.now();
        LocalTime inicioTrabajador = LocalTime.of(9, 0);
        LocalTime finTrabajo = LocalTime.of(15, 0);
        this.inOficina = ahora.isAfter(inicioTrabajador) && ahora.isBefore(finTrabajo);
    }
}
