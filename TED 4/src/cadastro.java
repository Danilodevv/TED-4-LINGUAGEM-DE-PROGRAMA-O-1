import java.util.Scanner;

public class cadastro {
    public static void main(String[] args) {


        app funcionario = new app();

        funcionario.setNome("joão");
        funcionario.setEmail("joãodev@gmail.com");
        funcionario.setSalario(5000);
        funcionario.setPercentual(10);
        funcionario.setImposto(10);


        funcionario.imprimir();




    }

}
