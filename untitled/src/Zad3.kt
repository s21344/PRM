const val original ="kot"

fun main(){
    var refs1="kot";
    var refs2="kot";
    var refered=original;


    if(refs1==original)
        println("Zmienna odpowiada stałej przy porównianiu strukturalnym ( == )")
    else
        println("Zmienna nie odpowiada stałej przy porównianiu strukturalnym ( == )")


    if(refs2===original)
        println("Zmienna odpowiada stałej przy porównianiu referencyjnym ( === )")
    else
        println("Zmienna nie odpowiada stałej przy porównianiu referencyjnym ( === )")



    if(refered===original)
        println("Zmienna zainicjowana stałą originals odpowiada stałej przy porównianiu referencyjnym ( === )")
    else
        println("Zmienna zainicjowana stałą originals NIE odposwiada stałej przy porównianiu referencyjnym ( === )")


    if(refs1 === refs2)
        println("Test 1 ")
    else
        println("Test 2")



    println("\n WNIOSKI")
    println("Wszystko w kotlinie to obiekty." +
            "Jak przypiszemy wartość to zmiennej to ta wartość jest także obiektem." +
            "Dlatego ma ten sam adres")

}

