package ABB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero para armar al arbol");
        System.out.println("Presiona 'a' para dejar de ingresar valores!");
        while (true) {
            System.out.println("Numero: ");
            String numero = sc.nextLine();
            if (numero.equals("a")) {
                break;
            }
            try {
                int valor = Integer.parseInt(numero);
                arbol.insert(valor);
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número válido o 'a' para terminar.");
            }
        }

        System.out.print("Inorden: ");
        arbol.showInOrder();
        System.out.println("\n");
        System.out.print("Postorden: ");
        arbol.showPostOrder();
        System.out.println("\n");
        System.out.print("Preorden: ");
        arbol.showPreOrder();

        System.out.print("Ingresa el numero a buscar: ");
        int numSearch = sc.nextInt();
        if (arbol.buscar(numSearch)) {
            System.out.println("El valor: " + numSearch + " se encuentra en el arbol.");
        } else {
            System.out.println("El valor: " + numSearch + " se encuentra en el arbol.");
        }

        System.out.println("Ingrese numero a eliminar");
        int numDelete = sc.nextInt();
        boolean eliminado = arbol.delete(numDelete);

        if (eliminado) {
            System.out.println("El nodo con el dato: " + numDelete + " ha sido eliminado!");
        } else {
            System.out.println("El nodo con el dato: " + numDelete + " no se ha encontrado en el arbol!");
        }

        System.out.println("Imprimiend de nuevo los recorridos: ");
        System.out.print("Inorden: ");
        arbol.showInOrder();
        System.out.println("\n");
        System.out.print("Postorden: ");
        arbol.showPostOrder();
        System.out.println("\n");
        System.out.print("Preorden: ");
        arbol.showPreOrder();
        sc.close();

    }

}
