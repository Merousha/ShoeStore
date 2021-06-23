package com.udacity.shoestore.welcome

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.udacity.shoestore.R

class WelcomeFragmentDirections private constructor() {
    companion object {
        fun actionWelcomeFragmentToInstructionsFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_welcomeFragment_to_instructionsFragment)
    }
}
