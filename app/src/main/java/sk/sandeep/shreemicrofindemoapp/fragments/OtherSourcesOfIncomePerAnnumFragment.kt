package sk.sandeep.shreemicrofindemoapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.stepstone.stepper.Step
import com.stepstone.stepper.VerificationError
import sk.sandeep.shreemicrofindemoapp.R
import sk.sandeep.shreemicrofindemoapp.databinding.FragmentOtherSourcesOfIncomePerAnnumBinding
import sk.sandeep.shreemicrofindemoapp.models.OtherSourcesOfIncomePerAnnumModel


class OtherSourcesOfIncomePerAnnumFragment : Fragment(), Step {
    private lateinit var binding: FragmentOtherSourcesOfIncomePerAnnumBinding


    companion object {
        fun newInstance() = OtherSourcesOfIncomePerAnnumFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_other_sources_of_income_per_annum,
            container,
            false
        )
        val model = ViewModelProvider(this).get(OtherSourcesOfIncomePerAnnumModel::class.java)

        model.remittance.value = 0
        model.rent.value = 0
        model.pension.value = 0
        model.govtTransfer.value = 0
        model.scholarship.value = 0
        model.other.value = 0
        model.selfReportIncome.value = 0
        model.totalOtherIncome.value = 0

        binding.otherSourceModel = model
//        binding.lifecycleOwner = this


        model.remittance.observe(viewLifecycleOwner) { a ->
            val c1 = a
            model.rent.observe(viewLifecycleOwner) { b ->
                val c2 = b + c1
                model.pension.observe(viewLifecycleOwner) { c ->
                    val c3 = c + c2
                    model.govtTransfer.observe(viewLifecycleOwner) { d ->
                        val c4 = d + c3
                        model.scholarship.observe(viewLifecycleOwner) { e ->
                            val c5 = e + c4
                            model.other.observe(viewLifecycleOwner) { f ->
                                val c6 = f + c5
                                model.selfReportIncome.observe(viewLifecycleOwner) { g ->
                                    binding.totalOtherIncome.text = (g + c6).toString()

                                }
                            }
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