#include "pjuridica.h"
#include <iostream>

using namespace std;

class pjuridica:contribuinte{

    public:
        pjuridica(String n,double r,String c){
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
        String cnpj;
}

