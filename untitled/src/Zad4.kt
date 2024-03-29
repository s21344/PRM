import java.awt.Stroke


fun main(){





    val months = """Styczen , Luty , Marzec , Kwiecien , Maj , Czerwiec ,
        |Lipiec , Sierpien , Wrzesien , Pazdziernik , Listopad ,
        |Grudzien""".trimMargin()


//println(months)
    val monthsList = months.replace("\\s*".toRegex(),"").split(",").toList()


    val red = "\u001b[31m"
    val reset = "\u001b[0m"


    println(red +"Foreach ranges" + reset)
    for (i in 0..11){
        println(monthsList[i])
    }


    println(red +"Foreach starting on L" + reset)
    for (item:String in monthsList){
        if(item.startsWith("L"))
            println(item)
    }

    println(red +"forEachIndexed" + reset)
    monthsList.forEachIndexed { index, month ->
        if(index%2==0)
            println(month)
    }


    println(red +"While and Iterator" + reset)
    var monthsIterator = monthsList.iterator()

    while (monthsIterator.hasNext()){
        println(monthsIterator.next())
    }


    println(red +"joinToSTring" + reset)
    println(monthsList.joinToString("\n"))


    println(red +"foreach - starting on P + changing e to _" + reset)

    for (item:String in monthsList){
        if(!item.startsWith("L")){
            var tempItem:String = item
            for (sign:Char in tempItem){
                if (sign=='e')
                    print('_')
                else
                    print(sign)
            }
            println()
        }

    }
















}