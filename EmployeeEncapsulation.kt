package day2

class Employee {
	
	constructor(firstName:String,lastName:String,middleName:String){
	
		this.firstName=firstName
		this.lastName=lastName
		this.middleName=middleName	
	}
	
private	var firstName=""
	private var lastName=""
	private var middleName=""
	
	fun getFullName():String{
		return firstName +" " +middleName+" "+lastName
		
	}
	
	fun getReversName():String{
		return lastName + " " + middleName+ " "+firstName
	}
	
	public fun getFirstName():String{
		return this.firstName
	}
	
	public fun setFirstname(fname:String){
		this.firstName=fname
	}
}
fun main(args:Array<String>){
	var obj=Employee("Mrs","Narmadha","Raju")
	//obj.firstName="Mr"
	obj.setFirstname("MR")
	println(obj.getFirstName())
	println(obj.getFullName())
	println(obj.getReversName())
}