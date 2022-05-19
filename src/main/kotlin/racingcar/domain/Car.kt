package racingcar.domain

import racingcar.constants.Message

/**
 * 차량의 데이터를 저장하는 데이터 클래스
 * Created by Jaesungchi on 2022.05.07..
 */
class Car(val name: String) {
    var position: Int = INIT_POSITION
        private set

    init {
        checkValidName(name)
    }

    fun playOneRound(forcedMovement: Boolean? = null) {
        val isCanGo = forcedMovement ?: Dice.rollDiceAndGetIsCanGo()
        position += if (isCanGo) POINT_MOVE else POINT_STOP
    }

    private fun checkValidName(name: String) {
        require(name.isNotBlank()) { Message.ExceptionMessage.CANNOT_NAME_BE_BLANK }
        require(name.length <= MAX_NAME_SIZE) { Message.ExceptionMessage.CANNOT_NAME_EXCEED_5_CHARACTERS }
    }

    companion object {
        private const val INIT_POSITION = 0
        private const val MAX_NAME_SIZE = 5
        private const val POINT_MOVE = 1
        private const val POINT_STOP = 0
    }
}