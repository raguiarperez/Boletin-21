/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Utilidades.pedirDatos;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author raguiarperez
 */
public class libreria {
    public void engadir(ArrayList<Libros> lista) {
        lista.add(new Libros(pedirDatos.string("Título"), pedirDatos.string("Autor"), pedirDatos.string("ISBN"),
                pedirDatos.decimal("Precio"), pedirDatos.enteiro("Unidades")));
    }

    public void forIterator(ArrayList<Libros> lista) throws Erro {
        if (lista.isEmpty() == true) {
            throw new Erro("El Array está vacío");
        } else {
            Iterator it = lista.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }

    public void vender(int pos, ArrayList<Libros> lista) throws Erro {
        if (lista.isEmpty() == true) {
            throw new Erro("El Array está vacío");
        } else {
            lista.remove(pos);
        }
    }

    public void baixa(int unidades, ArrayList<Libros> lista) throws Erro {
        ArrayList<Integer> auxIndex = new ArrayList();
        if (lista.isEmpty() == true) {
            throw new Erro("El Array está vacío");
        } else {
            Libros lib;
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getUnidades() == unidades) {
                    auxIndex.add(i);
                }
            }
            for (int i = auxIndex.size() - 1; i >= 0; i--) {
                lista.remove(lista.get(auxIndex.get(i)));
            }
        }
    }

    public void consultar(String titulo, ArrayList<Libros> lista) throws Erro {
        if (lista.isEmpty() == true) {
            throw new Erro("El Array está vacío");
        } else {

            for (Libros lib : lista) {
                if (titulo.equalsIgnoreCase(lib.getAutor())) {
                    System.out.println(lib.toString());
                }

            }
        }
    }
}
