package sk.sandeep.shreemicrofindemoapp.models

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OtherSourcesOfIncomePerAnnumModel : ViewModel() {
    val remittance: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val rent: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val pension: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val govtTransfer: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val scholarship: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val other: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val selfReportIncome: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val totalOtherIncome: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }

//    val remittance = MutableLiveData(0)
//    val rent = MutableLiveData(0)
//    val pension = MutableLiveData(0)
//    val govtTransfer = MutableLiveData(0)
//    val scholarship = MutableLiveData(0)
//    val other = MutableLiveData(0)
//    val selfReportIncome = MutableLiveData(0)
//    val totalOtherIncome = MutableLiveData(0)



}

