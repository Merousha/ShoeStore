package com.udacity.shoestore.instructions

import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentInstructionsBinding

/**
 * This Fragment displays a simple instruction on the usage of this app.
 */
class InstructionsFragment : Fragment() {

    private lateinit var binding: FragmentInstructionsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_instructions,
            container,
            false
        )
        showInstructions()
        navigateToNext()

        return binding.root
    }

    /**
     * Set text for textviews in Instructions fragment
     */
    private fun showInstructions() {
        binding.instructionTitle.text = getString(R.string.instructions)
        binding.instructionText.text = getString(R.string.instructions_text)
    }

    /**
     * Navigate to shoe list fragment when instructions button is clicked.
     */
    private fun navigateToNext() {
        binding.buttonInstructions.setOnClickListener {
            view?.findNavController()
                ?.navigate(InstructionsFragmentDirections.actionInstructionsFragmentToShoeListFragment())
        }
    }

    /**
     * Menu which contains logout will NOT be visible on this screen therefore setting visibility to
     * false.
     */
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.overflow_menu, menu)
        menu.findItem(R.id.logout_menu)?.isVisible = false
    }

}