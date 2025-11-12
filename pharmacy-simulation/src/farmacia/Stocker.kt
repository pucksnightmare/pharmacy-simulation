package farmacia

class Stocker(name: String) : Employee(name) {

    override fun work() {
        val products = listOf("analgésicos", "antibióticos", "vitaminas", "antiinflamatorios")
        try {
            for (i in 1..4) {
                val product = products.random()
                println("${employeeName} está reponiendo $product en el estante $i.")
                Thread.sleep(600)
            }
            println("${employeeName} ha terminado su turno como reponedor.")
        } catch (e: InterruptedException) {
            println("${employeeName} interrumpido mientras reponía.")
        }
    }
}
