package kot104.lab1.bai4

fun main(args: Array<String>) {
    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {                               // 1
        println("Yummy, it's a $cake cake!")
    }

}

//while and do-while

//fun eatACake() = println("Eat a Cake")
//fun bakeACake() = println("Bake a Cake")

//fun main(args: Array<String>) {
//    var cakesEaten = 0
//    var cakesBaked = 0

//    while (cakesEaten < 5) {                    // 1
//        eatACake()
//        cakesEaten ++
//    }

//    do {                                        // 2
//        bakeACake()
//        cakesBaked++
//    } while (cakesBaked < cakesEaten)

//}