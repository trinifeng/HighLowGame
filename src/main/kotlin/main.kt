import kotlin.random.Random

fun main() {
    val number = Random.nextInt(0, 100)
    var count = 0

    print("Please enter your guess for the number: ")
    var guess = readln()!!.toInt()
    count++

    while(guess != number){
        if(guess > number){
            print("Your guess is too high. Please guess again: ")
        }
        else if(guess < number){
            print("Your guess is too low. Please guess again: ")
        }
        guess = readln()!!.toInt()
        count++
    }

    println("Congratulations! Your guess was correct. The number was $number. It took you $count guesses to get it right.")
}