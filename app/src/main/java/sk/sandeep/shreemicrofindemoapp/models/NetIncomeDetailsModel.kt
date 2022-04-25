package sk.sandeep.shreemicrofindemoapp.models

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NetIncomeDetailsModel : ViewModel() {
    val monthlyLoanRepaymentAmount: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
}