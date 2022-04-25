package sk.sandeep.shreemicrofindemoapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import com.stepstone.stepper.Step
import com.stepstone.stepper.VerificationError
import sk.sandeep.shreemicrofindemoapp.R
import sk.sandeep.shreemicrofindemoapp.databinding.FragmentIrregularExpensesOverLastOneYearBinding
import sk.sandeep.shreemicrofindemoapp.models.IrregularExpensesOverLastOneYearModel
import sk.sandeep.shreemicrofindemoapp.models.OtherSourcesOfIncomePerAnnumModel
import sk.sandeep.shreemicrofindemoapp.models.PrimarySourceOfIncomeModel


class IrregularExpensesOverLastOneYearFragment : Fragment(), Step {
    private lateinit var binding: FragmentIrregularExpensesOverLastOneYearBinding

    companion object {
        fun newInstance() = IrregularExpensesOverLastOneYearFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_irregular_expenses_over_last_one_year,
            container,
            false
        )

//        val model: IrregularExpensesOverLastOneYearModel by activityViewModels()
        val model = ViewModelProvider(this).get(IrregularExpensesOverLastOneYearModel::class.java)

        model.medical.value = 0
        model.houseRenovation.value = 0
        model.purchasedHouseHold.value = 0
        model.function.value = 0
        model.other.value = 0
        model.totalIrregularExpenses_e.value = 0

        binding.irregularModel = model

        model.medical.observe(viewLifecycleOwner) { a ->
            val c1 = a
            model.houseRenovation.observe(viewLifecycleOwner) { b ->
                val c2 = b + c1
                model.purchasedHouseHold.observe(viewLifecycleOwner) { c ->
                    val c3 = c + c2
                    model.function.observe(viewLifecycleOwner) { d ->
                        val c4 = d + c3
                        model.other.observe(viewLifecycleOwner) { e ->
                            binding.tvTotalIrregularExpensesE.text = (e + c4).toString()
                        }
                    }
                }
            }
        }


        return binding.root
    }

    override fun verifyStep(): VerificationError? {
        return null
    }

    override fun onSelected() {

    }

    override fun onError(error: VerificationError) {
        Toast.makeText(context, "Error", Toast.LENGTH_SHORT).show()
    }

}