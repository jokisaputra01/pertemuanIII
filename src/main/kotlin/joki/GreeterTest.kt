package id.ac.polbeng.joki.test_kelas

import id.ac.polbeng.joki.test_kelas.joki.Greeter

fun main() {
    val greeter = Greeter()
    greeter.greet()
    greeter.text = "Hi"
    greeter.greet("Anton")
    greeter.greet("Budi")
    greeter.text = "Hello programmer"
    println(greeter.with_ret_val("Dono"))
}