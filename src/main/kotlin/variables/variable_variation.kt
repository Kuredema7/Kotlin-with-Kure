package org.example.variables

// fun: waxay u taagan tahay function.
// main(): waa magaca function-ka waana halka uu program-ka ka bilaabanaayo.
// {}: calaamadaas inta udhexeeso ama gudaheeda waa halka code-ka aan ku qori lahyn.
fun main() {
    // val: waa markaan ka dhigeeno variable-ka
    // inuu yahay mid aan wax laga bedali karin
    val numberOne = 9

    // compile error - sababtoo ah waa mid aan dib
    // wax loogu bedali karin (read-only)
    //numberOne = 2

    // var: waa markaan ka dhigeen variable-ka
    // mid wax laga bedali karo
    // ama qiimo kale la siin karo
    var numberTwo = 5

    // no error - sababtoo ah waa mid aan dib
    // wax ugu bedali karno (mutable)
    numberTwo = 3
}