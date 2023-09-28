
Java Course
# Java_Programming_Masterclass_17

[Master Completo Java IntelliJ](https://www.notion.so/Master-Completo-Java-IntelliJ-37f662702e6a4fb58b89cd6f550bc10a?pvs=21)

<aside>
☝🏼 **Java** es un lenguaje de programación utilizado para crear software compatible con una gran diversidad de sistemas operativos. Este lenguaje tiene la particularidad de ser compilado e interpretado al mismo tiempo; esto significa que es un lenguaje simplificado que convierte automáticamente el código en instrucciones de máquina.

</aside>

---

En un primer momento, el código en Java es compilado y después traducido a una forma binaria denominada «bytecode». Posteriormente, este código es compilado e interpretado en el lenguaje nativo solicitado por el sistema. Esto permite que el código pueda correr en diferentes plataformas y sistemas operativos con gran versatilidad, ya que se puede escribir solo una vez y correr en cualquier equipo.

**Historia de Java**

El nacimiento de Java se remonta al año 1991, cuando James Gosling y su equipo comenzaron a trabajar en la creación de un lenguaje para la empresa Sun Microsystems. Al poco tiempo de iniciar este proyecto, el equipo cambió su enfoque para alcanzar una meta más ambiciosa: diseñar un lenguaje para la recientemente creada World Wide Web. Finalmente, en 1995, Java fue lanzado al público para ser utilizado tanto para aplicaciones online como para la programación.

> **JShell** : La herramienta Java Shell (JShell) es una herramienta interactiva para aprender el lenguaje de programación Java y crear prototipos de código Java. Se introdujo en JDK 9. JShell es una herramienta de bucle de lectura, evaluación e impresión (REPL), que evalúa declaraciones, declaraciones y expresiones a medida que se ingresan y muestra inmediatamente los resultados. La herramienta se ejecuta desde la línea de comando.
> 

---

**Comandos:** 

Los comandos JShell controlan el entorno y muestran información dentro de una sesión.

Los comandos se distinguen de los fragmentos mediante una barra diagonal (/). Para obtener información sobre las variables, métodos y tipos actuales, utilice los comandos /vars, /methods y /types. Para obtener una lista de fragmentos ingresados, use el comando /list. El siguiente ejemplo muestra estos comandos basados en los ejemplos de Prueba de fragmentos:

```java
shell> /vars
|    int x = 45
|    int $3 = 4
|    String $5 = "OceanOcean"

jshell> /methods
|    twice (String)String

jshell> /list

   1 : System.out.println("Hi");
   2 : int x = 45;
   3 : 2 + 2
   4 : String twice(String s) {
         return s + s;
       }
   5 : twice("Ocean")
```

**/exit** para salir del JShell

**Declaración:**

Es un comando completo para ser ejecutado. Puede incluir una o más expresiones.

<aside>
🚨 Es necesario usar **comillas dobles** **“cadena literal” y no simples ‘’**

</aside>

```java
jshell> System.out.print("Hello World");
Hello World
jshell>
```

## Variables en Java:

Las variables Java son un espacio de memoria en el que guardamos un determinado valor (o dato). Para definir una variable seguiremos la estructura:

```java
[privacidad] tipo_variable identificador;
```

**Java** es un lenguaje de tipado estático. Por lo cual todas las variables tendrán un tipo de dato (ya sea un **tipo de dato primitivo** o una **clase**) y un nombre de identificador.

El tipo de dato se asignará a la hora de definir la variable. Además,
en el caso de que las variables sean propiedades de objetos tendrán una
privacidad.

```java
int numero = 2;
String cadena = "Hola";
long decimal = 2.4;
boolean flag = true;
```

Cuando vayamos a dar un nombre a
 una variable deberemos de tener en cuenta una serie de normas. Es 
decir, no podemos poner el nombre que nos dé la gana a una variable.

Los identificadores son secuencias de texto unicode, sensibles a 
mayúsculas cuya primer carácter solo puede ser una letra, número, 
símbolo dolar $ o subrayado _ . Si bien es verdad que el símbolo dolar 
no es utilizado por convención.

Es recomendable que los nombres de los identificadores sean legibles y
 no acrónimos que no podamos leer. De tal manera que a la hora de verlos
 se auto-documenten por sí mismos. Además estos identificadores nunca 
podrán coincidir con las palabras reservadas.

Algunas reglas no escritas, pero que se han asumido por convención son:

- Los identificadores siempre se escriben en minúsculas. (pe.
nombre). Y si son dos o más palabras, el inicio de cada siguiente
palabra se escriba en mayúsculas (pe. nombrePersona)
- Si el identificador implica que sea una constante. Es decir que
hayamos utilizado los modificadores final static, dicho nombre se suele
escribir en mayúsculas (pe. LETRA). Y si la constante está compuesta de
dos palabras, estas se separan con un subrayado (pe. LETRA_PI).

### Palabras Reservadas:

**Keywords**

Keyword:

[ReservedKeyword](https://docs.oracle.com/javase/specs/jls/se17/html/jls-3.html#jls-ReservedKeyword) [ContextualKeyword](https://docs.oracle.com/javase/specs/jls/se17/html/jls-3.html#jls-ContextualKeyword)

ReservedKeyword:

(one of) 

`**abstract   continue       for          new         switchassert     default  if  package    synchronized   boolean        do         goto    private   thisbreak   double     implements    protected   throwbyte      else      import  public      throwscase     enum       instanceof      return    transientcatch  extends int   short       trychar       final        interface      static        voidclass     finally    long          strictfp    volatileconst            float  native       super      while_ (underscore)**`

<aside>
☝🏼 ContextualKeyword:

</aside>

(one of) 

`**exports      opens      requires     usesmodule       permits    sealed   varnon-sealed   provides   to           withopen         record     transitive   yield**`

```java
jshell> int myFirstNumber = 5;
myFirstNumber ==> 5

jshell> System.out.print(myFirstNumber);
5
jshell>

// Para reasignar el valor (no es necesario volver a especificar el tipo de dato)

jshell> myFirstNumber = 10;
myFirstNumber ==> 10 

jshell> System.out.print(myFirstNumber);
10
jshell>

// Lista de todas las declaraciones 

jshell> /list

   1 : System.out.print("Hello World");
   2 : System.out.print("Hello Tim");
   3 : int myFirstNumber = 5;
   4 : System.out.print(myFirstNumber);
   5 : myFirstNumber = 10;
   6 : System.out.print(myFirstNumber);
   7 : myFirstNumber = 1000;
   8 : System.out.print(myFirstNumber);

