fun main(){

    val weekdays = mutableMapOf(1 to "Sunday", 2 to "Monday",3 to "Tuesday",4 to "Wednesday",5 to "Thursday",6 to "Friday",7 to "Saturday")

    for(i in weekdays){
        println(i)
    }
    for(i in 1..7){
        println(weekdays[i])
    }


}