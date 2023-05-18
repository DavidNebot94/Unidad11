import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerNumeros {

    public static void main(String[] args) {
        int numeroEntero;
        int par;
        int inpar;

        File f = new File("C:/Users/David/IdeaProjects/Unidad11/src");

        try  (Scanner entrada = new Scanner(f)) {
            numeroEntero = entrada.nextInt();
            if ( numeroEntero % 2 == 0 )
            {
                numeroEntero = int par;
                System.out.printf( "ES PAR" );
            }
            else
            {
                numeroEntero = int inpar;
                System.out.printf( "ES IMPAR" );
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}