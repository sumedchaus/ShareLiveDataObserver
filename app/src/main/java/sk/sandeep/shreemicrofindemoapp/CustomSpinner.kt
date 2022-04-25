package sk.sandeep.shreemicrofindemoapp

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.Spinner


class CustomSpinner : LinearLayout {
    private lateinit var spinner: Spinner
    private lateinit var spinnerItems: List<SpinnerItem>
    private var spinnerAdapter: ArrayAdapter<SpinnerItem>? = null
    private var listenerSpinner: OnSpinnerItemSelectedListener? = null

    constructor(context: Context) : super(context) {
        init(context, null)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init(context, attrs)
    }

    private fun init(context: Context, attrs: AttributeSet?) {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.custom_spinner_view, this)
        spinner = view.findViewById(R.id.custom_spinner)

        spinner.onItemSelectedListener = (object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if (position < 0) {
                    listenerSpinner?.onItemSelected(SpinnerItem(0, ""))
                } else {
                    listenerSpinner?.onItemSelected(
                        spinnerAdapter?.getItem(position)
                            ?: SpinnerItem(0, "")
                    )
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        })
    }

    fun setItems(items: MutableList<SpinnerItem>, addDefaultItem: Boolean = true) {
        if (addDefaultItem) {
            val select = SpinnerItem(0, "Select")
            if (!items.contains(select)) {
                items.add(0, select)
            }
        }
        spinnerItems = items
        spinnerAdapter =
            ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item, spinnerItems)
        spinner.adapter = spinnerAdapter
    }

    val items get() = spinnerItems

    fun setOnItemSelectedListener(onSpinnerItemSelectedListener: OnSpinnerItemSelectedListener) {
        listenerSpinner = onSpinnerItemSelectedListener
    }

    fun getItemPosition(item: SpinnerItem) = spinnerAdapter?.getPosition(item) ?: -1

    fun getSelectedItemPosition() =
        spinner.selectedItemPosition - 1 //decreasing 1 to exclude 0 index

    fun setSelectedItem(position: Int) {
        if (position > -1) {
            spinner.setSelection(position)
        }
    }

    fun setSelectedItem(item: SpinnerItem) {
        val pos = getItemPosition(item)
        if (pos > -1) {
            spinner.setSelection(pos)
        }
    }

    override fun setEnabled(enabled: Boolean) {
        spinner.isEnabled = enabled
        super.setEnabled(enabled)
    }

    interface OnSpinnerItemSelectedListener {
        fun onItemSelected(selectedItem: SpinnerItem)
    }
}
