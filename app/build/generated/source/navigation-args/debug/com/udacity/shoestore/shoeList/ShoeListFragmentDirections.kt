package com.udacity.shoestore.shoeList

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.udacity.shoestore.R

class ShoeListFragmentDirections private constructor() {
    companion object {
        fun actionShoeListFragmentToShoeDetailFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_shoeListFragment_to_shoeDetailFragment)

        fun actionShoeListFragmentToLoginFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_shoeListFragment_to_loginFragment)
    }
}
