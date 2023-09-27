package kr.ac.kumoh.ce.s20180405.s23w03lotto

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class LottoViewModel : ViewModel() {
    private var _numbers = MutableLiveData<IntArray>(IntArray(6) {0})
    val numbers: LiveData<IntArray>
        get() = _numbers

    fun generate() {
        var num:Int
        val newNumbers = IntArray(6) {0}
        for (i in newNumbers.indices) {
            do {
                num = Random.nextInt(1,46)
            } while (newNumbers.contains(num))
            newNumbers[i] = num
        }

        newNumbers.sort()

        _numbers.value = newNumbers
    }
}