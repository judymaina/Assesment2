fun main(){
var money=CurrentAccount(12345674,"WangariMary",200.5)
    money.deposit(10000.2)
   money.withdraw(2000.2)

//  println((fruit("pinnaple"))
}




//Create a classCurrentAccount with the following attributes:account
//number, account name, balance. It has the following functions:
//a.deposit(amount: Double) - Increments the balance by the
//amount deposited
//b.withdraw(amount: Double) - Decrements the balance by the
//amount withdrawn
//c.details() - Prints out the account number and balance and
//name in this format: “Account number x with balance y is
//operated by z
class CurrentAccount(var accountnumber:Int,var acountname:String,var balance:Double){
    fun deposit(amount:Double){
        balance+=amount
        println(balance)
}


fun withdraw(amount:Double){
    balance-=amount
    println(balance)
}
fun details(){
    print("account number12345674,with balance")
}


    }
//create another classSavingsAccount. It has the samefunctions and
//attributes as the current account except for one attribute,
//withdrawals: Int. Withdrawals is a counter variablethat is used to
//keep track of how many withdrawals have been made from the account
//in a year. The only other difference is that the savings account
//withdraw() method first checks if the number of withdrawalsis less
//than 4 for it to allow one to withdraw money from the account. It also
//increments the withdrawals attribute after a successful withdrawal
//(5points)
class SavingAccount(var accountnumber:Int,var acountname:String,var balance:Double){
    fun deposit(amount:Double){
        balance+=amount
        println(balance)
    }


    fun withdraw(amount:Int){
        balance-=amount
        println(balance)
}

//3.A product is represented by a data class with these attributes: name,
//weight, price, category. Category can either be groceries, hygiene or
//other. Write a function that takes in a product and uses a when
//statement to assign each product to a list based on its category
//(3 points)
//data class (var name:String,var weight:Double,var price:Int,var category:String)


//4.Write a function that given a string returns a string composed of only
//the characters in even indices. For example given “banana” it will return bnn (2points)



    fun fruit(word:String):String{
        var name=""
        for (letter in word){
            if (word.indexOf(letter)%2==0){
                name+=letter

            }
        }
        return name

    }
