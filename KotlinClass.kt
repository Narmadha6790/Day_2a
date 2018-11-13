package day2

class Person(pname:String,page:Int) {
	
	//var name:String ="Rahul"
	//var age:Int=42
	//var gender:String="female"
	
	var name:String 
	var age:Int
var gender:String
	
	init{
		this.name=pname
		this.age=page
		this.gender="male"
		println("Objects are created")
	}
	constructor(pname:String,page:Int,gender:String):this(pname,page){
		
		this.name=pname
		this.age=page
		this.gender=gender
	}
	fun speak(){
		println("Hello")
	}
	
	fun greet(name:String)
	{
		println("hello $name")
	}
	
	fun getYearOfBirth():Int
	{
		return 2018-age
	}
	
	fun printDets(){
		println("the name is $name ag is $age and gender $gender")
	}
	
	
}
fun main(args:Array<String>)
{
	val person=Person("Kishan",17)
	person.printDets()
	//println(person.name)
	//println(person.age)
	//person.name="Rohit"
	//person.age=55
	//println(person.name)
	//println(person.age)
	person.speak()
	person.greet("Priya")
	println(person.getYearOfBirth())
	
}