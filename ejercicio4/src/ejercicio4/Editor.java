package ejercicio4;

public class Editor extends UsuarioBase {
    public Editor(String nombreUsuario) {
        super(nombreUsuario);
    }

    @Override
    public String rol() {
        return "Editor: Ver, Crear, Editar";
    }

    @Override
    public void verContenido() {
        System.out.println(nombreUsuario + " (Editor) está viendo contenido editable");
    }

    @Override
    public void gestionarContenido() {
        System.out.println(nombreUsuario + " (Editor) está editando contenido: crear y editar");
    }
}

