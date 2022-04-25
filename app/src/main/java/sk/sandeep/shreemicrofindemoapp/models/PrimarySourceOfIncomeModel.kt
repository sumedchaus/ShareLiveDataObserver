package sk.sandeep.shreemicrofindemoapp.models

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PrimarySourceOfIncomeModel : ViewModel() {
    val clientDaily: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val clientDWM: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val clientMWY: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val spouseDaily: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val spouseDWM: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val spouseMWY: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val unmarriedFM1Daily: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val unmarriedFM1DWM: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val unmarriedFM1MWY: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val unmarriedFM2Daily: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val unmarriedFM2DWM: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val unmarriedFM2MWY: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val unmarriedFM3Daily: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val unmarriedFM3DWM: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val unmarriedFM3MWY: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val clientAvg: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val spouseAvg: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val unmarriedFM1Avg: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val unmarriedFM2Avg: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val unmarriedFM3Avg: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val totalAnnualIncome: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
}


/*class PrimarySourceOfIncomeModel : ViewModel() {
    val clientDaily: MutableLiveData<Int> by lazy { MutableLiveData<Int>().apply { value =0} }
    val clientDWM: MutableLiveData<Int> by lazy { MutableLiveData<Int>().apply { value =0} }
    val clientMWY: MutableLiveData<Int> by lazy { MutableLiveData<Int>().apply { value =0} }
    val spouseDaily: MutableLiveData<Int> by lazy { MutableLiveData<Int>().apply { value =0} }
    val spouseDWM: MutableLiveData<Int> by lazy { MutableLiveData<Int>().apply { value =0} }
    val spouseMWY: MutableLiveData<Int> by lazy { MutableLiveData<Int>().apply { value =0} }
    val unmarriedFM1Daily: MutableLiveData<Int> by lazy { MutableLiveData<Int>().apply { value =0} }
    val unmarriedFM1DWM: MutableLiveData<Int> by lazy { MutableLiveData<Int>().apply { value =0} }
    val unmarriedFM1MWY: MutableLiveData<Int> by lazy { MutableLiveData<Int>().apply { value =0} }
    val unmarriedFM2Daily: MutableLiveData<Int> by lazy { MutableLiveData<Int>().apply { value =0} }
    val unmarriedFM2DWM: MutableLiveData<Int> by lazy { MutableLiveData<Int>().apply { value =0} }
    val unmarriedFM2MWY: MutableLiveData<Int> by lazy { MutableLiveData<Int>().apply { value =0} }
    val unmarriedFM3Daily: MutableLiveData<Int> by lazy { MutableLiveData<Int>().apply { value =0} }
    val unmarriedFM3DWM: MutableLiveData<Int> by lazy { MutableLiveData<Int>().apply { value =0} }
    val unmarriedFM3MWY: MutableLiveData<Int> by lazy { MutableLiveData<Int>().apply { value =0} }
    val clientAvg: MutableLiveData<Int> by lazy { MutableLiveData<Int>().apply { value =0} }
    val spouseAvg: MutableLiveData<Int> by lazy { MutableLiveData<Int>().apply { value =0} }
    val unmarriedFM1Avg: MutableLiveData<Int> by lazy { MutableLiveData<Int>().apply { value =0} }
    val unmarriedFM2Avg: MutableLiveData<Int> by lazy { MutableLiveData<Int>().apply { value =0} }
    val unmarriedFM3Avg: MutableLiveData<Int> by lazy { MutableLiveData<Int>().apply { value =0} }
}*/
