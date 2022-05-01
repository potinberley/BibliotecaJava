public class Persona {
    
    //atributos
    private String Nombre;
    private String Apellido;
    private Date FechaNacimiento;
    private String Rut;
    
    
     //constructor
    public Persona(String nombre, String apellido, Date fechaNacimiento, String rut) 
    {
        Nombre = nombre;
        Apellido = apellido;
        FechaNacimiento = fechaNacimiento;
        Rut = rut;
    }
    
    //accesores

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public String getRut() {
        return Rut;
    }
    
    //mutadores

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }
    
    
}
