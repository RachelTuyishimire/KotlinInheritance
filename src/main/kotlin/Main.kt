//Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//- carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
//- identity() : Prints out the color, make and model in the following
//format e.g: “I am a white subaru legacy”
//- calculateParkingFees(hours: Int) : Calculates and returns the
//parking fees by multiplying the hours by 20

fun main() {
var car = Car ("Hyundai", "Santa fe", "Black", 8)
    car.carry(9)
    car.identity()
    println(car.calculateParkingFees(3))

    var bus = Bus ("Toyota", "Altis", "Grey", 5)
    bus.carry(4)
    bus.identity()
   println(bus.maxTripFare(200.5))
    println(bus.calculateParkingFees(5))
}

open class Car(var make:String, var model:String, var color:String, var capacity:Int){
    fun carry(people:Int){
        var x = people - capacity
        if(people<=capacity)
        println("Carrying $people passengers")
        else
            println("Over capacity $x people")
    }
   open fun identity(){
        println("I am a $color $make $model")
    }
    open fun calculateParkingFees(hours:Int):Int{
        var get= (hours*20)
        return (get)
    }
}
//Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip.
class Bus(make:String,  model:String,  color:String,  capacity:Int): Car(make, model, color, capacity) {
    fun maxTripFare(fare: Double):Double{
        var maxCollected = capacity * fare
        return maxCollected
    }
    //The bus’ calculateParkingFees method returns the product of hours and
//the capacity of the bus
    override fun calculateParkingFees(hours: Int): Int {
        return hours * capacity
    }
    override fun identity() {
        println("I am a $color $make $model")
    }
}



