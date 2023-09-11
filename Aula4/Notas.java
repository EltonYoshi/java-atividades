public class Notas
{
    float a1;
    float a2;
    float af;



    void setA1(float nota){
        if(nota <= 5){
            this.a1 = a1;
        }
    }

    void setA2(float nota){
        if(nota <= 5){
            this.a2 = a2;
        }
    }

    void setAF(float nota){
        if(nota <= 5){
            this.af = af;
        }
    }

    float getNF(){
        float notaFinal;
        if(this.af >= 0){
            notaFinal = (this.a1 + this.a2) / 2;
        }else{
            notaFinal = (this.a1 + this.a2 + this.af) / 3;
        }

        return notaFinal;
    }

    void printNotas(){
        
    }
}   
