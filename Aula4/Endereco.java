public class Endereco
{
    String rua;
    String cidade;
    String estado;
    String cep;

    void setEndereco(String rua,  String cidade,  String estado, String cep){
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    void printEndereco(){
        System.out.println("Rua: " + this.rua + "\nCidade: " + this.cidade + "\nEstado: " + this.estado + "\nCEP: "+ this.cep ); 
    }
}   
