
fun main(args: Array<String>){
    //Impresion de mensaje ¿Puedes escribir una función main() que imprima estos mensajes en cuatro líneas separadas?
    /*Use the val keyword when the value doesn't change.
    Use the var keyword when the value can change.
    When you define a function, you define the parameters that can be passed to it.
    When you call a function, you pass arguments for the parameters.*/
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")
    /*Este programa imprime un mensaje que le notifica al usuario que recibió un mensaje de chat de un amigo.
    fun main() {
    println("New chat message from a friend'}
    }
    ¿Puedes determinar la causa raíz de los errores de compilación de este programa y corregirlos?
    ¿El código usa los símbolos apropiados para indicar la apertura y el cierre de la cadena y el argumento de la función?
     */
    println("New chat message from a friend")
    /*Este programa informa a los usuarios sobre la próxima oferta promocional de un artículo en particular. Tiene una plantilla de cadenas, que se basa en la variable discountPercentage para el porcentaje de descuento y la variable item para el artículo en oferta. Sin embargo, existen errores de compilación en el código.
    fun main() {
    val discountPercentage: Int = 0
    val offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
    }
    ¿Puedes determinar la causa raíz de esos errores y corregirlos?
    ¿Puedes determinar el resultado de este programa antes de ejecutar el código en Kotlin Playground?
     */
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
    /*
    Este programa muestra una cantidad total de personas en una fiesta. Entre ellas, hay adultos y niños. La variable numberOfAdults contiene la cantidad de adultos en el grupo, y la variable numberOfKids, la cantidad de niños.


fun main() {
    val numberOfAdults = "20"
    val numberOfKids = "30"
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}
Paso 1
¿Puedes determinar el resultado de este programa antes de ejecutar el código en Kotlin Playground?
Después de determinar el resultado, ejecuta el código en Kotlin Playground y, luego, verifica si el resultado coincide con el que se muestra.

Pista: ¿Qué sucede cuando usas el operador + en dos cadenas?

Paso 2
El código funciona y, además, imprime algunos resultados, pero los resultados no muestran la cantidad total de personas que asistirán a la fiesta.

¿Puedes encontrar el problema del código y corregirlo de modo que imprima este resultado?
     */
    val numberOfAdults = "20"
    val numberOfKids = "30"
    val total = numberOfAdults.toInt() + numberOfKids.toInt()
    println("The total party size is: $total")
    /*Este programa muestra el salario total que recibe un empleado este mes. El salario total se divide en dos partes: la variable baseSalary, que es lo que el empleado recibe todos los meses, y la variable bonusAmount, que es una bonificación adicional otorgada al empleado.


fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}
¿Puedes determinar el resultado de este código antes de ejecutarlo en Kotlin Playground?
Cuando ejecutas el código en Kotlin Playground, ¿se imprime el resultado que esperabas?
     */
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
    /*En este ejercicio, escribirás un programa que realice operaciones matemáticas básicas y, luego, imprima el resultado.

Paso 1
La función main() contiene un error de compilación:


fun main() {
    val firstNumber = 10
    val secondNumber = 5

    println("$firstNumber + $secondNumber = $result")
}
¿Puedes corregir el error de modo que el programa imprima este resultado?
     */
    val firstNumber = 10
    val secondNumber = 5
    val result= firstNumber + secondNumber
    println("$firstNumber + $secondNumber = $result")
    /*
    Paso 2
El código funciona, pero la lógica para sumar dos números se encuentra dentro de la variable de resultado, lo que hace que el código sea menos flexible a la hora de volver a usarlo. En su lugar, puedes extraer la operación de suma en una función add() para que el código se pueda volver a usar. Para ello, actualiza el código con el que se muestra a continuación. Observa que el código ahora presenta una nueva variable val, llamada thirdNumber, e imprime el resultado de esta variable nueva con firstNumber.


fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}

// Define add() function below this line
¿Puedes definir la función add() de modo que el programa imprima este resultado?
     */
    val firstNumber1 = 10
    val secondNumber1 = 5
    val thirdNumber = 8

    val result1 = add(firstNumber1, secondNumber1)
    val anotherResult = add(firstNumber1, thirdNumber)

    println("$firstNumber + $secondNumber = $result1")
    println("$firstNumber + $thirdNumber = $anotherResult")
    /*
    Ahora tienes una función reutilizable capaz de sumar dos números.

¿Puedes implementar la función subtract() de la misma manera en que implementaste la función add()? Modifica la función main() también para usar la función subtract(), de modo que puedas verificar que funcione como se espera.
     */
    //8. Parámetros predeterminados
    /*¿Puedes implementar la función displayAlertMessage() en este programa de modo que imprima el resultado que se muestra?*/
    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId.
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
    /*9. Podómetro
El podómetro es un dispositivo electrónico que cuenta la cantidad de pasos que se dan. En la actualidad, casi todos los teléfonos celulares, relojes inteligentes y equipos para hacer ejercicio cuentan con podómetros integrados. La app de Salud y fitness usa los podómetros integrados a fin de calcular la cantidad de pasos que se dan. Esta función calcula la cantidad de calorías que quema el usuario en función de los pasos que da.

¿Puedes cambiar el nombre de las funciones, de los parámetros de las funciones y de las variables utilizados en este programa según las prácticas recomendadas?
     */
    val Steps = 4000
    val caloriesBurned = pedometerStepsToCalories(Steps);
    println("Walking $Steps steps burns $caloriesBurned calories")
//11. Movimiento del código duplicado a una función
 /*fun main() {
    println("City: Ankara")
    println("Low temperature: 27, High temperature: 31")
    println("Chance of rain: 82%")
    println()

    println("City: Tokyo")
    println("Low temperature: 32, High temperature: 36")
    println("Chance of rain: 10%")
    println()

    println("City: Cape Town")
    println("Low temperature: 59, High temperature: 64")
    println("Chance of rain: 2%")
    println()

    println("City: Guatemala City")
    println("Low temperature: 50, High temperature: 55")
    println("Chance of rain: 7%")
    println()
}
  */
    datosCiudad("Ankara",27,31,82);
}
fun add(firstNumber: Int,secondNumber:Int):Int{
    return firstNumber+secondNumber
}
fun subtract(firstNumber: Int,secondNumber:Int):Int{
    return firstNumber-secondNumber
}
fun displayAlertMessage(operatingSystem: String?="Unknown", emailId: String): String {
    val alertMessage = "There's a new sign-in request on $operatingSystem for your Google Account $emailId."

    return alertMessage
}
fun pedometerStepsToCalories(NumberOFStepS: Int): Double {
    val CaloriesBURNEDforEachStep = 0.04
    val TotalCALORIESburned = NumberOFStepS * CaloriesBURNEDforEachStep
    return TotalCALORIESburned
}
fun datosCiudad(nombre:String,temBaja:Int,temAlta:Int,Lluvia:Int){
    println("City: $nombre")
    println("Low temperature: $temBaja, High temperature: $temAlta")
    println("Chance of rain: $Lluvia%")
    println()

}