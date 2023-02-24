package Extra;
/*
Aut�mata Finito Determinista - ADF

Un aut�mata finito determinista es una qu�ntupla que denotaremos de manera gen�rica por M=(Q,?,q0,?,F), donde:
Q       es un conjunto finito cuyos elementos llamaremos estados. 
?       es un alfabeto que llamamos alfabeto de entrada. 
q0?Q    es un estado se�alado que llamamos estado inicial. 
F       es un subconjunto de Q no vac�o, cuyos elementos llamamos estados finales. 
?       es una aplicaci�n de Q�??Q , que llamamos funci�n de transici�n. 

por ejemplo:
Tenemos un alfabeto ? = {a, b, c}, entonces en la matriz de transici�n tomara la letra 'a' como indice 0 , letra 'b' indice 1 y letra 'c' indice 2.

tb de transiciones
    1   0
s1  s1  s2         0 --> 1*s1 ---0>---  s2*1
s2  s1  s2                 |_____0<_____|


* C++ - Aut�mata Finito Determinista
* Copyright 2014 Martin Cruz Otiniano
* Description: Ingresa automata, verifica palabra
* Site: martincruz.me
*/

#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <stdlib.h>
#define MAX 100
using namespace std;

void MostrarEstados(vector<int> v){
    cout << "\n\n ESTADOS DEL AUTOMATA \n\n";
    for(int i=0; i<v.size(); i++){
        cout << " " << i <<"  -->  q" << v[i] << endl;
    }
}

void IngresaAutomata(vector<int> &E, vector<char> &S, int T[MAX][MAX]){

    int numE;  // Numero de estados
    int numS;  // Numero de simbolos
    char c;

    // Generando estados
    cout << "\n Cantidad de Estados: ";
    cin >> numE;
    for(int i=0; i<numE; i++){
        E.push_back(i);
    }

    // Ingresando simbolos
    cout << "\n Cantidad de Simbolos: "; cin >> numS;
    cout << endl;
    for(int i=0; i<numS; i++){
        cout << "\t Simbolo " << i+1 << " : ";
        cin >> c;
        S.push_back(c);
    }
    sort(S.begin(),S.end());  // Ordenando simbolos

    // Ingresando tabla de transiciones
    cout << "\n INGRESE TABLA DE TRANSICIONES \n\n";
    for(int i=0; i<numE; i++){
        for(int j=0; j<numS; j++){
            cout << "\t T["<<i<<"]["<<j<<"] : ";
            cin >> T[i][j];
        }
    }

    // Mostrando tabla de transiciones
    cout << "\n\n TABLA DE TRANSICIONES \n\n";
    for(int i=0; i<numE; i++){
        for(int j=0; j<numS; j++){
            cout << "\t" << T[i][j] << "  ";
        }
        cout << endl;
    }
}

void menu(){
    cout << "\n\t\t AUTOMATA FINITO DETERMINISTA\n\n";
    cout << "\t 1. Ingresar Automata \n";
    cout << "\t 2. Verificar palabra              \n";
    cout << "\t 3. Salir                          \n";
    cout << "\t Ingrese opcion: ";
}

bool VerificarPalabra(vector<int> w, int T[MAX][MAX], int q0, vector<int>qf){

    int q, s;
    q = q0;
    bool EstadoVerificacion = false;

    for(int i=0; i<w.size(); i++){
        s = w[i];
        q = T[q][s];
    }

    for(int i=0; i<qf.size(); i++){
        if(q==qf[i]){
            EstadoVerificacion = true;
            break;
        }
    }
    return EstadoVerificacion;
}

void ConvertirPalabra(string palabra, vector<char>S, vector<int>&w){

    int i, k=0;

    while(w.size()!=palabra.length()){
        for(i=0; i<S.size(); i++){
            if(palabra[k]==S[i]){
                w.push_back(i);
            }
        }
        k++;
    }
}
/*                  Funcion Principal
--------------------------------------------------------------*/
int main()
{
    vector<int> Estados;
    vector<char> Simbolos;
    int Transiciones[MAX][MAX];
    int q0;              // Estado inicial
    vector<int>qf;       // Estados finales
    vector<int>w;
    bool AutomataIngresado = false;  // Aun no se ha ingresado automata

    int op, temp, tam;

    do{
        menu(); cin>>op;

        switch(op){

            case 1:
                Estados.clear();
                Simbolos.clear();
                qf.clear();

                IngresaAutomata(Estados, Simbolos, Transiciones);
                MostrarEstados(Estados);

                cout << "\n Ingrese estado inicial: ";
                cin >> q0;

                cout << "\n Cuantos de estados finales hay?: ";
                cin >> tam;

                cout << endl;
                for(int i=0; i<tam; i++){
                    cout << "\t Numero de estado final: ";
                    cin >> temp;
                    qf.push_back(temp);
                }

                AutomataIngresado = true;
                break;

            case 2:

                if(AutomataIngresado){
                    string palabra;
                    w.clear();
                    bool EstadoVerificacion = false;
                    cout << "\n Ingrese palabra: ";
                    cin>> palabra;

                    ConvertirPalabra(palabra, Simbolos, w);

                    EstadoVerificacion = VerificarPalabra(w, Transiciones, q0, qf);

                    if(EstadoVerificacion){
                        cout << "\n\t Palabra aceptada \n\n";
                    }
                    else{
                        cout << "\n\t Palabra no aceptada \n\n";
                    }
                }
                else{
                   cout << "\n Automata no ingresado..! \n";
                }

                break;

            case 3:
                exit(0);

            default:
                cout << "\n\tOpcion incorrecta..!\n";
        }

        //cout << "\n\n"; system("pause"); system("cls");

    }while(op!=3);
}