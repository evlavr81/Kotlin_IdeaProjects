package tictactoe

import java.util.*

fun main() {
    val fSize: Int = 3 //field size
    val fList = mutableListOf<MutableList<Char>> () // 2d field list
    var gameOver: Boolean = false
    val read = Scanner(System.`in`)
    // val numRange = ('1'..'3').toList()
    val numRange = "123"
    val bigRange = "0123456789"
    var gamerSymbol: Char = 'X'

    fun fillFieldList(input: String) {
        // output fill 2d list field
        for (i in 0..2 * fSize step fSize) {
            val fieldLine = mutableListOf<Char>()
            for (j in 0 until fSize) { //0..3,3..6,6..9
                fieldLine.add(input[j+i])
                // println(j+i)
            }
            // println(fieldLine)
            fList.add(fieldLine)
        }
    }

    fun drawFieldList(fList: MutableList<MutableList<Char>>){
        // output fill 2d list field
        println("---------")
        for (i in 0 until fSize){
            print("| ")
            for (j in 0 until fSize){
                if (fList[i][j] == '_') print("  ") else print("${fList[i][j]} ")
            }
            println("|")
        }
        println("---------")
    }

    fun isThreeInARow(fList: MutableList<MutableList<Char>>, symbol: Char): Boolean {
        var isThreeInARow = false
        var countSymbol = 0
        if (symbol == 'X' || symbol == 'O') {
            // Start horizontal check
            // println("********  Start horizontal check *********")
            for (i in 0 until fSize) {
                for (j in 0 until fSize) {
                    if (fList[i][j] == symbol) countSymbol++
                    if (countSymbol == 3) isThreeInARow = true
                    // print("[$i][$j]: count$symbol=$countSymbol | ")
                }
                countSymbol = 0
                // println()
            }
            // End horizontal check
            // Start vertical check
            // println("********  Start vertical check *********")
            for (i in 0 until fSize) {
                for (j in 0 until fSize) {
                    if (fList[j][i] == symbol) countSymbol++
                    if (countSymbol == 3) isThreeInARow = true
                    // print("[$j][$i]: count$symbol=$countSymbol | ")
                }
                countSymbol = 0
                // println()
            }
            // End vertical check
            // Start diagonal check
            // Direct search
            // println("********  Start diagonal direct search *********")
            for (i in 0 until fSize) {
                if (fList[i][i] == symbol) countSymbol++
                if (countSymbol == 3) isThreeInARow = true
                // print("[$i][$i]: count$symbol=$countSymbol | ")
            }
            countSymbol = 0
            // println()
            // Reverse search
            // println("********  Start diagonal REVERSE search *********")
            for (i in 0 until fSize) {
                if (fList[Math.abs(fSize - 1 - i)][i] == symbol) countSymbol++
                if (countSymbol == 3) isThreeInARow = true
                // print("[${Math.abs(fSize - 1 - i)}][$i]: count$symbol=$countSymbol | ")
            }
            countSymbol = 0
            // println()
            // End diagonal check
        }
        return isThreeInARow // Return result
    }

    fun hasEmptyCells(fList: MutableList<MutableList<Char>>): Boolean {
        var hasEmptyCells = false
        for (i in 0 until fSize) {
            for (j in 0 until fSize) {
                if (fList[i][j] == '_' || fList[i][j] == ' ') hasEmptyCells = true
            }
        }
        return hasEmptyCells // Return result
    }

    fun isDifferenceTwoOrMore(fList: MutableList<MutableList<Char>>): Boolean {
        var isDifferenceTwoOrMore = false
        var countX = 0
        var countO = 0
        for (i in 0 until fSize) {
            for (j in 0 until fSize) {
                if (fList[i][j] == 'X') countX++
                // print("[$i][$j] countX= $countX | ")
                if (fList[i][j] == 'O') countO++
                // println("[$i][$j] countO= $countO | ")
            }
        }
        if (Math.abs(countX - countO) >= 2) isDifferenceTwoOrMore = true
        // println("Abs(X-O)= ${Math.abs(countX - countO)} | ")
        return isDifferenceTwoOrMore // Return result
    }

    fun analyzeGameState(fList: MutableList<MutableList<Char>>): Boolean {
        if (isThreeInARow(fList, 'X') && isThreeInARow(fList, 'O')
            || isDifferenceTwoOrMore(fList)) {
            // when the grid has three X’s in a row as well as three O’s in a row,
            // or there are a lot more X's than O's or vice versa
            // (the difference should be 1 or 0;
            // if the difference is 2 or more,
            // then the game state is impossible).
            // println("X-row: ${ isThreeInARow(fList, 'X') }")
            // println("O-row: ${ isThreeInARow(fList, 'O') }")
            // println("Diff >= 2: ${ isDifferenceTwoOrMore(fList) }")
            println("Impossible")
            gameOver = true
        } else if(isThreeInARow(fList, 'X')){
            // when the grid has three X’s in a row.
            println("X wins")
            gameOver = true
        } else if(isThreeInARow(fList, 'O')){
            // when the grid has three O’s in a row.
            println("O wins")
            gameOver = true
        } else if(!isThreeInARow(fList, 'X') && !isThreeInARow(fList, 'O')
            && !hasEmptyCells(fList)){
            // when no side has a three in a row
            // and the grid has no empty cells.
            println("Draw")
            gameOver = true
        } else if (!isThreeInARow(fList, 'X') && !isThreeInARow(fList, 'O')
            && hasEmptyCells(fList)){
            // when neither side has three in a row
            // but the grid still has empty cells.
            println("Game not finished")
        } else {
            println("Some unexpected event happened!!!")
            gameOver = true
        }
        return gameOver
    }

    fun userTurn() {
        /*
        (1, 1) (1, 2) (1, 3)
        (2, 1) (2, 2) (2, 3)
        (3, 1) (3, 2) (3, 3)
        Analyze user input and show messages:
        1. if the cell is not empty:
        "This cell is occupied! Choose another one!"
        2. if the user enters non-numeric symbols in the coordinates input.
        "You should enter numbers!"
        3. if the user enters coordinates outside the game grid.
        "Coordinates should be from 1 to 3!"
         */
        var isInputCorrect = false
        while (!isInputCorrect){
            print("Enter the coordinates: ")
            val strInput = readln()
            val line = strInput[0]
            val coln = strInput[2]
            if (line !in bigRange || coln !in bigRange) {
                println("You should enter numbers!")
            } else if (line !in numRange || coln !in numRange) {
                println("Coordinates should be from 1 to 3!")
            } else if (fList[line.digitToInt() - 1][coln.digitToInt() - 1] == 'X'
                || fList[line.digitToInt() - 1][coln.digitToInt() - 1] == 'O') {
                println("This cell is occupied! Choose another one!")
                // println("There are symbol ${fList[line.toInt() - 1][coln.toInt() - 1]}")
            } else {
                fList[line.digitToInt() - 1][coln.digitToInt() - 1] = gamerSymbol
                isInputCorrect = true
            }
        }
    }

    fun gamerSymbolSwap(){
        when (gamerSymbol) {
            'X','x' -> gamerSymbol = 'O'
            'O','o' -> gamerSymbol = 'X'
        }
    }

    // 1. Prints an empty grid at the beginning of the game.
    var input: String = "         "
    fillFieldList(input)
    drawFieldList(fList)
    // 2. Creates a game loop where the program asks the user to enter the cell coordinates,
    while (!gameOver){
        userTurn()
        drawFieldList(fList)
        // analyzes the move for correctness and shows a grid with the changes if everything is okay.
        analyzeGameState(fList)
        gamerSymbolSwap()
    }
    // 3. Ends the game when someone wins or there is a draw.





}