package org.example.control_flow.condition

/**
 * Kasoo qaad waxaa ahayd cabitaanle
 * waxaa sameen rabtaa machine ka gada dadka cabitaanka.
 *
 * Machine-ka waa inuu qofka lacagta saxda ka qaadi karo
 * iyo dalabka qofka uu rabo kadib siin karo dalabka
 * haduu heli karo
 * hadii kalena usheego inuu heli karin.
 */
fun main() {

    val magacaCabitaanka = readln() // readln() waa hab aad qofka xogta ugu qaadeysid
    val lacagtaCabitaanka = 0.5
    val lacagtaMacmiilka = readln().toDouble()

    when (magacaCabitaanka) {
        // Hadii macmiilka lacagta saxda ah bixin
        // waxaa loo sheegi doonaa lacagta cabitaanka ku fadhiyo
        "furulaato" -> {
            if (lacagtaMacmiilka != lacagtaCabitaanka) {
                println("Macmiil lacagta $magacaCabitaanka waa $lacagtaCabitaanka")
            } else {
                println("Macmiil dalabkagii $magacaCabitaanka waa kan.")
            }
        }
        "cambe" -> {
            if (lacagtaMacmiilka != lacagtaCabitaanka) {
                println("Macmiil lacagta $magacaCabitaanka waa $lacagtaCabitaanka")
            } else {
                println("Macmiil dalabkagii $magacaCabitaanka waa kan.")
            }
        }
        "caana loos" -> {
            if (lacagtaMacmiilka != lacagtaCabitaanka) {
                println("Macmiil lacagta $magacaCabitaanka waa $lacagtaCabitaanka")
            } else {
                println("Macmiil dalabkagii $magacaCabitaanka waa kan.")
            }
        }
        "qare" -> {
            if (lacagtaMacmiilka != lacagtaCabitaanka) {
                println("Macmiil lacagta $magacaCabitaanka waa $lacagtaCabitaanka")
            } else {
                println("Macmiil dalabkagii $magacaCabitaanka waa kan.")
            }
        }
        else -> {
            // usheeg in dalaabkaas la heli karin
            println("Macmiilka dalabkaas lama heli karo.")
        }
    }

}