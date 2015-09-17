
package consultorio;

@SuppressWarnings("FieldMayBeFinal")

public class historia_clinica {
    int idpaciente;
    int idmedico;
    String fecha;
    String consulta;
    String diagnostico;
    String tratamiento;

    public historia_clinica(int idpaciente, int idmedico, String fecha, String consulta, String diagnostico, String tratamiento) {
        this.idpaciente=idpaciente;
        this.idmedico=idmedico;
        this.fecha = fecha;
        this.consulta = consulta;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }


    
    
}
