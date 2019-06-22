#include <iostream>
#include "contribuinte.h"

using namespace std;

int main(){

    // obtenha a lista de contribuintes
    Contribuinte x = Contribuinte();
    Contribuinte lst[]= x.listaContr();


    cout << "NOME			IMPOSTO\n" << endl;
    cout << "--------  		----------\n" << endl;

    for(int i = 0; i < 6; i++){
        // o printf a seguir deve exibir o nome e o
        // imposto que o contribuinte irá pagar
        cout << lst[i].getNome() + "		" + lst[i].calcImposto() << endl;
    }
    return 0;
}
