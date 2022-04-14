fun main(){
    var account= Account("KCB120",234765, 2000)
    println(account)
    var withdraw= Account("KCB120",234765, 2000)
    println(account)
    details()
    Items(30, 1500)
    fruits()

}
class Account(var name:String, var accnum:Int, var balance:Int ){
  fun deposit(amount:Double):Double{
      var account=0
      for (amounts in account){
          account++
      }
     return account
  }
 fun withdraw(amount: Double):Double{
     var account=0
     for (amounts in account){
         account+-
     }
     return account
 }
    fun details(){
     println("$accnum with $balance is operated by teller 3")
 }
}
class SavingsAccount(var name:String, var accnum:Int, var balance:Int, var withdrawals:Int ){
    fun withdraw(){
//        when ( withdrawals >=4)
            if (withdrawals>4 ){
                println("dismiss")
            }else if (withdrawals>=4){
                println("accept")
            }else{
                println("successful withdrawal!")
            }
    }
}
data class Items(var weight:Int, var price:Int, var category: CharCategory){

    when
        category(hygiene){
            println("detergent measuring $weight costs $price")
        }

}
fun fruits(){
    var fruit = "banana"
    println(fruit[0]+ fruit.[2]+ fruit[4])
}
