package org.example.control_flow

fun main() {
    // Si uu noogu sahlanaado code-ka
    // waxaa sameyn doonna Da'da kaar walbo
    // uu u dhexeen karo, si hadhowti loo hubiyo
    // bukaanka da'diisa ku jirto taxanahaas
    val sanadkaKaarkaCaruurta = 3..15
    val sanadkaKaarkaDhalinyarada = 16..50
    val sanadkaKaarkaDadkaWeyn = 51..100

    val qiimahaKaarkaCaruurta = 5
    val qiimahaKaarkaDhalinyarada = 8

    val sanadkaBukaanka = 5

    when (sanadkaBukaanka) {
        in sanadkaKaarkaCaruurta -> println("Qiimaha kaarka waa $qiimahaKaarkaCaruurta")
        in sanadkaKaarkaDhalinyarada -> println("Qiimaha kaarka waa $qiimahaKaarkaDhalinyarada")
        in sanadkaKaarkaDadkaWeyn -> println("Kaarkaan waa bilaash.")
    }
}