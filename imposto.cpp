#include <iostream>

using namespace std;

class contribuinte{
    public:
        contribuinte(){

        }

        string getNome(){
            return nome;
        }

        virtual double calcImposto() = 0;

    protected:
        string nome;
        double rendaBrt;
};

class pfisica:public contribuinte{
    public:
        pfisica(string n,double r,string c){
            // inicialização das varáveis de instância
            nome = n;
            rendaBrt = r;
            cpf = c;
        }

        double calcImposto(){
            double imposto = 0;
            // Cálculo do imposto
            if(rendaBrt >= 0 && rendaBrt <= 1400.00){
                imposto = 0;
            }else if(rendaBrt > 1400.00 && rendaBrt <= 2100.00){
                imposto = (rendaBrt * 10) / 100;
            }else if(rendaBrt > 2100.00 && rendaBrt <= 2800.00){
                imposto = (rendaBrt * 15) / 100;
            }else if(rendaBrt > 2800.00 && rendaBrt <= 3600.00){
                imposto = (rendaBrt * 25) / 100;
            }else if(rendaBrt > 3600.00){
                imposto = (rendaBrt * 30) / 100;
            }
            return imposto;
        }

    protected:
        string cpf;
};

class pjuridica:public contribuinte{
    public:
        pjuridica(string n,double r,string c){
            // inicialização das varáveis de instância
            nome = n;
            rendaBrt = r;
            cnpj = c;
        }
        double calcImposto(){
            // Cálculo do imposto
            double imposto = (rendaBrt * 10) / 100;
            return imposto;
        }
    protected:
        string cnpj;
};

int main(){

    // obtenha a lista de contribuintes
    contribuinte *p[6];

    p[0]=new pfisica("Joao Santos",3000.00,"11111");
    p[1]=new pjuridica("Lojas AA",150000.00,"10055");
    p[2]=new pfisica("Maria Soares",5000.00,"22222");
    p[3]=new pjuridica("Supermercados B",2000000.00,"10066");
    p[4]=new pfisica("Carla Maia",1500.00,"33333");
    p[5]=new pjuridica("Posto XX",500000.00,"10077");

    cout << "NOME			IMPOSTO EM R$\n" << endl;
    cout << "--------  		----------\n" << endl;

    for(int i = 0; i < 6; i++){
        // o printf a seguir deve exibir o nome e o
        // imposto que o contribuinte irá pagar
        cout << p[i]->getNome()<< "		"<< p[i]->calcImposto()  << endl;
    }
    return 0;
}

