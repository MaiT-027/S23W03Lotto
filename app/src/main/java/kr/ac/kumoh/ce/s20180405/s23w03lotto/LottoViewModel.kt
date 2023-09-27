package kr.ac.kumoh.ce.s20180405.s23w03lotto

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class LottoViewModel : ViewModel() {
    private var _numbers = IntArray(6) {0}
    val numbers
        get() = _numbers

    fun generate() {
        _numbers = IntArray(6) {0}
        var num:Int
        for (i in _numbers.indices) {
            do {
                num = Random.nextInt(1,46)
            } while (_numbers.contains(num))
            _numbers[i] = num

            Log.i("Number!!!", _numbers[i].toString())
        }

        _numbers.sort()
    }
}