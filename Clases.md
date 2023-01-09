# **SEMANA 1**  

**IDE, Visual Code y GitHub**

*GIT HUB*

[REPOSITORIO](https://github.com/LuzuJ/Clases.git)

Al crear nuestro primer proyecto usaremos el *ctrl + shift + p*, **java proyect** y usaremos *too* ya que es un proyecto para probar el java, no un proyecto de empresa.  

Antes de cada practica es necesario usar las siguientes configuraciones en el ***TERMINAL***.  
En el caso de instalar por primera vez los entornos de trabajos o es la primera vez que se usa el JDK o algo relacionado a JAVA colocaremos: 

Para saber que version colocaremos el siguiente comando en el terminal:

    java --version (en algunos casos usando un solo guión es necesario).

Como vamos a usar tambien git para poder configurar nuestros proyectos a la nube, descargaremos el **GIT BASH**, por lo que usaremos al igual comandos para confirmar que está instalado.

    git version: para poder comprobar si está la versión correcta.

    pwd: para conocer donde se encuentra el WorkSpace.

En caso de que sea necesario usaremos los codigos `git config user.name`, con esto podremos saber si es nuestro nombre de usuario el que se encuentra ingresado en el git, de igual manera usaremos `git config user.email`.  
En caso de que no aparezca nuestro correo ni nuestro nombre de usuario, lo configuramos con los siguientes comandos:

`git config --global user.name 'nuestro usuario'` o `git config --global user.email 'nuestro email'`

## **ATAJOS DEL VISUAL STUDIO CODE**

![Atajos VS](https://learn.microsoft.com/es-es/visualstudio/ide/media/default-keyboard-shortcuts-in-visual-studio/visual-studio-keyboard-shortcut-cheatsheet.png?view=vs-2022)

[Atajos de VS](https://learn.microsoft.com/es-es/visualstudio/ide/default-keyboard-shortcuts-in-visual-studio?view=vs-2022)
---  

## **MARKDOWN**

Comandos necesarios para poder usar ***MarkDown***, que es algo parecido a usar **HTML**.  

## **Encabezados**  

Los *encabezados* dependeran del numero de '#' que se coloque delante de cada palabra, siguiendo la misma logica, solo usaremos el # una vez para ser el titulo general del documento

`# Encambezado 1`  
`## Encambezado 2`  
`### Encambezado 3`  
`#### Encambezado 4`  
`##### Encambezado 5`  
`###### Encambezado 6`

## **TEXTO Y PARRAFOS**  

En el caso de usar **texto** o **parrafos** al colocar dos espacios despues del punto final, automaticamnete se colocara la siguiente línea como un codigo aparte.

Texto normal

Texto con 2 espacios al final.  
Texto normal

## **VIÑETAS Y LISTAS**

Usando viñetas y listas numeradas usaremos.

- Elemento
- Elemento
- Elemento

1. Elemento
2. Elemento
3. Elemento

Si queremos cambiar el formato del 1, solo cambiamos ".-" por ")", respectivamene.

* Elemento  
* Elemento  
     + Subelemento  
        - Desagregación  
* Elemento  

1) Elemento  
2) Elemento  
3) Elemento  

[ ] A  
[X] B  
[ ] C  
## **Formato**  

Para colocar el texto en cursiva usaremos * antes y después del texto 

*cursiva*

Para poner el texto en negrita utilizamos ** antes y después del texto.

**negrita**

Para colocar ambas usaremos *** antes y depués del trxto

***combinacion***

## **Color**

<span style="color:blue"> Texto *rojo cursiva* normal</span>  

## **Tachado**

~~tachado~~

## **Enlaces e imágenes**

