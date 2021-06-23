package com.udacity.shoestore.login

import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentLoginBinding


/**
 * This fragment is the landing screen, where a user needs o login. For now, login does nothing, both
 * Login and Register button navigates user to Welcome screen.
 */
class FragmentLogin : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentLoginBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_login,
            container,
            false
        )

        binding.buttonRegister.setOnClickListener {
            findNavController().navigate(R.id.welcomeFragment)
        }

        binding.buttonLogin.setOnClickListener {
            findNavController().navigate(R.id.welcomeFragment)
        }

        setHasOptionsMenu(false)

        return binding.root
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