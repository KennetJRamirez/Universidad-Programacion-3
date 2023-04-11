package ABB;

public class Arbol {
    Nodo root;

    public Arbol() {
        this.root = null;
    }

    public void insert(int dato) {
        if (this.root == null) {
            this.root = new Nodo(dato);
        } else {
            this.root.insert(dato);
        }
    }

    public void showPreOrder() {
        this.preOrder(this.root);
    }

    public void preOrder(Nodo nodo) {
        if (nodo == null) {
            return;
        } else {
            System.out.print(nodo.getDato() + "->");
            preOrder(nodo.getIzq());
            preOrder(nodo.getDer());
        }
    }

    public void showInOrder() {
        this.inOrder(this.root);
    }

    public void inOrder(Nodo nodo) {
        if (nodo == null) {
            return;
        } else {
            inOrder(nodo.getIzq());
            System.out.print(nodo.getDato() + "->");
            inOrder(nodo.getDer());
        }

    }

    public void showPostOrder() {
        this.postOrder(this.root);
    }

    public void postOrder(Nodo nodo) {
        if (nodo == null) {
            return;
        } else {
            postOrder(nodo.getIzq());
            postOrder(nodo.getDer());
            System.out.print(nodo.getDato() + "->");
        }
    }

    
}
