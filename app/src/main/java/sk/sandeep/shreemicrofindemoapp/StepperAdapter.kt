package sk.sandeep.shreemicrofindemoapp

import android.content.Context
import androidx.fragment.app.FragmentManager
import com.stepstone.stepper.Step
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter
import sk.sandeep.shreemicrofindemoapp.fragments.*

class StepperAdapter(fm: FragmentManager?, context: Context?) :
    AbstractFragmentStepAdapter(fm!!, context!!) {

    override fun getCount(): Int {
        return 6
    }

    override fun createStep(position: Int): Step {
        return when (position) {
            0 -> FamilyMembersBasicAmenitiesFragment.newInstance()
            1 -> PrimarySourceOfIncomeFragment.newInstance()
            2 -> OtherSourcesOfIncomePerAnnumFragment.newInstance()
            3 -> RegularMonthlyExpensesFragment.newInstance()
            4 -> IrregularExpensesOverLastOneYearFragment.newInstance()
            5 -> NetIncomeDetailsFragment.newInstance()
            else -> throw IllegalArgumentException("Unsupported position: $position")
        }
    }
}
