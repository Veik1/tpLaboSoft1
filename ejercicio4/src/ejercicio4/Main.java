package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Usuario> usuarios = new ArrayList<>();
        
        // Crear usuarios de diferentes tipos
        usuarios.add(new Administrador("admin1"));
        usuarios.add(new Editor("editor1"));
        usuarios.add(new Editor("editor2"));
        usuarios.add(new Visitante("invitado1"));
        usuarios.add(new Visitante("invitado2"));

        // Simular interacción polimórfica
        for (Usuario usuario : usuarios) {
            System.out.println("--- Interacción con " + ((UsuarioBase)usuario).nombreUsuario + " ---");
            usuario.login();
            System.out.println(((UsuarioBase)usuario).rol());
            usuario.verContenido();
            usuario.gestionarContenido();
            System.out.println();
        }
    }
}