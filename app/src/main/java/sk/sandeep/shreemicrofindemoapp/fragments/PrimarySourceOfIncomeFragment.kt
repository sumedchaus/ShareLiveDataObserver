package sk.sandeep.shreemicrofindemoapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.stepstone.stepper.Step
import com.stepstone.stepper.VerificationError
import sk.sandeep.shreemicrofindemoapp.R
import sk.sandeep.shreemicrofindemoapp.databinding.FragmentPrimarySourceOfIncomeBinding
import sk.sandeep.shreemicrofindemoapp.models.PrimarySourceOfIncomeModel

/*
    val noOf2000: MutableLiveData<String> by lazy { MutableLiveData<String>() }


model.noOf2000.observe(viewLifecycleOwner, Observer<String> { s ->
            if (s.isBlank()) {
                model.sumOf2000.value = "0"
                updateTotal()
                return@Observer
            }

            model.sumOf2000.value = (s.toInt() * 2000).toString()
            updateTotal()
        })
* */
class PrimarySourceOfIncomeFragment : Fragment(), Step {

    private lateinit var binding: FragmentPrimarySourceOfIncomeBinding

    /*private val model: PrimarySourceOfIncomeModel by viewModels() {
        PrimarySourceOfIncomeFactory()
    }*/
    // var model: PrimarySourceOfIncomeModel by viewModels()

    companion object {
        fun newInstance() = PrimarySourceOfIncomeFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        //  val model = ViewModelProviders.of(this)[PrimarySourceOfIncomeModel::class.java]
        val model: PrimarySourceOfIncomeModel by activityViewModels()

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_primary_source_of_income,
            container,
            false
        )


        //  model = ViewModelProvider(this).get(PrimarySourceOfIncomeModel::class.java)


        model.clientDaily.value = 0
        model.clientDWM.value = 0
        model.clientMWY.value = 0
        model.clientAvg.value = 0

        model.spouseAvg.value = 0
        model.spouseDWM.value = 0
        model.spouseMWY.value = 0
        model.spouseDaily.value = 0

        model.unmarriedFM1Avg.value = 0
        model.unmarriedFM1Daily.value = 0
        model.unmarriedFM1DWM.value = 0
        model.unmarriedFM1MWY.value = 0

        model.unmarriedFM2Avg.value = 0
        model.unmarriedFM2Daily.value = 0
        model.unmarriedFM2DWM.value = 0
        model.unmarriedFM2MWY.value = 0

        model.unmarriedFM3Avg.value = 0
        model.unmarriedFM3Daily.value = 0
        model.unmarriedFM3DWM.value = 0
        model.unmarriedFM3MWY.value = 0
        model.totalAnnualIncome.value = 0
         binding.psoiModel = model

//        binding.psoiModel = model


        model.clientDaily.observe(viewLifecycleOwner) { a ->
            val c1 = a
            model.clientDWM.observe(viewLifecycleOwner) { b ->
                val c2 = b +c1
                model.clientMWY.observe(viewLifecycleOwner) { c ->
                    val c3 = c +c2
                    model.clientAvg.observe(viewLifecycleOwner) { d ->
                        binding.tvClientAvg.text = (d+c3).toString()
                    }
                }
            }
        }

        model.spouseDaily.observe(viewLifecycleOwner) { a ->
            val c1 = a
            model.spouseDWM.observe(viewLifecycleOwner) { b ->
                val c2 = b +c1
                model.spouseMWY.observe(viewLifecycleOwner) { c ->
                    val c3 = c +c2
                    model.spouseAvg.observe(viewLifecycleOwner) { d ->
                        binding.tvSpouseAvg.text = (d+c3).toString()
                    }
                }
            }
        }

        model.unmarriedFM1Daily.observe(viewLifecycleOwner) { a ->
            val c1 = a
            model.unmarriedFM1DWM.observe(viewLifecycleOwner) { b ->
                val c2 = b +c1
                model.unmarriedFM1MWY.observe(viewLifecycleOwner) { c ->
                    val c3 = c +c2
                    model.unmarriedFM1Avg.observe(viewLifecycleOwner) { d ->
                        binding.tvUnmarriedFM1Avg.text = (d+c3).toString()
                    }
                }
            }
        }

        model.unmarriedFM2Daily.observe(viewLifecycleOwner) { a ->
            val c1 = a
            model.unmarriedFM2DWM.observe(viewLifecycleOwner) { b ->
                val c2 = b +c1
                model.unmarriedFM2MWY.observe(viewLifecycleOwner) { c ->
                    val c3 = c +c2
                    model.unmarriedFM2Avg.observe(viewLifecycleOwner) { d ->
                        binding.tvUnmarriedFM2Avg.text = (d+c3).toString()
                    }
                }
            }
        }



//        model.unmarriedFM3Daily.observe(viewLifecycleOwner) { a ->
//            val c1 = a
//            model.unmarriedFM3DWM.observe(viewLifecycleOwner) { b ->
//                val c2 = b +c1
//                model.unmarriedFM3MWY.observe(viewLifecycleOwner) { c ->
//                    val c3 = c +c2
//                    model.unmarriedFM3Avg.observe(viewLifecycleOwner) { d ->
//                        binding.tvUnmarriedFM3Avg.text = (d+c3).toString()
//                    }
//                }
//            }
//        }

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