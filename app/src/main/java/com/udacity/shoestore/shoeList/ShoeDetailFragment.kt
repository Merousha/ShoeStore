package com.udacity.shoestore.shoeList

import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoeDetailBinding

class ShoeDetailFragment : Fragment() {

    private lateinit var binding: FragmentShoeDetailBinding

    private val viewModel: ShoeListViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_shoe_detail,
            container,
            false
        )

        cancelAddShoe()

        addShoe()

        setHasOptionsMenu(false)

        binding.shoeListViewModel = viewModel
        return binding.root
    }

    /**
     * An action to navigate back to the shoe list screen and add a new Shoe to the Shoe View Model.
     */
    private fun addShoe() {
        binding.buttonSave.setOnClickListener {
            viewModel.addNewShoe(
                viewModel.shoeName,
                viewModel.shoeSize.toDouble(),
                viewModel.shoeCompany,
                viewModel.shoeDescription
            )
            view?.findNavController()?.navigateUp()
        }
    }

    /**
     * If cancel button is pressed, navigate user away from screen.
     */
    private fun cancelAddShoe() {
        binding.buttonCancel.setOnClickListener {
            view?.findNavController()?.navigateUp()
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