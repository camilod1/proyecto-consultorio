
package consultorio;



public class paciente {
    
    int cedula;
    String nombre;
    String apellido;
    String fechanacimiento;
    int edad;
    String sexo;
    String eps;
    String gruposanguineo;

//constructor
    public paciente(int cedula, String nombre, String apellido, String fechanacimiento, int edad, String sexo, String eps, String gruposangineo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechanacimiento = fechanacimiento;
        this.edad = edad;
        this.sexo = sexo;
        this.eps = eps;
        this.gruposanguineo = gruposangineo;
    }



//metodos get y set    
    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getGruposangineo() {
        return gruposanguineo;
    }

    public void setGruposangineo(String gruposangineo) {
        this.gruposanguineo = gruposangineo;
    }
    
            
    
}