<https://rstudio-pubs-static.s3.amazonaws.com/330387_5a40ca72c3b14824acedceb7d34618d1.html>   
o  
[Guia de Markdown](https://rstudio-pubs-static.s3.amazonaws.com/330387_5a40ca72c3b14824acedceb7d34618d1.html)

Tambien se pueden colocar los enlaces como anexos

[Codigo Ascii][1] "Atajos"

[1]: https://elcodigoascii.com.ar/  

![Esta es una imagen](https://images.axios.com/tM9vXTYpz0LL5zsba9VSchgjonQ=/2022/10/19/1666191760623.jpg)

[Guia MarkDown](https://www.ionos.es/digitalguide/paginas-web/desarrollo-web/tutorial-de-markdown/#:~:text=Al%20igual%20que%20los%20hiperv%C3%ADnculos,a%20la%20imagen%20entre%20par%C3%A9ntesis.)

## **Codigo**

Usaremos el llamado *acento grave* para poder resaltar un código, recordar que no son comillas simples

Esto es `codigo` recordar que es **alt + 96**

Si acento grave tambien puede aparecer varias veces ``Todo esto es `codigo`.``

## **Cuadro de codigo**

Usaremos un **tab** o **4 espacios en blanco**

    Aqui todavía continúa el texto.
        Esta es la primera línea del codigo.
            La segunda línea tiene aún más sangría.
        Esta es otra línea de código.
    Aqui vuelve a empezar el texto.

Así mismo se puede usar 3 acentos para crear el bloque de código al principio y al final.

```html
<html>
    <head>
    </head>
</html>
```

## **TABLAS**

Para poder dibujar tablas usaremos plecas (|) para delimitar las tablas.

|Columna 1|Columna 2|
|---------|---------|
|    A    |     B   |
|    C    |     D   |

## **Enmascaramineto con barra invertida**

Al usar caracteres especiales los podemos usar siempre y cuando se coloque una barra invertida "\" *alt + 92* antes del caracter

Esto es un \*ejemplo con asteriscos\*

---  

[Git push xD](https://es.stackoverflow.com/questions/518780/problema-con-git-push-fatal-no-configured-push-destination)

# **SEMANA 2**

## *Conceptos basicos*

El nombre del archivo debe ser EL MISMO que el nombre de la clase y en mayusculas  

**Developer**: Creador del programa  
*java*: Lenguaje de programacion
***Copilador***: Analizador *sistactico* o *semantico*, interprete  

virtual machine  -> bytecode  `.class`  
Sistema operativo *.exe  
Win Linux `01001`  
Mac "Multiplataforma"

Paquetes  
Detalle global  

1.- Metodos:  
* Retornar valor "Funcion"   
* No retorna valor "Procedimiento"  

`Hola.java`  
 ## *Ejm en Hola.java*

Estandar Codificado: Camelcase (nombreCompletoApellido)


**Parametro** *Propiedad/atributos* /ambito(Public, private, protect)/ /tipo de dato/ /nombre variable/  

*variable* /tipo de datos/  
/nombre de variable(1.- estandar camelcase, 2.- nombre asociado al negocio, 3.- declaracion)/;  

```
/tipo dato>  
    String  (Primitivos)
    Bool  
    Int  
    ...
    bool  (orientada a objetos)  
    int  
    = /Valor/; 
    
    public class XXXX{
        public Integer edadUsuario = 21; // propiedad
        public static void main(){
            String nombreUsuario = "Luzuriaga"; // variable
            String nombre; // ? declaración
            nombre = "Jonathan" // ? inicialización
   }   
}
```

## **Scanner**  

```
import java.util.Scanner;
Scanner xxxx = new Scanner(System.in); // crear un objeto entrada
int valor = xxxx.nextInt(); // usar en numeros
string valor = xxxx.nextLine(); // usar en texto
```

**Algoritmia**  
1.- Algoritmo:  

* Pseudocodigo  
* Diadramas de flujo -> figuritas   
* Code (Java)  
* Trace -> Debug : Para saber si esta bien configurado, 
las salidas del programa.  
Se genera la informacion en la Ram, ocupa un espacio de almacenamiento.  

# **SEMANA 3**

## **POO**

*Solucion*  
2.- Problema

**1)ERROR:**  
1.- Logico: Division entre 0  
2.- Compilador: En tiempo de ejecucion  

* Sintactico  
* Semantico 

**2) ISSUE:** Tiene un defecto en el programa, no lo cierra pero lo hace ir mal.  
**3) BUG:** Vulberabilidad, se aprovecha de los **ISSUE**     

```
To se puede mejorar :v  
```

ctrl F5 /* para documentar

doble linea ctrl + D

Seleccionar cogidos, clic derecho, refactorizar, extract metod, ingresarNombre, se crea un metodo

% mood, residuo de las divisiones

**Casteo de datos**

Para poder convertir a diferente tipo de datos

```
Cast (int) i;  
Conversion int a = Integer.parse.Int("i");
```

Detalles:
1. `public:` modificador de acceso
2. `void :` valor de retorno (int, String,...)
3. `metodo :` nombre del metodo
4. `... :` argumentos que recive el metodo  

``` 

*Metodos que no retornan*
public void metodo(){
   // Instrucciones
}
```
## **SEMANA 5**

### **Herencias**

**Nomenclatura** 
Clase original = clase padre = Superclase
->Propiedades

1) Nombre
2) Ocupacion
3) Sexo

Clase secundaria = clase hijo = Subclase  
->Acciones 

1) Presentarse
2) Trabajar

Propiedad, Metodos -> Constructos

**CONSTRUCTOR**

1) `new`
2) Unica ejecucion
3) Inicia valor de la clase
4) Lleva el mismo nombre de la clase

Para pasar la herencia a los hijos usamos `EXTENDS nombreClaseHijo`

**CONTRUCTOR CON PARAMETROS**

```
public Padre(String nombre, String ocupacion, String sexo, int edad) {
   this.nombre = nombre;
   this.ocupacion = ocupacion;
   this.sexo = sexo;
   this.edad = edad;
}
```
`this:` Referenciar variables dentro del CONSTRUCTOR de las clases.

`shift + alt, cortar` 

### **NOTACION PARA AMBITOS**

* `+` public
* `-`private
* `~` paquete
* `#` protect

### **NOTACION PARA METODOS**

* Mejorar el diseño
* Permite la reutilización 
* Facilita la extensión
* *Problema:* acoplamiento

### **OBJETOS**

La 'variable' es el objeto que tiene referencia a la memoria RAM

```
Vehiculo v = new Vehiculo();
Coche c = new Coche();
Barco b = new Barco();
```

<blockquote class="warning">En la SUBCLASE <br>Antes de que se ejecute el constructor </blockquote><br>

## **SEMANA 6**

### *MODELADO O:O UML*

* `->` dirección del modelo

### *COMPONENTES*

* `uso`"______" bidirección "----->" linea de dirección
* `inclusión` "-----" encima de la barra lleva *include*, describir el programa
* `extension` "---->" encima de la barra *extende*, que deoende de algo (más opciones para el usuario ejemplo un cliente puede pagar de diferenc).
* `Generalizaciones` "-->" sirve para clasificar dato.

*exclude:* va en dirección de la clase que la contiene, generalmente se usa entre caso de uso.
*include:* va en sentido de elemento opcional

## **SEMANA 7**

### **INTERFAZ** 

| PROPIEDAD | CLASES | INTERFAZ |
|-----------|--------|----------|
|Propiedades| SI     | NO       |
|Metodos    | Metodos concretos heredados del padre | No tiene métodos concretos|
|Caracteristicas| Todos los hijos tienen  los mismos metodos | Cada hijo hereda los metodos y PUEDE CONTROLAR el comportamiento de cada método.|
|UML| SE ESTIENDE | SE IMPLEMENTA|

## **ARQUITECTURA DE SOFTWARE (N-Tire)**

### *Estructura de capas*

include es el obligatorio, extended es opcional  
SIEMPRE SE LEE DE ABAJO HACIA ARRIBA

### ***Preguntas que se debe hacer***  

puede ser?, debe ser? es?

composicion flechas, listas, generalizaciones   
la de color siempre va, despartamento -> 1 casa -> Conjunto de casa   
La blanca no necesariamnete, abeja -> colmema   
interfaz, mejor que herencia   
interfa - Accion - Operacio   
Perosona - usuario, cliente Ainimal   

clases tivafs.   
UML + INTERFAZ   
USER INTERFACE UI   
**JAVA FX** render para diseñar

### **CAPAS**

* PRESENTACION - GUI
* APLICACIÓN - código
* DATOS - persistencia de datos

Web/Desktop/Mobil -> Escenarios de trabajo

Interfase R1 R2
Logic Ruler -> D(m) --- D(f) {Ra = Rb}

DTO: Extrae como un txt, o excel donde está la info
DAC: Extrae un paquete como Oracle que queda como objetos

Rest
Log
Datos  