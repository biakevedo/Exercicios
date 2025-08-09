import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Exercício 1
        System.out.println("Bem-vindos ao curso de backend");

        // Exercício 2
        int idade = 30;
        int quantidadeAlunos = 40;

        // Exercício 3
        int soma = 10 + 2;
        int subtracao = 4 * 2;
        System.out.println(soma);
        System.out.println(subtracao);

        // Exercício 4
        int num1 = 2, num2 = 5;
        System.out.println(num1 + num2);

        // Exercício 5
        String nome = "Ana";
        System.out.println("Olá " + nome);

        // Exercício 6
        int valor = 10;
        System.out.println("O dobro de 10 é " + (valor * 2));

        // Exercício 7
        int valorUm = 8;
        int valorDois = 6;
        int valorTres = 10;
        double resultado = (double) (valorUm + valorDois + valorTres) / 3;
        System.out.println(resultado);

        // Exercício 8
        int y = 10;
        int x = 2;
        System.out.println(y < x);

        // Exercício 9
        int idadeCorreta = 18;
        int idadeAluno = 15;
        System.out.println(idadeAluno == idadeCorreta);

        // Exercício 10
        int temperatura1 = 25;
        int temperatura2 = 30;
        System.out.println(temperatura1 < temperatura2);

        // Exercício 11
        boolean temCartao = true;
        double compra = 50.0;

        boolean temDesconto = temCartao || compra > 100.0;
        System.out.println(temDesconto);

        // Estruturas condicionais

        // Condicional 1
        int idadeBia = 26;
        if (idadeBia > 18) {
            System.out.println("Parabéns! Você é maior de idade");
        } else {
            System.out.println("Você não é maior de idade");
        }

        // Condicional 2
        int numeroTal = 2;
        if (numeroTal > 0) {
            System.out.println("Esse número é positivo");
        } else if (numeroTal < 0) {
            System.out.println("Esse número é negativo");
        } else {
            System.out.println("Esse número é 0");
        }


        // Condicional 4
        boolean tarefa = true;
        if (tarefa) {
            System.out.println("Parabéns pela conclusão da tarefa");
        } else {
            System.out.println("Você ainda não completou sua tarefa");
        }

        // Condicional 5
        int idadeConvidado = 17;
        boolean convidadoAcompanhado = true;
        if (idadeConvidado >= 18 || (idadeConvidado >= 16 && convidadoAcompanhado)) {
            System.out.println("Entrada permitida");
        } else {
            System.out.println("Entrada negada");
        }

        // Condicional 6
        double salarioMensal = 2500;
        boolean possuiRestricao = true;
        if (salarioMensal > 2000 && !possuiRestricao) {
            System.out.println("Empréstimo aprovado");
        } else {
            System.out.println("Empréstimo negado");
        }

        // Condicional 7
        int nota1 = 7;
        int nota2 = 5;
        int nota3 = 4;
        double resultadoNotas = (double) (nota1 + nota2 + nota3) / 3;
        System.out.println("Média: " + resultadoNotas);

        if (resultadoNotas < 5) {
            System.out.println("Você foi reprovado, tente novamente");
        } else if (resultadoNotas >= 5 && resultadoNotas < 7) {
            System.out.println("Você está de recuperação");
        } else {
            System.out.println("Você está aprovado");

        }

        int numero5 = 8;
        if (numero5 >= 1 && numero5 <= 10) {
            if (numero5 % 2 == 0) {
                System.out.println("O número " + numero5 + " é PAR.");
            } else {
                System.out.println("O número " + numero5 + " é ÍMPAR.");
            }
        }


        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        if (senha.equals("1234")) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Senha incorreta. Acesso negado!");
        }

        System.out.println("Digite um número de 10 a 20: ");
         int numero = scanner.nextInt();
         if (numero <= 20 && numero >= 10) {
             System.out.println("Esse número está entre 10 e 20!");
         } else {
             System.out.println("Esse número não está entre 10 e 20");
         }

         // esse eu não faço ideia de como fazer
         double valorCompra = 350.0;
            if (valorCompra > 200.0) {
            valorFinal = valorCompra * 0.8; // 20% de desconto
            System.out.println("Essa compra tem desconto de 20%");
            } else if (valorCompra == 100.0) {
            valorFinal = valorCompra * 0.9; // 10% de desconto
            System.out.println("Essa compra tem desconto de 10%");
        } else {
            valorFinal = valorCompra; // Sem desconto
            System.out.println("Essa compra não tem desconto");
        }

        System.out.printf("Valor final a pagar: R$ %.2f\n", valorFinal);




    }
}











