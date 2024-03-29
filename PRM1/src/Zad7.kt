fun main(){

    fun checkMonthOneArg(month:String): String{
        when(month.lowercase()){
            "styczeń"  -> return "Semestr zimowy"
            "luty" -> return "Ferie"
            "marzec" -> return "Semestr letni"
            "kwiecień" -> return "Semestr letni"
            "maj" -> return "Semestr letni"
            "czerwiec" -> return "Semestr letni"
            "lipiec" -> return "Ferie"
            "sierpień" -> return "Ferie"
            "wrzesień" -> return "Ferie"
            "październik" -> return "Semestr zimowy"
            "listopad" -> return "Semestr zimowy"
            "grudzień" -> return "Semestr zimowy"
            else -> return "Nie ma takiego miesiąca"
        }
    }

    println("\u001b[31mOne Argument function \u001b[0m")
    println(checkMonthOneArg("styczeń"))
    println(checkMonthOneArg("luty"))
    println(checkMonthOneArg("Spaghetti"))



    fun checkMonth(vararg month:String): HashMap<Int,String>{

        val monthsMap = HashMap<Int, String> ()

        month.forEachIndexed { index, data ->
            when(data.lowercase()){
                "styczeń"  -> monthsMap.put(monthsMap.size,"Semestr zimowy")
                "luty" -> monthsMap.put(monthsMap.size,"Ferie")
                "marzec" -> monthsMap.put(monthsMap.size,"Semestr letni")
                "kwiecień" -> monthsMap.put(monthsMap.size,"Semestr letni")
                "maj" -> monthsMap.put(monthsMap.size,"Semestr letni")
                "czerwiec" -> monthsMap.put(monthsMap.size,"Semestr letni")
                "lipiec" -> monthsMap.put(monthsMap.size,"Ferie")
                "sierpień" -> monthsMap.put(monthsMap.size,"Ferie")
                "wrzesień" -> monthsMap.put(monthsMap.size,"Ferie")
                "październik" -> monthsMap.put(monthsMap.size,"Semestr zimowy")
                "listopad" -> monthsMap.put(monthsMap.size,"Semestr zimowy")
                "grudzień" -> monthsMap.put(monthsMap.size,"Semestr zimowy")
                else -> monthsMap.put(monthsMap.size,"Nie ma takiego miesiąca")
            }
        }
        return monthsMap
    }

    println("\u001b[31mMultiple Argument function\u001b[0m")
    println(checkMonth("styczeń"))
    println(checkMonth("luty"))
    println(checkMonth("Spaghetti"))
    println(checkMonth("styczeń","LUTY","MaRzeC","KwiecieŃ","Spaghetti","Spaghetti"))




}