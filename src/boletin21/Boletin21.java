
package boletin21;

import Clases.*;
import Utilidades.pedirDatos;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author raguiarperez
 */
public class Boletin21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Erro {
        ArrayList<Libros> lista = new ArrayList<>();
        libreria obx = new libreria();
        String op;
        do {
            op = pedirDatos.string("****MENU****"
                    + "\nEngadir"
                    + "\nVer"
                    + "\nVender"
                    + "\nBaixa"
                    + "\nOrdenar"
                    + "\nConsultar");
            switch (op) {
                case "Engadir":
                    obx.engadir(lista);
                    break;
                case "Ver":
                    System.out.println("\n\n\n\n\n");
                    obx.forIterator(lista);
                    break;
                case "Vender":
                    obx.vender(pedirDatos.enteiro("Posicion")-1, lista);
                    break;
                case "Baixa":
                    obx.baixa(pedirDatos.enteiro("Unidades"), lista);
                    break;
                case "Ordenar":
                    Collections.sort(lista);
                    break;
                case "Buscar":
                    obx.consultar(pedirDatos.string("Titulo"), lista);
                    break;
            }
        } while (!"Sair".equalsIgnoreCase(op));

    }
    
}
