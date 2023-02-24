#include <iostream>
using namespace std;

int const TKErr=-1;         // Token de Error
int const TKFin=-2;         // Token de Fin
string const ALFA[] = {"25","50","s","\\t"};

int **newMatriz(int f, int c)
{    
    int **m=NULL;
    m = new int*[f];
    for (int i = 0; i < f; i++)
        m[i] = new int[c];

    return m;
}

void showMatriz(int **pd, int f,int c)
{
    for (int i = 0; i < f; i++)
    {
            for (int j = 0; j < c; j++)
                cout<< pd[i][j] <<"\t";   
            cout<< endl;
    }
}

int getIndexAlfabeto(string str)
{
    //int index = ALFA.find(c);
    for (int i = 0; i < sizeof(ALFA) / sizeof(ALFA[0]); i++) 
        if (ALFA[i] == str) 
            return i;
    return TKErr;    
}

int main( void) 
{
/*  Automata finito determinista : Cobra un dolar $1

                         _ _ _ _ _ _ _  50   _ _ _ _ _ _ _  
                       |                                  |
    [q0] --- $25 ---> [q1]  --- $25 ---> [q2]  --- $25 ---> [q3]  --- $25 ---> [[q4]] 
    |                                      |                                     |
    |  _ _ _ _ _ _ _  $50  _ _ _ _ _ _ _ _ |  _ _ _ _ _ _   $50  _ _ _ _ _ _ _ _ | 


     _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ 
     Q     |  { 25          50         ' '  }
     _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ 
     0     |    1           2           er         
     1     |    2           3           er
     2     |    3           4           er
     3     |    4           er          er
     4     |    er          er          ok
     _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ 

*/
    int **mt=NULL;         // mt =  matriz de transicion
    int Q=5, L=3;
    mt = newMatriz(Q,L);
    
    //matriz de transicion [Q][L]
    mt[0][0]= 1;     mt[0][1]= 2;      mt[0][2]= TKErr;
    mt[1][0]= 2;     mt[1][1]= 3;      mt[1][2]= TKErr;
    mt[2][0]= 3;     mt[2][1]= 4;      mt[2][2]= TKErr; 
    mt[3][0]= 4;     mt[3][1]= TKErr;  mt[3][2]= TKErr; 
    mt[4][0]= TKErr; mt[4][1]= TKErr;  mt[4][2]= TKFin; 
    //showMatriz(mt,Q,L);
    
    //string palabra[] = {"25","25","25","25","s"};
    int q=0, l=0;
    string moneda;
    cout <<endl << "Ingresa un $1 en monedas de 25 y 50 centavos"  <<endl;
    do
    {
        cout<< "(s para salir) >> Ingresa una moneda: ";
        cin >> moneda;
        l = getIndexAlfabeto(moneda);
        q = mt[q][l];

        //cout<< "\t" + moneda << q <<","<< l <<endl;
        if(q == TKErr || q > Q){
            cout<<">> Error, devolviendo tu dinero" <<endl;
            exit(0);
        }
        if(q == TKFin){
            cout<<">> OK, recibe tu gaseosa" <<endl;
            exit(0);
        }
    }while (true);
}