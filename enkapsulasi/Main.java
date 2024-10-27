package enkapsulasi;

public class Main {
    public static void main(String[] args) {
        BankAccount AndrewSimatupang = new BankAccount(100);
        AndrewSimatupang.deposit(500);
        System.out.println(AndrewSimatupang.getSaldo());
    }
}
