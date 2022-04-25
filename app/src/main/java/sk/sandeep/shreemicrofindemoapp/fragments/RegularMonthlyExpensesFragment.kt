package sk.sandeep.shreemicrofindemoapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.stepstone.stepper.Step
import com.stepstone.stepper.VerificationError
import sk.sandeep.shreemicrofindemoapp.R
import sk.sandeep.shreemicrofindemoapp.databinding.FragmentRegularMonthlyExpensesBinding
import sk.sandeep.shreemicrofindemoapp.models.OtherSourcesOfIncomePerAnnumModel
import sk.sandeep.shreemicrofindemoapp.models.RegularMonthlyExpensesModel


class RegularMonthlyExpensesFragment : Fragment(), Step {
    private lateinit var binding: FragmentRegularMonthlyExpensesBinding

    companion object {
        fun newInstance() = RegularMonthlyExpensesFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_regular_monthly_expenses,
            container,
            false
        )
        val model = ViewModelProvider(this).get(RegularMonthlyExpensesModel::class.java)


        model.food.value = 0
        model.utilities.value = 0
        model.transport.value = 0
        model.houseOrShopRent.value = 0
        model.clothing.value = 0
        model.medical.value = 0
        model.schoolFee.value = 0
        model.other.value = 0
        model.totalMonthlyExpenses.value = 0
        model.totalAnnualExpenses_d.value = 0

        binding.regularMonthlyModel = model


        model.food.observe(viewLifecycleOwner) { a ->
            val c1 = a
            model.utilities.observe(viewLifecycleOwner) { b ->
                val c2 = b + c1
                model.transport.observe(viewLifecycleOwner) { c ->
                    val c3 = c + c2
                    model.houseOrShopRent.observe(viewLifecycleOwner) { d ->
                        val c4 = d + c3
                        model.clothing.observe(viewLifecycleOwner) { e ->
                            val c5 = e + c4
                            model.medical.observe(viewLifecycleOwner) { f ->
                                val c6 = f + c5
                                model.schoolFee.observe(viewLifecycleOwner) { g ->
                                    val c7 = g + c6
                                    model.other.observe(viewLifecycleOwner) { h ->
                                        val c8 = h + c7
                                        model.totalMonthlyExpenses.observe(viewLifecycleOwner) { i ->
                                            binding.tvTotalAnnualExpensesD.text =
                                                (i + c8).toString()
                                        }
                                    }
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