package org.example.control_flow.loops

const val PIN = 4567

fun main() {
    // Si aan qofka u xadidno inta mar
    // uu isku dayi karo inuu PIN qaldan geliyo
    // waxaa siin doonnaa fursado cayiman
    var allowedAttempts = 3

    print("Soo geli PIN-kaaga: ")
    var userPIN = readln().toInt() // waa marka ugu horeso uu qofka soo geliyo PIN-ka

    // Waxaa la soconeynaa in PIN-ka lasoo geliyay
    // inuu saxan yahay iyo inuu khaldan yahay
    // si aan u xayirno kadib inta mar ee loo ogolyahay
    // inuu PIN khaldan ku celceliyo
    var isValidPIN = userPIN == PIN

    // Waxaa la weydiin doonaa inuu soo geliyo PIN
    // ilaa uu kasoo geliyo PIN sax ah iyo inta
    // loo ogolyahay inuu PIN-ka qaldan geliyo
    while (userPIN != PIN && allowedAttempts != 0) {
        // waxaa la socon doonnaa inta mar uu
        // PIN khaldan soo geliyo si aan go'aan ugu qaadano
        allowedAttempts--

        println("PIN-kaagu waa khalad")
        print("Fadlan soo geli PIN-kaaga saxda: ")
        userPIN = readln().toInt()

        // waa inaa hubino markastoo PIN khaldan soo geliyo
        isValidPIN = userPIN == PIN
    }

    // Waxaa go'aan ka qaadan doonna in account-ka
    // la xayiro iyo in loo gudbiyo system-ka
    if (isValidPIN) {
        println("Kusoo dhawoow account-kaaga")
    } else {
        println("Waa la xayiray account-kaaga.")
    }

}