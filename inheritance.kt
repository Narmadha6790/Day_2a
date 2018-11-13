open class Person(age:Int,name:String){
    
    init{
        println("my name is "+name)
        println("my age is "+age)
    }
}

open class Manager(age:Int,name:String):Person(age,name){
    
    open fun printname()

    {
        println("In mangaer class")
    }
}

open class DeliveryHead(age:Int,name:String):Manager(age,name){
    override fun  printname(){
        println("In delivery head")
    }
}

fun main(args:Array<String>){
    val p1=DeliveryHead(44,"Prasad")
    
    p1.printname()
    
}
