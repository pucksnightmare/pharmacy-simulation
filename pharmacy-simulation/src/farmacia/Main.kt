package farmacia

fun main() {
    println("===== Simulación de un día en Farmacia 'Salud Total' =====")
    println("Horario: 10:00 a.m. a 10:00 p.m.\n")

    // Simular Turno 1: 10am–4pm
    println("=== Turno 1 (10:00 a.m. - 4:00 p.m.) ===")
    val ana = Cashier("Ana")
    val carlosTurno1 = Stocker("Carlos")

    val tAna = Thread(ana)
    val tCarlos1 = Thread(carlosTurno1)

    tAna.start()
    tCarlos1.start()

    tAna.join()
    tCarlos1.join()

    println("\nCambio de turno... (descanso simulado)")
    Thread.sleep(1000)

    // Simular Turno 2: 4pm–10pm
    println("\n=== Turno 2 (4:00 p.m. - 10:00 p.m.) ===")
    val luis = Pharmacist("Luis")
    val carlosTurno2 = Stocker("Carlos") // mismo empleado (nueva instancia para la simulación)

    val tLuis = Thread(luis)
    val tCarlos2 = Thread(carlosTurno2)

    tLuis.start()
    tCarlos2.start()

    tLuis.join()
    tCarlos2.join()

    println("\n===== Fin de la jornada en Farmacia 'Salud Total' =====")
}
