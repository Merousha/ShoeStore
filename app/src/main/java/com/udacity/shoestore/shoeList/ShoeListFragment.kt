package com.udacity.shoestore.shoeList

import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoeListBinding
import com.udacity.shoestore.databinding.ShoeItemBinding

class ShoeListFragment : Fragment() {

    private lateinit var binding: FragmentShoeListBinding
    private val viewModel: ShoeListViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment using data binding
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_shoe_list,
            container,
            false
        )

        //Set a menu to this Fragment
        setHasOptionsMenu(true)

        addShoe()

        showShoeList()

        binding.shoeListViewModel = viewModel
        binding.lifecycleOwner = this

        return binding.root
    }

    /**
     * A method that navigates to shoe detail fragment. The shoe is added programmatically, therefore
     * navigating is all we need to do here
     */
    private fun addShoe() {
        binding.fabAddShoe.setOnClickListener {

            view?.findNavController()
                ?.navigate(ShoeListFragmentDirections.actionShoeListFragmentToShoeDetailFragment())
        }
    }

    /**
     * Observe the shoes variable for an update, if there is, inflate the list shoe layout,
     * set child view values with updated values and then add the view to the layout.
     */
    private fun showShoeList() {

        //Add observer to observe for update to the viewModel data
        viewModel.shoeList.observe(viewLifecycleOwner, Observer {

            viewModel.shoeList.value?.forEach {
                //Inflate new layout item for the last shoe entry

                val shoeLayoutBinding = ShoeItemBinding.inflate(
                    LayoutInflater.from(requireContext()),
                    binding.layoutListShoes,
                    false
                )

                //Add new layout item for the last shoe entry
                shoeLayoutBinding.textViewCompany.text = it.company
                shoeLayoutBinding.textViewName.text = it.name
                shoeLayoutBinding.textViewSize.text = it.size.toString()
                shoeLayoutBinding.textViewDescription.text = it.description
                shoeLayoutBinding.textViewSizeLabel.text =
                    getString(R.string.shoe_size)

                //Add the new layout element
                binding.layoutListShoes.addView(shoeLayoutBinding.root)
            }
        })
    }

    /**
     * Menu which contains logout will be visible on this screen only by setting visibility to true.
     */
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        menu.findItem(R.id.logout_menu)?.isVisible = true
    }
}
