# Orange.Bank.test
simple test
Este test consiste en ingresar “Orange Bank” en el searcbox de la home page de google y comprobar si la cantidad de resultados obtenidos es mayor 
de 100.000 y menor de 10.000



HERRAMIENTA DE AUTOMATIZACION: Selenium Web Driver (Chrome)
SEGUNDA HERRAMIENTA: Cucumber (Desarrollo Basado en Comportamiento - BDD) Leguaje Gerkin
LENGUAJE PARA EL DESARROLLO DE LA AUTOMATIZACION: Java
TERCER HERRAMIENTA: Maven (Pom.Xml)
	las dependencias de MAVEN se importan al POM.xml
ENTORNO DE DESARROLLO: INTELIJ IDEA
PAQUETE (FEATURES) 
En este paquete están todos los escenarios de prueba escritos en lenguaje gerkin
PAQUETE (RUNNER) 
En este paquete se encuentra el punto de partida, donde inicio la ejecución de las automatizaciones
		clase testrunner
			Lo primero es ordenar que sea una clase ejecutable y que se ejecute con cucumber
			luego ordeno a cucumber:
				donde va a buscar los escenarios de prueba 
					(features = "src/test/java/features")
				donde van a estar las implementaciones de cada uno de los escenarios
					(glue = "seleniumgluecode")
			En esta clase agrego un Afterclass con el fin de que al finalizar la ejecución se cree un reporte automáticamente con cucumber.
PAQUETE (SELENIUMGLUECODE) 
En este paquete pongo la implementación de todos los pasos de los escenarios de prueba
		Hooks
			Esto lo empleo para poder cambiar el ambiente de prueba si es necesario.
		Clase Test
Esta clase se encarga de la lógica de todos los escenarios, contiene todos localizadores y ejecuta todas las acciones de la prueba.
//en vista de que esta prueba es simple, he decidido no implementar el pom (page object model) pero si se tratase de un software en desarrollo 
lo que yo haría es crear una clase para cada acción de esa forma si se modifica un localizador será más fácil cambiarlo//

Al ejecutarse el scrip, justo depues de la ejecucion se creará un reporte con cucumber.
