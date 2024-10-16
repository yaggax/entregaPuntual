import com.coti.tools.Esdia;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.printf("|---------------------------------------------------|\r\n"   + //
                          "| MIS LIBROS                                        |\r\n"   + //
                          "|---------------------------------------------------|\r\n"   + //
                          "   1) Nuevo almacén de libros\r\n"                           + //
                          "   2) Establecer ritmo de lectura (páginas/minuto)\r\n"  + //
                          "   3) Añadir un nuevo libro al almacén\r\n"                  + //
                          "   4) Mostrar información actual de libros\r\n"              + //
                          "   5) Salir (se borrará toda la información)\r\n"            + //
                          "|---------------------------------------------------|");
        System.out.println();
        System.out.println();

        int opcion;

        do{
            opcion = Esdia.readInt("Que opción desea seleccionar?\n");
            System.out.println();

            switch (opcion) {
                case 1:
                    
                    break;
                
                case 2:

                    break;
                
                case 3:
                
                    break;

                case 4:

                    break;
                default:
                    System.out.println("Opcion no válida.");
                    break;
            }
        }while(opcion!=5);

        System.out.println("Saliendo del programa.");

    }
}
