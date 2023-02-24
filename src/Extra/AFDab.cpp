#include <iostream>
using namespace std;

int const TKErr=-1;         // Token de Error
int const TKOK=-10;         // Token de Fin
string const ALFA = "ab \\t";  // ?

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

int getIndexAlfabeto(char c)
{
    int index = ALFA.find(c);
    if(index < ALFA.length())
        return index;
    return TKErr;    
}

int main( void) 
{
    int **mt=NULL;         // mt =  matriz de transicion
    int Q=3, L=3;
    mt = newMatriz(Q,L);
    
/*  Automata finito determinista
     _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  
     Q     |  {  a      b      ' '     }
     _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
     0     |     1	    2	    er
     1     |     1	    2	    er
     2     |     er	    er	    ok
     _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ 

*/
    //matriz de transicion [Q][L]
    mt[0][0]=1;         mt[0][1]=2;         mt[0][2]= TKErr;     
    mt[1][0]=1;         mt[1][1]=2;         mt[1][2]= TKErr;     
    mt[2][0]=TKErr;     mt[2][1]=TKErr;     mt[2][2]= TKOK;     

// w1 = a    --> error   // w = palabra
// w2 = ac   --> error
// w3 = aab  --> ok
// w4 = bd   --> error
// w5 = b     --> ok
// w6 = aaaab --> ok
// w7 = aaaa    --> error

    string w = "aaaa ";
    int q=0, l=0;
    cout<< "palabra w = "  << w ;
    for (auto &&c : w )
    {
        l = getIndexAlfabeto(c);
        q = mt[q][l];
        //cout<< c << " " << q <<","<< l <<endl;
        if(q == TKErr || q > Q)
            cout<<"\t -> Error  ";
        if(q == TKOK)
            cout<<"\t -> OK  ";
       // 
    }
    cout<<endl;
     
    // for (int i = 0; i <Q; i++)
    //     for (int j = 0; j < L; j++)
    //         mt[i][j] =  'a'; //rand() % 10;  // genera randomicos hasta 10
    
    //showMatriz(mt,Q,L);
}
