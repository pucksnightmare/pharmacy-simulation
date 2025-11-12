package farmacia

class Cashier(name: String) : Employee(name) {

    override fun work() {
        try {
            for (i in 1..5) { // atiende 5 clientes por turno
                println("${employeeName} está cobrando a un cliente por medicamentos antibióticos.")
                Thread.sleep(500)
            }
            println("${employeeName} ha terminado su turno como cajera.")
        } catch (e: InterruptedException) {
            println("${employeeName} interrumpida mientras cobraba.")
        }
    }
}