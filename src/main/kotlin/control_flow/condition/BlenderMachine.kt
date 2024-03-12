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
    val lacagtaCabitaanka = 0.5

    println("Macmiil soo dhawoow")
    print("Dalabkaaga cabitaan ii sheeg: ")
    val magacaCabitaanka = readln() // readln() waa hab aad qofka xogta ugu qaadeysid

    when (magacaCabitaanka) {
        // Hadii macmiilka lacagta saxda ah bixin
        // waxaa loo sheegi doonaa lacagta cabitaanka ku fadhiyo
        "furulaato" -> {
            println("Qiimaha $magacaCabitaanka waa $$lacagtaCabitaanka")
            print("Bixi biilka: $")
            val lacagtaMacmiilka = readln().toDouble()

            if (lacagtaMacmiilka != lacagtaCabitaanka) {
                println("Macmiil lacagta $magacaCabitaanka waa $lacagtaCabitaanka")
            } else {
                println("Macmiil dalabkagii $magacaCabitaanka waa kan.")
            }
        }
        "cambe" -> {
            println("Qiimaha $magacaCabitaanka waa $$lacagtaCabitaanka")
            print("Bixi biilka: $")
            val lacagtaMacmiilka = readln().toDouble()

            if (lacagtaMacmiilka != lacagtaCabitaanka) {
                println("Macmiil lacagta $magacaCabitaanka waa $lacagtaCabitaanka")
            } else {
                println("Macmiil dalabkagii $magacaCabitaanka waa kan.")
            }
        }
        "caana loos" -> {
            println("Qiimaha $magacaCabitaanka waa $$lacagtaCabitaanka")
            print("Bixi biilka: $")
            val lacagtaMacmiilka = readln().toDouble()

            if (lacagtaMacmiilka != lacagtaCabitaanka) {
                println("Macmiil lacagta $magacaCabitaanka waa $lacagtaCabitaanka")
            } else {
                println("Macmiil dalabkagii $magacaCabitaanka waa kan.")
            }
        }
        "qare" -> {
            println("Qiimaha $magacaCabitaanka waa $$lacagtaCabitaanka")
            print("Bixi biilka: $")
            val lacagtaMacmiilka = readln().toDouble()

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