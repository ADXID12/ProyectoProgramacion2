package proyectominiaccess_practica;
public class Usuarios {
    private String nombre;
    private String password;
    private boolean especial;
    
    public Usuarios() {
    }

    public Usuarios(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }

    public Usuarios(String nombre, String password, boolean especial) {
        this.nombre = nombre;
        this.password = password;
        this.especial = especial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    @Override
    public String toString() {
        return "User: " + nombre + "\n"
                + "Password: " + password;
    }
    
}
