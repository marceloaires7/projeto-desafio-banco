import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "Marcelo Aires";
        String tipoConta = "Corrente";
        double saldo = 2500;
        int opcao = 0;
        double valorRecebido = 0;
        double valorTransferencia = 0;

        System.out.printf("""
                **********************************************
                Dados iniciais do cliente:
                
                Nome:            %s
                Tipo conta:      %s
                Saldo inicial:   R$ %.2f
                **********************************************
                
                """, nome, tipoConta, saldo);

        String menu = """
                    Operações
                    
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    
                    Digite a opção desejada:""";

        while (opcao != 4) {
            System.out.println(menu);
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.printf("O saldo atual é R$ %.2f\n\n", saldo);
            } else if (opcao == 2) {
                System.out.println("Informe o valor a receber:");
                valorRecebido = sc.nextDouble();

                saldo += valorRecebido;
                System.out.printf("Saldo atualizado R$ %.2f\n\n", saldo);
            } else if (opcao == 3) {
                System.out.println("Informe o valor que deseja transferir:");
                valorTransferencia = sc.nextDouble();

                if (valorTransferencia > saldo) {
                    System.out.println("Não há saldo suficiente para fazer essa transferência.\n");
                } else if (valorTransferencia < 0){
                    System.out.println("Não pode ser um número negativo.\n");
                } else {
                    saldo -= valorTransferencia;
                    System.out.printf("Saldo atualizado R$ %.2f\n\n", saldo);
                }

            } else if (opcao == 4) {
                System.out.println("Volte sempre!\n");
            } else {
                System.out.println("Opção inválida\n");
            }

        }


        sc.close();
        }
    }