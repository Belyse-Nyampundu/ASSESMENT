fun main(){
var result = names("rusizi","kigali")
    println(result)

    var even = numbers(1,2)
    println(even)

 var Africa = country("Rwanda","kenya")
    println(Africa)

 var calculator =Calculator(2,4,6)
    calculator.add(4,3)
    calculator.minus(8,7)
    calculator.divide(4,2)
    calculator.times(2,3)
}
//Write and invoke a function that takes in any 2 strings and returns the first
//character of the longer string or the first character of the first string if they are
//equal in length.
fun names(x: String,y: String): String {
    var name = x.indexOf("x")
    return x
}
//Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements
 fun numbers(num1: Int,num2: Int): Int {
     var number = arrayOf(1,2)
//    number.max()
//    number.min()
//    number.average()
     return number.max()
 }
//Write and call a function that takes in a string and splits it into all the
//characters that constitute it. Your function should print out this output.
 fun fruits(name1: String){
  println(sequenceOf(fruits))


 }

//Write and call a function that takes in an array of strings, joins them all into
//one string and returns it.

 fun country (name1: String,name2: String): String{
     var countries = arrayOf(name1,name2)
    return countries.contentToString()
 }
//5. Create a calculator class that is capable of the following functions:
//(i) Addition of any 2 numbers
//(ii) Subtraction between any 2 numbers
//(iii) Accurate division between any 2 numbers
//(iv) Multiplication of any 2 numbers
//Instantiate your calculator object and invoke all its functions
class Calculator(val x: Int,val y: Int, val z: Int){

    fun add(a: Int,b: Int){
        var adding = a+b
        println(adding)
    }
    fun minus(d: Int,e: Int){
        var substracting =d - e
        println(substracting)
    }
    fun divide (g: Int,h: Int){
        var dividing = g / h
        println(dividing)
    }
    fun times(k: Int,l: Int){
        var multiplying = k * l
        println(multiplying)
    }
}
