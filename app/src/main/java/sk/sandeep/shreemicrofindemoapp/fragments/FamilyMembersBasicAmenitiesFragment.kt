package sk.sandeep.shreemicrofindemoapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.stepstone.stepper.Step
import com.stepstone.stepper.VerificationError
import sk.sandeep.shreemicrofindemoapp.R
import sk.sandeep.shreemicrofindemoapp.databinding.FragmentFamilyMembersBasicAmenitiesBinding
import sk.sandeep.shreemicrofindemoapp.models.FamilyMembersBasicAmenitiesModel


class FamilyMembersBasicAmenitiesFragment : Fragment(), Step {
    private lateinit var binding: FragmentFamilyMembersBasicAmenitiesBinding

    companion object {
        fun newInstance() = FamilyMembersBasicAmenitiesFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_family_members_basic_amenities,
            container,
            false
        )
                val model: FamilyMembersBasicAmenitiesModel by activityViewModels()

        model.totalFamilyMembers.value = 0
        model.earningFamilyMembers.value = 0

        binding.fmbAmenities = model

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