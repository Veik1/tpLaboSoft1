package ejercicio4;

public class Administrador extends UsuarioBase {
    public Administrador(String nombreUsuario) {
        super(nombreUsuario);
    }

    @Override
    public String rol() {
        return "Administrador: Ver, Crear, Editar, Borrar";
    }

    @Override
    public void verContenido() {
        System.out.println(nombreUsuario + " (Administrador) está viendo todo el contenido");
    }

    @Override
    public void gestionarContenido() {
        System.out.println(nombreUsuario + " (Administrador) está gestionando todo el contenido: crear, editar, borrar");
    }
}
