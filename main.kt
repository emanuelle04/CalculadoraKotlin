
fun main() {
  fun soma(n1:Float, n2:Float):Float{
    return n1+n2
  }
  fun sub(n1:Float, n2:Float):Float{
    return n1-n2
  }
  fun div(n1:Float, n2:Float):Float{
    return n1/n2
  }
 fun mult(n1:Float, n2:Float):Float{
   return n1*n2
  }
fun resto(n1:Float, n2:Float):Float{
    return n1%n2
  }

  var loop:Int = 1

  do{
    println("Defina a operação desejada:\ns+ Soma\ns- Subtracao\nd Divisão\nm Multiplicação\nr Resto\nX Sair da calculadora")
    var operador:String = readLine()!!.toString()
    if(operador == "X"){ break
    loop = 0 }
    println("Digite primeiro número: ")
    var a:String = readLine()!!.toString()
    var num1:Float = a.toFloat() 
    println("Digite o segundo número: ")
    var b:String = readLine()!!.toString()
    var num2:Float = b.toFloat()


    when{
    operador == "s+"-> {println(soma(num1, num2))}
    operador == "s-"-> {println(sub(num1, num2))}
    operador == "d"-> {println(div(num1, num2))}
    operador == "m"-> {println(mult(num1, num2))}
    operador == "r"-> {println(resto(num1, num2))}
    else -> {println("Operador inexistente!")}
    } 

  } while(loop == 1)
  
  

  }
  
