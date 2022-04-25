package sk.sandeep.shreemicrofindemoapp.models

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class IrregularExpensesOverLastOneYearModel : ViewModel() {

    val medical: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val houseRenovation: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val purchasedHouseHold: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val function: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val other: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val totalIrregularExpenses_e: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
}



