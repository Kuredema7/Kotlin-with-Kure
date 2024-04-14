package org.example.control_flow.loops

fun main() {
    val tiradaPizzada = 20
    val qeybahaPizzada = 8

    for (pizzada in 1..tiradaPizzada) {

        for (qeybtaPizzada in 1..qeybahaPizzada) {
            println("pizza-da ${pizzada}aad qeybteeda ${qeybtaPizzada}aad")
        }

        println("------ ${pizzada}aad waa diyaar -----\n")
    }
}

/**
 * --- QEYB KA MID AH OUTPUT ----
 * pizza-da 20aad qeybteeda 1aad
 * pizza-da 20aad qeybteeda 2aad
 * pizza-da 20aad qeybteeda 3aad
 * pizza-da 20aad qeybteeda 4aad
 * pizza-da 20aad qeybteeda 5aad
 * pizza-da 20aad qeybteeda 6aad
 * pizza-da 20aad qeybteeda 7aad
 * pizza-da 20aad qeybteeda 8aad
 * ------ 20aad waa diyaar -----
 */