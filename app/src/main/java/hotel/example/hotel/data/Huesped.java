package hotel.example.hotel.data;

public class Huesped {
    private String passsword;
    private String usuario;
    private String nombre;
    private String email;
    private long telefono;

    public Huesped(String passsword, String usuario, String nombre, String email, long telefono) {
        this.passsword = passsword;
        this.usuario = usuario;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public String getPasssword() {
        return passsword;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public long getTelefono() {
        return telefono;
    }
}
