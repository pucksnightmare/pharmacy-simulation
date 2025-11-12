package farmacia

open class Employee(val employeeName: String) : Runnable {

    // Método común que las subclases deben redefinir (polimorfismo)
    open fun work() {
        println("$employeeName está trabajando.")
    }

    // run() llamado cuando el Thread arranca
    override fun run() {
        try {
            work()
        } catch (e: InterruptedException) {
            println("$employeeName fue interrumpido.")
        }
    }
}