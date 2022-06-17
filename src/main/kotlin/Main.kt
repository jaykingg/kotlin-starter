fun main(args: Array<String>) {
    println(printHello(1,2))
    printHello2(2,3)
    println(allocateValue())
    val triangleResult = triangleSum(1.0,2.0,2.0)
    println(triangleResult.result)
    println(ifFunction1(3))
    println(ifFunction2(5,2))
    forFunction()
    whileFunction()
}

fun printHello(a : Int, b : Int) : String {
    return (a+b).toString() + " Hello World kotlin"
}

fun printHello2(a : Int, b:Int) {
    println("$a 와 $b 의 합은 ${a+b}입니다.")
}

fun allocateValue() : String {
    val a : String = "static" // immutable
    // error => a = "nono"
    var b : String = "value" // mutable
    b = "changed value"
    return b;
}

class triangleSum(var v1 : Double, var v2 : Double, var v3 : Double) {
    var result = v1 + v2 + v3
}


fun ifFunction1(a : Int) : Int {
    val returnValue = 10;
    if(a < 5) {
        return a;
    }
    else {
        return returnValue;
    }
}

fun ifFunction2( a: Int, b: Int) : Int = if(a > b) a else b;

fun forFunction() {
    val array = listOf<String>("a","b","c","d")
    for(item in array) {
        println(item)
    }
}

fun whileFunction() {
    val array = arrayOf("1","2","3",4)

    var index = 0;
    while(index < array.size) {
        println(array[index])
        index++
    }
}




