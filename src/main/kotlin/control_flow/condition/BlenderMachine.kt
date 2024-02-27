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

    val magacaCabitaanka = "furulaato"
    val lacagtaCabitaanka = 0.5
    val lacagtaMacmiilka = 0.25

    when (magacaCabitaanka) {
        "furulaato" -> {
            // usheeg dalaabkaas in la heli karo
        }
        "cambe" -> {}
        "caana loos" -> {}
        "qare" -> {}
        else -> {
            // usheeg in dalaabkaas la heli karin
        }
    }

    if (lacagtaMacmiilka == lacagtaCabitaanka) {
        // wuxuu ka gadaa cabitaanaka
    } else {
        // Hadii macmiilka lacagta saxda ah bixin
        // waxaa loo sheegi doonaa inuusan heysan lacag ku filan
    }

}