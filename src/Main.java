import java.awt.*;

public class Main {
    public static int somar (int num1, int num2){
        return num1 + num2;
    }
    public static void main(String[] args) {
        System.out.println("Olá, GitHub!");

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Naum";
        pessoa1.idade = 18;
        System.out.println(pessoa1.nome);
        System.out.println(pessoa1.idade);
    }
}
