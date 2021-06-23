package com.udacity.shoestore.shoeList

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.udacity.shoestore.R

class ShoeDetailFragmentDirections private constructor() {
    companion object {
        fun actionShoeDetailFragmentPopIncludingLoginFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_shoeDetailFragment_pop_including_loginFragment)
    }
}
