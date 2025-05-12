package ejercicio4;

public abstract class UsuarioBase implements Usuario {
	
    protected String nombreUsuario;
    protected static int totalSesionesActivas = 0;
    public static final String NOMBRE_SISTEMA = "MiAppWeb";

    public UsuarioBase(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    @Override
    public void login() {
        // Implementación común para login
        System.out.println("Usuario " + nombreUsuario + " ha iniciado sesión en " + NOMBRE_SISTEMA);
        totalSesionesActivas++;
        System.out.println("Sesiones activas: " + totalSesionesActivas);
    }

    public abstract String rol();
}
