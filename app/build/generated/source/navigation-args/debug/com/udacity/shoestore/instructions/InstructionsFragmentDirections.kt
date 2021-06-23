package com.udacity.shoestore.instructions

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.udacity.shoestore.R

class InstructionsFragmentDirections private constructor() {
    companion object {
        fun actionInstructionsFragmentToShoeListFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_instructionsFragment_to_shoeListFragment)
    }
}
