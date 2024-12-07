public class HelloGoodbye {
    public static void main(String[] args) {
        // Verifica se os argumentos necessários foram fornecidos
        if (args.length != 2) {
            System.out.println("Por favor, forneça dois nomes ao chamar o programa.");
            System.out.println("Exemplo: java HelloGoodbye name1 name2");
            return;
        }

        // Obtendo as entradas dos argumentos
        String entrada1 = args[0];
        String entrada2 = args[1];

        // Exibindo as mensagens conforme solicitado
        System.out.println("Hello " + entrada1 + " e " + entrada2 + "!");
        System.out.println("Goodbye " + entrada2 + " e " + entrada1 + "!");
    }
}