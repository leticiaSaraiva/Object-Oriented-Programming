#include "pfisica.h"
#include <iostream>


using namespace std;



class pfisica:public contribuinte{

    public:
        pfisica(String n,double r,String c){
            // inicialização das varáveis de instância
            nome = n;
            rendaBrt = r;
            cpf = c;
        }

        double calcImposto(){
            double imposto = 0;
            // Cálculo do imposto
            if(rendaBrt >= 0 && rendaBrt <= 1400){
                imposto = 0;
            }else if(rendaBrt > 1400 && rendaBrt <= 2100){
                imposto = (rendaBrt * 10) / 100;
            }else if(rendaBrt > 2100 && rendaBrt <= 2800){
                imposto = (rendaBrt * 15) / 100;
            }else if(rendaBrt > 2800 && rendaBrt <= 3600){
                imposto = (rendaBrt * 25) / 100;
            }else if(rendaBrt > 3600){
                imposto = (rendaBrt * 30) / 100;
            }
            return imposto;
        }

    protected:
        String cpf;

}

