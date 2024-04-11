package org.example.functions

fun main() {
    cabitaanSamey()
}

fun cabitaanSamey() {
    println("Macmiil soo dhawoow")
    print("Dalabkaaga cabitaan iisheeg: ")
    val magacaCabitaanka = readln()

    val qiimahaCabitaanka = sooHelQiimahaCabitaanka(magacaCabitaanka)

    if (qiimahaCabitaanka != 0.0) {
        println("Qiimaha cabitaanka $magacaCabitaanka waa $$qiimahaCabitaanka")

        print("Geli lacagta: $")
        val qiimahaMacmiilka = readln().toDouble()

        if (hubiQiimahaCabitaanka(qiimahaCabitaanka, qiimahaMacmiilka)) {
            println("Macmiil dalabkaagi waa kan soo dhawoow :)")
        } else {
            println("Macmiil lacagta lagaa rabo waa $qiimahaCabitaanka")
        }

    } else {
        println("Macmiil dalaabkaaga lama helin.")
    }
}

fun hubiQiimahaCabitaanka(qiimahaCabitaanka: Double, qiimahaMacmiilka: Double): Boolean {
    return qiimahaCabitaanka == qiimahaMacmiilka
}

fun sooHelQiimahaCabitaanka(magacaCabitaanka: String): Double {
    return when (magacaCabitaanka) {
        "furulaato" -> 0.5
        "cambo seeko" -> 0.75
        "cambo caano" -> 0.75
        "cambo" -> 0.5
        "avocado" -> 0.75
        "mushakal" -> 0.5
        "liin" -> 0.25
        "qare" -> 0.25
        "caana loos" -> 0.75
        "caana timir" -> 0.5
        else -> 0.0 // oo ka dhigan in cabitaankaas la helin
    }
}
