package sk.sandeep.shreemicrofindemoapp

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.stepstone.stepper.StepperLayout
import com.stepstone.stepper.VerificationError
import sk.sandeep.shreemicrofindemoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), StepperLayout.StepperListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.stepperLayout.adapter = StepperAdapter(supportFragmentManager, this)
        binding.stepperLayout.setListener(this)
        binding.stepperLayout.setCompleteButtonEnabled(false)
    }

    override fun onCompleted(completeButton: View?) {
        Toast.makeText(this, "onCompleted!", Toast.LENGTH_SHORT).show()
    }

    override fun onError(verificationError: VerificationError?) {
        if (verificationError != null) {
            Toast.makeText(
                this,
                "onError! -> " + verificationError.errorMessage,
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    override fun onStepSelected(newStepPosition: Int) {
    }

    override fun onReturn() {
        finish()
    }
}