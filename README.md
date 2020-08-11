# T�tulo del Proyecto

Talller 1 - AREP 

Introduction To Complex Systems, Java, Mvn, And Git

## Comenzando 

Revise el archivo [Descripci�n](https://github.com/JuanCe11/AREP-Taller1/blob/master/Taller_1_AREP.pdf) para tener informacion b�sica del problema y la soluci�n propuesta.

Para tener una copia del repositorio, desde consola ejecute el siguiente comando.

```
git clone https://github.com/JuanCe11/AREP-Taller1.git
```

### Pre-requisitos 

- Java 8 - [How install](https://www.java.com/es/download/help/windows_manual_download.xml)
- Git - [How install](https://git-scm.com/book/es/v2/Inicio---Sobre-el-Control-de-Versiones-Instalaci%C3%B3n-de-Git)
- Maven - [How install](https://maven.apache.org/install.html)


### Instalaci�n 

Para la correcta instalaci�n se debe primero clonar el repositorio como se indic� anteriormente, despu�s se ingresa al directorio del proyecto y para ejecutar la clase App (clase con el ejemplo de uso) se ejecutan los siguientes comandos.

```
cd AREP-Taller1
java -cp target/taller-1-1.0-SNAPSHOT.jar edu.escuelaing.arep.taller1.App
```

Puede revisar las fuentes del proyecto revisar a detalle los test.

## Ejecutando las pruebas 

Ahora para ejecutar los test se utiliza el comando:

```
mvn test
```

### Analice las pruebas end-to-end 

Las pruebas propuestas est�n enfocadas a la clase _Calculadora_ pero al probar las funcionalidades de esta clase se est�n utilizando todas las clases de la soluci�n.

Se est� probando que el lector de archivos funcione para obtener los datos, se crea la lista encadenada y se le agregan los nodos con los valores que se obtuvieron de los archivos.


## Construido con 

* [Java 8](https://www.java.com/es/about/whatis_java.jsp)
* [Maven](https://maven.apache.org/) - Manejador de dependencias


## Wiki

Puedes encontrar mucho m�s de c�mo utilizar este proyecto en nuestra [Wiki](https://github.com/JuanCe11/AREP-Taller1/wiki)


## Autores 

* **Juan Sebastia G�mez L�pez** - *Trabajo Inicial* - [JuanCe11](https://github.com/JuanCe11)


## Licencia

Este proyecto est� bajo la Licencia GNU General Public License - mira el archivo [LICENSE.txt](LICENSE.txt) para detalles

