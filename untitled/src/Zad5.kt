
fun main(){

    var productsMap = LinkedHashMap<String,Double>()
    productsMap["G Fuel"]= 149.99
    productsMap["Candy"]= 10.00
    productsMap["Coke Coke Cola"]= 5.99
    productsMap["Fantamentos"]= 100.00
    productsMap["Fries"]= 4.00
    productsMap["Ham"]= 9.00
    productsMap["Cheese"]= 4.50

    var iteratedProductsMap1 = productsMap.map { it.value to it.value*0.8}
    var iteratedProductsMap2 = productsMap.map { it.value *0.8}

    println(productsMap.forEach { (product, price) ->
        println("$product = $price")
    })








}