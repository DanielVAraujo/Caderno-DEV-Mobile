fun main() {
  println("Digite Um Número Inteiro:")
  var num1: Int = readLine()?.toIntOrNull() ?: 0
  println("Digite Outro Número Inteiro:")
  var num2: Int = readLine()?.toIntOrNull() ?: 0
  var result = num1 + num2
  println("A Soma É:$result")

  val sub: Int= num1-num2
  println("A Subtração É: $sub")
  var mult:Int= num1*num2
  println("A Multiplicação É: $mult")

  var div:Int= num1/num2
  println("A Divisão É: $div")
}
