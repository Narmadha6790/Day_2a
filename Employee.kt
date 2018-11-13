class Employee(var employeename:String,var sala:Int){
    
    private var name:String=""
    private var salary:Int=0
    
    private var message:String="Hey"
    constructor(ename:String,sal:Int,mess:String):this(ename,sal)
    {
        this.name=ename
        this.salary=sal
        this.message=mess
    }
    
    
    fun printname()
    {
        print("name of the employee"+employeename+" salary"+salary+"message :"+message)
    }
}

fun main(args:Array<String>){
    val obj=Employee("Swetha",1000,"welcome")
    obj.printname()
}

