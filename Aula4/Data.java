public class Data
{
    int dia;
    int mes;
    int ano;
    String[] mesesExtenso = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    String mesExtenso;

    int getDia(){
        return this.dia;
    }

    int getMes(){
        return this.mes;
    }

    int getAno(){
        return this.ano;
    }

    String getMesExtenso() {
        for(int i = 0; i < mesesExtenso.length; i++){
            if(this.mes == i + 1){
                mesExtenso = mesesExtenso[i];
            }
        }

        return mesExtenso;
    }

    String getData(){
        return new String(String.format("%02d/%02d/%4d", this.dia, this.mes, this.ano));
    }

    void setData(int dia, int mes, int ano){
        this.dia = 1;
        this.mes = 1;
        this.ano = 1900;

        //Define ultimo dia do mês
        int maxDia = 31;
        if(mes == 2 && ano % 4 == 0){
            maxDia = 29;
        }else {
            maxDia = 28;
        }
        if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
            maxDia = 30;
        }

        if(ano >= 0){
            if(mes >= 1 && mes <= 12){
                if(dia >= 1 && dia <= maxDia){
                    this.dia = dia;
                    this.mes = mes;
                    this.ano = ano;
                }
            }
        }
    }

    float getDataNumerica() {
        return (float) ano + (float) mes / 100 + (float)  dia / 10000;
    }

    int compara(Data data){
        if(this.getDataNumerica() == data.getDataNumerica()){
            return 0;
        } else if( this.getDataNumerica() > data.getDataNumerica()){
            return 1;
        }else {
            return -1;
        }
    }
}
