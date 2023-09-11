public class Aluno
{
    String matricula;
    String nome;
    Data dataNascimento;
    Endereco endereco;
    Disciplina disciplinaCursada;


    void setNascimento(int dia, int mes, int ano){
        this.dataNascimento.setData(dia, mes, ano);
    }

    void setEndereco(String rua, String  cidade, String  estado, String cep){
        this.endereco.setEndereco(rua, cidade, estado, cep);
    }

    void setDisciplina(String disciplina, String semestre){

    }

    void printCadastro(){
        
    }
}   
