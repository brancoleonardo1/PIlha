public class Main {
    public static void main(String[] args) {

        StaticStack<Integer> stack = new StaticStack<>(5);


        System.out.println("Pilha está vazia? " + stack.isEmpty());


        System.out.println("Adicionando 10 na pilha.");
        stack.push(10);
        System.out.println("Adicionando 20 na pilha.");
        stack.push(20);
        System.out.println("Adicionando 30 na pilha.");
        stack.push(30);


        System.out.println("Pilha está cheia? " + stack.isFull());


        System.out.println("Elemento removido: " + stack.pop());


        System.out.println("Adicionando 40 na pilha.");
        stack.push(40);
        System.out.println("Adicionando 50 na pilha.");
        stack.push(50);


        System.out.println("Pilha está cheia? " + stack.isFull());


        System.out.println("Adicionando 60 na pilha.");
        stack.push(60);

        System.out.println("Pilha está cheia? " + stack.isFull());


        while (!stack.isEmpty()) {
            System.out.println("Elemento removido: " + stack.pop());
        }


        System.out.println("Pilha está vazia? " + stack.isEmpty());


        System.out.println("Limpando a pilha...");
        stack.clear();
        System.out.println("Pilha está vazia após limpar? " + stack.isEmpty());
    }
}
