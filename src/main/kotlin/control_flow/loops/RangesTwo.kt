package control_flow.loops

fun main() {
    // Si lambarka ugu dambeyo loogu darin taxanaha
    // waxaa adeegsan doonnaa until(parameter) function
    // marka tirada dambe ma xisaabin doono 3-14 ku ekaan doonaa
    val sanadkaKaarkaCaruurta = (3).until(15)
    val sanadkaKaarkaDhalinyarada = (15).until(50)
    val sanadkaKaarkaDadkaWeyn = (50).until(110)

    val qiimahaKaarkaCaruurta = 5
    val qiimahaKaarkaDhalinyarada = 8

    val sanadkaBukaanka = 49

    val natiijadaKaarkaBukaan = when (sanadkaBukaanka) {
        in sanadkaKaarkaCaruurta -> "Qiimaha kaarka waa $qiimahaKaarkaCaruurta"
        in sanadkaKaarkaDhalinyarada -> "Qiimaha kaarka waa $qiimahaKaarkaDhalinyarada"
        in sanadkaKaarkaDadkaWeyn -> "Kaarkaan waa bilaash."
        else -> "Fadlan da' macquul ah sheeg"
    }

    println(natiijadaKaarkaBukaan)
}