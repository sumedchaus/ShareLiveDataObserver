package sk.sandeep.shreemicrofindemoapp.models

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FamilyMembersBasicAmenitiesModel : ViewModel() {
    val totalFamilyMembers: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    val earningFamilyMembers: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
}

