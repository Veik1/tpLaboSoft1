package ejercicio4;

public class Visitante extends UsuarioBase {
    public Visitante(String nombreUsuario) {
        super(nombreUsuario);
    }

    @Override
    public String rol() {
        return "Visitante: Ver";
    }

    @Override
    public void verContenido() {
        System.out.println(nombreUsuario + " (Visitante) está viendo contenido público");
    }

    @Override
    public void gestionarContenido() {
        System.out.println(nombreUsuario + " (Visitante) no tiene permisos para gestionar contenido");
    }
}
