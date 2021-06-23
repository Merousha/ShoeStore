package com.udacity.shoestore.shoeList

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.shoeList.models.Shoe

class ShoeListViewModel() : ViewModel() {

    //Temporary list for adding Shoe objects to
    private val _shoes: MutableList<Shoe> = mutableListOf()

    //MutableLiveDate for the Shoe list
    private val _shoeList = MutableLiveData<MutableList<Shoe>>()

    //Create the LiveData that will be observed by the Fragment
    val shoeList: LiveData<MutableList<Shoe>>
        get() = _shoeList

    //Holder values for list
    var shoeName: String  = ""
    var shoeCompany: String  = ""
    var shoeSize: String = ""
    var shoeDescription: String = ""


    /**
     * Shoe function called directly from SAVE button
     */
    fun addNewShoe(name: String, size: Double, company: String, desc: String) {
        val newShoe = Shoe(name, size, company, desc)
        //Add the Shoe to the temp. list
        _shoes.add(newShoe)
        //Add the values to the MutableLiveData
        _shoeList.value = _shoes

    }
}