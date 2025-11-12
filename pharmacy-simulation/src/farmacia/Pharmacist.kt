package farmacia

class Pharmacist(name: String) : Employee(name) {

    override fun work() {
        val prescriptions = listOf("hipertensión", "diabetes", "alergias", "migraña")
        try {
            for (i in 1..4) {
                val recipe = prescriptions.random()
                println("${employeeName} está preparando una receta para $recipe. Etiquetando y verificando dosis...")
                Thread.sleep(700)
            }
            println("${employeeName} ha terminado su turno como farmacéutico.")
        } catch (e: InterruptedException) {
            println("${employeeName} interrumpido mientras preparaba recetas.")
        }
    }
}