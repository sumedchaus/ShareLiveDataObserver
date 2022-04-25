package sk.sandeep.shreemicrofindemoapp.models

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RegularMonthlyExpensesModel : ViewModel() {

    val food: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val utilities: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val transport: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val houseOrShopRent: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val clothing: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val medical: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val other: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val schoolFee: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val totalMonthlyExpenses: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val totalAnnualExpenses_d: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
}


