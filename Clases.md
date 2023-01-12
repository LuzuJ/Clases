# **SEMANA 1**  

## *Convivencia*

***Numero infinito :*** Mediante grupos de 9, cada persona se coloco un número en el pecho, por consiguiente nos levantamos y el profesor decia un numero y cada integrante debia colocarse en la posición correcta y el grupo que se colocaba más rapido conseguia más puntos y ganaba  
***Torre al cielo :*** Con los grupos de proyecto y usando materiales como: besitos y fideos se debia llegar a la torre más alta con el menor número de materiales y el que lo lograba ganaba.

## **IDE, Visual Code y GitHub**

## **Visual Studio Code**

* Entorno de desarrollo estandarizado
* Independencia de plataformas / SO
* Mejor rendimiento
* Personalización
    1) JDK
    2) Extension Pack for Java
    3) Project Manager for Java
    4) Makefile Tools
    5) Markdown PDF
    6) markdownlint
    7) Draw.io Integration
    8) Draw.io Preview
    9) Más que se inetengren a los gustos

## **ATAJOS DEL VISUAL STUDIO CODE**

1. Command Palette  
    **Windows:** CTRL+SHIFT+P
2. Quick Open  
    **Windows:** CTRL+P
3. Toggle Sidebar  
    **Windows:** CTRL+B
4. Multi-Selector Cursor  
    **Windows:** CTRL+D
5. Copy Line  
    **Windows:** CTRL+ALT+UO or SHIFT+ALT+DOWN
6. Comment Code BLock  
    **Windows:** SHIFT+ALT+A(M.line) or CTRL+K+C(S.line)
7. Go back/ move forward  
    **Windows:** ALT+_> or +->
8. Show All Symbols  
    **Windows:** Ctrl+T
9. Tigger suggestion and Trigger parameter hints  
    **Windows:** Ctrl+SPACE, Ctrl+Shift+Space

