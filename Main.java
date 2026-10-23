import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float saldo = 1000;
        while (true) {
            System.out.println(
                    "\n1 - Ver saldo\n"+
                    "2 - Fazer Deposito\n"+
                    "3 - Fazer Saque\n"+
                    "4 - Simular Rendimento de Poupança\n"+
                    "0 - Sair\n");
            System.out.println("Digite a opção:");
            var opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    System.out.printf("Saldo atual: %s", saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor do deposito:");
                    var deposito = scanner.nextInt();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Deposito feito com sucesso!");
                    }else System.out.println("O valor precisa ser maior que zero!");
                    break;
                case 3:
                    System.out.println("Digite o valor do Saque:");
                    var saque = scanner.nextFloat();
                    if (saque > 0 && saque <= saldo){
                        saldo -= saque; System.out.println("Saque realizado com sucesso!");
                    } else {System.out.printf("Saldo insuficiente!\nSaldo disponivel: %s", saldo);
                    }break;
                case 4:
                    System.out.println("Informe quantos meses pretende deixar o dinheiro rendendo:");
                    var rendimentoSimulado = scanner.nextInt();
                    var saldoSimulado = saldo;
                    for (var i = 1;i <= rendimentoSimulado; i++){
                        saldoSimulado += saldoSimulado * 0.01;
                        System.out.printf("Mes %s - saldo: %.2f\n", i, saldoSimulado);
                    }
                    break;
                case 0:
                    System.out.println("Obrigado");
                    break;
                default: System.out.println("Opção invalida");
            }
        if (opcao == 0) break;
        }
    }

}
