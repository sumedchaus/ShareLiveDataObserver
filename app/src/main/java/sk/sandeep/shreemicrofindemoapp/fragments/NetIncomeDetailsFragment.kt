package sk.sandeep.shreemicrofindemoapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.stepstone.stepper.Step
import com.stepstone.stepper.VerificationError
import sk.sandeep.shreemicrofindemoapp.R
import sk.sandeep.shreemicrofindemoapp.databinding.FragmentFamilyMembersBasicAmenitiesBinding
import sk.sandeep.shreemicrofindemoapp.databinding.FragmentNetIncomeDetailsBinding

class NetIncomeDetailsFragment : Fragment(),Step {
    private lateinit var binding: FragmentNetIncomeDetailsBinding


    companion object {
        fun newInstance() = NetIncomeDetailsFragment()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_net_income_details,
            container,
            false
        )
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