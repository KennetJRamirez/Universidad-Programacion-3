package ABB;
public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();

        arbol.insert(43);
        arbol.insert(10);
        arbol.insert(8);
        arbol.insert(54);
        arbol.insert(15);
        arbol.insert(50);
        arbol.insert(53);

        System.out.print("Inorden: " + " , ");
        arbol.showInOrder();
        System.out.print("Postorden: " + " , ");
        arbol.showPostOrder();
        System.out.print("Preorden: " + " , ");
        arbol.showPreOrder();
    }
}
