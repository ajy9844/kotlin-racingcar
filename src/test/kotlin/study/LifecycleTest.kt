package study

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class LifecycleTest {
    @BeforeEach
    fun init() {
        println("init")
    }

    @Test
    fun someTest() {
        println("someTest")
    }

    @Test
    fun anyTest() {
        println("anyTest")
    }

    @AfterEach
    fun tearDown() {
        println("tearDown")
    }

    companion object {
        @BeforeAll
        @JvmStatic
        fun initAll() {
            println("initAll")
        }

        @AfterAll
        @JvmStatic
        fun tearDownAll() {
            println("tearDownAll")
        }
    }
}
