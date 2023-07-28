import java.util.Scanner;
public class ContaBancaria {
    public static void main(String[] args) {

        String nome = "Jaqueline Oliveira";
        String tipoConta = "corrente";
        Double saldo = 2500.00;
        int opcao = 0;

            System.out.println("*******************");
            System.out.println("Dados iniciais do cliente");
            System.out.println("\nNome: " + nome);
            System.out.println("Tipo conta: " + tipoConta);
            System.out.println("Saldo Inicial: R$ " + saldo);
            System.out.println("\n*******************");

        String menu = """
                
                Operações
                                
                1- Consultar saldos
                2- Transferir valor
                3- Receber valor
                4- Sair
                                
                Digite a opção desejada:
                                
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao ==1){
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao ==2) {
                System.out.println("Qual o valor que deseja tranferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Saldo Insuficiente");
                }else{
                    saldo = saldo - valor;
                    System.out.println("\nO saldo atualizado é: " + saldo);
                }
            } else if (opcao ==3) {
                System.out.println("Qual o valor que deseja receber?");
                double valor = leitura.nextDouble();
                if (valor <= 0){
                    System.out.println("Valor inválido");
                }else{
                    saldo = saldo + valor;
                    System.out.println("\nO saldo atualizado é: " + saldo);
                }
            } else if (opcao !=4){
                System.out.println("Opção inválida");
            }
        }
        System.out.println("Finalizado");

    }
}
