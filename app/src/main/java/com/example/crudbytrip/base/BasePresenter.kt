package com.example.crudbytrip.base

import com.example.crudbytrip.MainActivity
import com.example.crudbytrip.updatedelete.UpdateDeleteConstruct

interface BasePresenter<T> {
    fun onAttach(view: MainActivity)
    fun onDetach()
    fun onAttach(view: UpdateDeleteConstruct)
}