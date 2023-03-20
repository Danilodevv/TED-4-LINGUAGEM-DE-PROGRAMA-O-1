public class app {


    private String nome;
    private String email;
    private double salario;
    private double percentual;

    private double imposto;




    public void imprimir(){
        System.out.println("nome = "+nome +"\ne-mail = "+email +"\nsalário = R$ " + salarioMenosImposto()+"\nvalor do imposto = R$ " + valorDoImposto());

    }
    public double valorDoImposto (){
        return aumentoSalario() * imposto/100;
    }
    public double salarioMenosImposto (){
        return aumentoSalario() - (aumentoSalario() * imposto)/100;
    }

    public double aumentoSalario (){
        return salario + (salario * percentual)/100;
    }


    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
}