![Atajos VS](https://learn.microsoft.com/es-es/visualstudio/ide/media/default-keyboard-shortcuts-in-visual-studio/visual-studio-keyboard-shortcut-cheatsheet.png?view=vs-2022)

[Atajos de VS](https://learn.microsoft.com/es-es/visualstudio/ide/default-keyboard-shortcuts-in-visual-studio?view=vs-2022)

## *GIT HUB*

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

## **MARKDOWN**

Comandos necesarios para poder usar ***MarkDown***, que es algo parecido a usar **HTML**.  

### **Encabezados**  

Los *encabezados* dependeran del numero de '#' que se coloque delante de cada palabra, siguiendo la misma logica, solo usaremos el # una vez para ser el titulo general del documento

`# Encambezado 1`  
`## Encambezado 2`  
`### Encambezado 3`  
`#### Encambezado 4`  
`##### Encambezado 5`  
`###### Encambezado 6`

### **TEXTO Y PARRAFOS**  

En el caso de usar **texto** o **parrafos** al colocar dos espacios despues del punto final, automaticamnete se colocara la siguiente línea como un codigo aparte.

Texto normal

Texto con 2 espacios al final.  
Texto normal

### **VIÑETAS Y LISTAS**

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
### **Formato**  

Para colocar el texto en cursiva usaremos * antes y después del texto 

*cursiva*

Para poner el texto en negrita utilizamos ** antes y después del texto.

**negrita**

Para colocar ambas usaremos *** antes y depués del trxto

***combinacion***

### **Color**

<span style="color:blue"> Texto *rojo cursiva* normal</span>  

### **Tachado**

~~tachado~~

### **Enlaces e imágenes**

<https://rstudio-pubs-static.s3.amazonaws.com/330387_5a40ca72c3b14824acedceb7d34618d1.html>   
o  
[Guia de Markdown](https://rstudio-pubs-static.s3.amazonaws.com/330387_5a40ca72c3b14824acedceb7d34618d1.html)

Tambien se pueden colocar los enlaces como anexos

[Codigo Ascii][1] "Atajos"

[1]: https://elcodigoascii.com.ar/  

![Esta es una imagen](https://images.axios.com/tM9vXTYpz0LL5zsba9VSchgjonQ=/2022/10/19/1666191760623.jpg)

[Guia MarkDown](https://www.ionos.es/digitalguide/paginas-web/desarrollo-web/tutorial-de-markdown/#:~:text=Al%20igual%20que%20los%20hiperv%C3%ADnculos,a%20la%20imagen%20entre%20par%C3%A9ntesis.)

### **Codigo**

Usaremos el llamado *acento grave* para poder resaltar un código, recordar que no son comillas simples

Esto es `codigo` recordar que es **alt + 96**

Si acento grave tambien puede aparecer varias veces ``Todo esto es `codigo`.``

### **Cuadro de codigo**

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

### **TABLAS**

Para poder dibujar tablas usaremos plecas (|) para delimitar las tablas.

|Columna 1|Columna 2|
|---------|---------|
|    A    |     B   |
|    C    |     D   |

### **Enmascaramineto con barra invertida**

Al usar caracteres especiales los podemos usar siempre y cuando se coloque una barra invertida "\" *alt + 92* antes del caracter

Esto es un \*ejemplo con asteriscos\*

---  

[Git push xD](https://es.stackoverflow.com/questions/518780/problema-con-git-push-fatal-no-configured-push-destination)

## *Conceptos basicos*

El nombre del archivo debe ser EL MISMO que el nombre de la clase y en mayusculas  

1. **Código:** Escrito por los programadores
2. **Compilación:** Esta compilación devuelve un Bytcode
3. **Bytecode:** Son instrucciones oara la java Virtual Machine
4. **JVM:** La java Virual Machine interpreta el bytecode
5. **Multiplataforma:** Se ejecuta en diferentes sistemas operaticos

**Developer**: Creador del programa  
**java**: Lenguaje de programacion
***Copilador***: Analizador *sistactico* o *semantico*, interprete  

virtual machine  -> bytecode  `.class`  
Sistema operativo *.exe  
Win Linux `01001`  
Mac "Multiplataforma"

Paquetes  
Detalle global  

# **SEMANA 2**

`Hola.java`, ejemplo

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

``` 
<Control de flujo>
    if - else
    for(n)
    while(<> !=)
    do(<> != ==)
    beak
    switch

```
### **Scanner**

```
import java.util.Scanner;
Scanner xxxx = new Scanner(System.in); // crear un objeto entrada
int valor = xxxx.nextInt(); // usar en numeros
string valor = xxxx.nextLine(); // usar en texto
```

### **Algoritmia**

1.- Algoritmo:  

* Pseudocodigo  
* Diadramas de flujo -> figuritas
* Codigo (debugging)  
* Traza(trace) -> Debug : Para saber si esta bien configurado, las salidas del programa.  
Se genera la informacion en la Ram, ocupa un espacio de almacenamiento. 

```
Pseudocódigo

    imprimir  "Itroduzca una longitud en metros"
    leer longuitud
    imprimir "introduzca una anchura en metros"
    leer ancho
    asignar a areaRectangulo = largo * ancho
    imprimir "El área es de " areaRectangulo "metros cuadrados"
```

```
Mayor de 3 numeros
    imprimir "Ingrese el 1er valor: "
    leer a
    imprimir "Ingrese el 2do valor: "
    leer b
    imprimir "Ingrese el 3er valor: "
    leer c

    Si (a>b) y (a>c)
    imprimir "el mayor valor es: " a
    salir
    Si (b>a) y (b>c)
    imprimir "el mayor valor es: " b
    Si (c>a) y (c>b)
    imprimir "el mayor valor es: " c
```

# **SEMANA 3**

Detalles:
1. `public:` modificador de acceso
2. `void :` valor de retorno (int, String,...)
3. `metodo :` nombre del metodo
4. `... :` argumentos que recive el metodo

***Metodos:*** Funciones que no retornan un valor  y no necesitan metodos   
 ```
Public/Private/Protected void NombreMetodo(){...}
```

***Metodos con parámetros:*** Funciones que necesitan parametros pero no retonan valores  
```
Public/Private/Protected void NombreMetodo (para1, para2, ...) {...}
para1 = <TipoDato>NombreParametro
```

***Metodo con retorno:*** Funcion que retorna un valor sin parametros  
```
Public/Private/Protected <TipoDato> NombreMetodo () 
{... return <TipoDato>}
```

***Metodo con retorno y parametros:*** Funcion que retorna un valor con parametros
```
Public/Private/Protected <TipoDato> NombreMetodo (para1 , param2,...) 
{... return <TipoDato>}
```

### **Variables Primitivas**

    int, long(tipos enteros)
    float, double(tipos de punto flotante)
    char (tipo caracter)

### **Variables de referencia**  

    String name = "Alog aqui"
    Calendar fechaNAc;

### **String**

    charAt(index)    //Obtener un caracter
    Lenght           //Obtener la longitud del String
    Equals           //comparacion
    equalsIgnoreCase //Ignorar si es mayusculas o minusculas

### **Scanner**

    nexInt()        Se salta los espacios dejados en blanco hasta que encuentre un valor de tipo int
    nextLong()      Se salta los espacios dejados en blanco hasta que encuentre un valor de tipo long
    nextFloat()     Se salta los espacios dejados en blanco hasta que encuentre un valor de tipo float
    nextDouble()    Se salta los espacios dejados en blanco hasta que encuentre un valor de tipo double
    next()          Se salta los espacios dejados en blanco hasta que encuentre un valor de tipo String

### **Arrays**

Caracteres + cadena de caracteres: String / Array / vector

    char letra = 'a';                           //1 2 3 q ' # * 
    chat caracter = '1';                        // --> |1| (8bit = 1 byte) --> |0|0|0|1|1|1|
    char palabra[10] = "HOLA";                  // |H|O|L|A|||||||||| --> vector
    char palabras[] = "Como estas pepe...";
    String palabras; -> palabras[]

## **POO**

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

# **SEMANA 5**

## **Herencias**

***Todos los*** coches ***son*** vehiculos  
Las herencias es un mecanismo por el que se pueden crear nuevas clases a partir de otras existenetes  
* heredado y posiblemente modificado, y/o añadiendo operaciones
* heredado y posiblemente añadiendo atributos

|clase original|superclase|padre |vehiculo|
|--------------|----------|------|--------|
|clase extendida|subclase|hijo|coche|

La *herencia* tambien se denomina ***Extension*** o ***Generalizacion***

Al exytender una clase
* se **hereda** todas las clases del padre  
* se puede **añadir** nuevas operaciones

La subclase puede elegir para las operaciones heredadas: 
* **redefinir** la operacion: se vuelve a escribir
    - pueden usar cosas del padre y hacer mas cosas o ser totalmente diferentes
* o no hacer nada y heredarla como tal del padre

### **Nomenclatura**

- Procedimientos -> void ABC(<params>) {code}
- Funciones      -> <TipoDato> ABC(<params>) {code ...; reutn <TipoDato>}
- Variables globales y locales
- Struct
- Librerias      -> *.h
- evento

    + publico
    - Privado
    ~ protegido

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

### **CONSTRUCTOR**

1) `new`
2) Unica ejecucion
3) Inicia valor de la clase
4) Lleva el mismo nombre de la clase

```
Vehiculo v = new Vehiculo();
```

Para pasar la herencia a los hijos usamos `EXTENDS nombreClaseHijo`

### **CONTRUCTOR CON PARAMETROS**

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

* `+` **public:** accesible desde el paquete
* `-`**private:** accesible solo desde esa clase
* `~` paquete
* `#` **protect:** accesible desde sus subclases y, en jaca, desde cualquier clase en el mismo paquete

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

### **SubClase**

```
Clase: 
    public int numSerie() {...}
    public color color() {...}
    public void pinta(Color c) {...}

    @Override
    public String toString(){
        return "Vehiculo -> numSerie = " + numSerie + ", color = "  + color; 
    }

Subclase:
    public class Coche extends Vehiculo{
        private int cilindrada
        //construye un coche
        public Coche(Color color, int numSerie, int cilindrada){
            super(color, numSerie);
            this.cilindrada = cilindrada:
        }
    }
```

<blockquote class="warning">En la SUBCLASE <br>Antes de que se ejecute el constructor </blockquote><br>

## **SEMANA 6**

### *MODELADO O:O UML*

* `->` dirección del modelo

### *COMPONENTES*

**EJEMPLOS EN LOS ESQUEMAS**

* `uso`"______" bidirección "----->" linea de dirección
* `inclusión` "-----" encima de la barra lleva *include*, describir el programa
* `extension` "---->" encima de la barra *extende*, que deoende de algo (más opciones para el usuario ejemplo un cliente puede pagar de diferenc).
* `Generalizaciones` "-->" sirve para clasificar dato.

*exclude:* va en dirección de la clase que la contiene, generalmente se usa entre caso de uso.
*include:* va en sentido de elemento opcional

### **Especificacion**

* Nombre
* Actores
* Extensiones
* Pre condicion
* Espacio principal
    * Paso 1..n
* Post condicion
* Escenarios alternativos

**Pre condiciones:** establece lo que siempre debe cumplirse antes de comenzar un caso de uso
**Post condiciones:** establece que se debe cumplirse cuando el caso de uso se completa con exito

# **SEMANA 7**

## **INTERFAZ - Fachada**

Nos permite especificar un conjunto de operaciones en clase que pueden ser utilizados por otras

| PROPIEDAD | CLASES | INTERFAZ |
|-----------|--------|----------|
|Propiedades| SI     | NO       |
|Metodos    | Metodos concretos heredados del padre | No tiene métodos concretos|
|Caracteristicas| Todos los hijos tienen  los mismos metodos | Cada hijo hereda los metodos y PUEDE CONTROLAR el comportamiento de cada método.|
|UML| SE ESTIENDE | SE IMPLEMENTA|


### **UML**

- POO                   -> paradigma de programación
- clase                 -> template (propiedad/atributo, métodos, mensajes/eventos)
- objeto                -> instancia de una clase
    * un conjunto de datos relacionados que identifican el estado actual del objeto
    * un conjunto de comportamientos = métodos.
- constructores         -> método que se ejecuta 1 vez en la instancia de la clase
- accesibilidad         -> private, protected, public
- encapsulamiento       -> métodos/clase + accesibilidad
- instancia             -> crear objetos (new)
- Sobrecarga            -> si 2 o + métodos en la misma clase que utilizan el mismo nombre pero con distintos parámetros o tipos de parámetros/datos
- Herencia              -> relación de jerarquía
- Instancia

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
